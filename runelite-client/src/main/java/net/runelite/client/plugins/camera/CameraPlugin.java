/*
 * Copyright (c) 2018 Abex
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.camera;

import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;
import com.google.inject.Provides;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.events.ConfigChanged;
import net.runelite.api.events.ScriptCallbackEvent;
import net.runelite.api.events.WidgetMenuOptionClicked;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.menus.MenuManager;
import net.runelite.client.menus.WidgetMenuOption;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@PluginDescriptor(
	name = "Camera",
	description = "Configuration for the camera",
	tags = {"limit", "vertical"},
	enabledByDefault = false
)
@Slf4j
public class CameraPlugin extends Plugin
{
	private final WidgetMenuOption TOGGLE_FREE_CAMERA_OPTION = new WidgetMenuOption(
		"Toggle", "Free Camera", WidgetInfo.WORLD_MAP_OPTION);

	@Inject
	private Client client;

	@Inject
	private CameraConfig cameraConfig;

	@Inject
	private MenuManager menuManager;

	@Provides
	CameraConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(CameraConfig.class);
	}

	@Subscribe
	public void onScriptEvent(ScriptCallbackEvent event)
	{
		int[] intStack = client.getIntStack();
		int intStackSize = client.getIntStackSize();
		if (cameraConfig.outerLimit())
		{
			switch (event.getEventName())
			{
				case "fixedOuterZoomLimit":
					intStack[intStackSize - 1] = 95;
					break;
				case "resizableOuterZoomLimit":
					intStack[intStackSize - 1] = 70;
					break;
			}
		}
		if (cameraConfig.innerLimit())
		{
			switch (event.getEventName())
			{
				case "fixedInnerZoomLimit":
					intStack[intStackSize - 1] = 2100;
					break;
				case "resizableInnerZoomLimit":
					intStack[intStackSize - 1] = 2200;
					break;
			}
		}
		if (cameraConfig.outerLimit() || cameraConfig.innerLimit())
		{
			// This lets the options panel's slider have an exponential rate
			final double exponent = 3.d;
			switch (event.getEventName())
			{
				case "zoomLinToExp":
				{
					double range = intStack[intStackSize - 1];
					double value = intStack[intStackSize - 2];
					value = Math.pow(value / range, exponent) * range;
					intStack[intStackSize - 2] = (int) value;
					break;
				}
				case "zoomExpToLin":
				{
					double range = intStack[intStackSize - 1];
					double value = intStack[intStackSize - 2];
					value = Math.pow(value / range, 1.d / exponent) * range;
					intStack[intStackSize - 2] = (int) value;
					break;
				}
			}
		}
	}

	@Override
	protected void startUp()
	{
		client.setCameraPitchRelaxerEnabled(cameraConfig.relaxCameraPitch());

		if (cameraConfig.freeRoamCamera())
		{
			menuManager.addManagedCustomMenu(TOGGLE_FREE_CAMERA_OPTION);
		}
	}

	@Override
	protected void shutDown()
	{
		client.setCameraPitchRelaxerEnabled(false);
		menuManager.removeManagedCustomMenu(TOGGLE_FREE_CAMERA_OPTION);
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged ev)
	{
		client.setCameraPitchRelaxerEnabled(cameraConfig.relaxCameraPitch());

		if (cameraConfig.freeRoamCamera())
		{
			menuManager.addManagedCustomMenu(TOGGLE_FREE_CAMERA_OPTION);
		}
		else
		{
			menuManager.removeManagedCustomMenu(TOGGLE_FREE_CAMERA_OPTION);
		}
	}

	@Subscribe
	public void onWidgetMenuOptionClicked(final WidgetMenuOptionClicked event)
	{
		if (event.getWidget() != WidgetInfo.WORLD_MAP_OPTION)
		{
			return;
		}

		if (event.getMenuOption().equals(TOGGLE_FREE_CAMERA_OPTION.getMenuOption()) &&
			event.getMenuTarget().equals(TOGGLE_FREE_CAMERA_OPTION.getMenuTarget()))
		{
			// Invert orb enabled state for free roam camera
			final boolean enabled = client.getOculusOrbState() == 1;
			final boolean inverted = !enabled;
			client.setOculusOrbNormalSpeed(inverted ? 36 : 12);
			client.setOculusOrbState(inverted ? 1 : 0);
		}
	}
}