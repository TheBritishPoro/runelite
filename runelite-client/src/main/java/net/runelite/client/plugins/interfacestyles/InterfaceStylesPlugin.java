/*
 * Copyright (c) 2018, Lotto <https://github.com/devLotto>
 * Copyright (c) 2018, Raqes <j.raqes@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.interfacestyles;

import com.google.common.eventbus.Subscribe;
import com.google.inject.Provides;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.SpriteID;
import net.runelite.api.SpritePixels;
import net.runelite.api.events.ConfigChanged;
import net.runelite.api.events.WidgetPositioned;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.game.SpriteManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.util.Images;

@Slf4j
@PluginDescriptor(
	name = "Interface Styles",
	enabledByDefault = false
)
public class InterfaceStylesPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private ClientThread clientThread;

	@Inject
	private InterfaceStylesConfig config;

	@Inject
	private SpriteManager spriteManager;

	@Provides
	InterfaceStylesConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(InterfaceStylesConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		clientThread.invokeLater(() ->
		{
			overrideSprites();
			overrideWidgetSprites();
			restoreWidgetDimensions();
			adjustWidgetDimensions();
		});
	}

	@Override
	protected void shutDown() throws Exception
	{
		clientThread.invokeLater(() ->
		{
			restoreWidgetDimensions();
			removeGameframe();
		});
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged config)
	{
		if (config.getGroup().equals("interfaceStyles"))
		{
			clientThread.invokeLater(() ->
			{
				removeGameframe();
				overrideSprites();
				overrideWidgetSprites();
				restoreWidgetDimensions();
				adjustWidgetDimensions();
			});
		}
	}

	@Subscribe
	public void onWidgetPositioned(WidgetPositioned widgetPositioned)
	{
		adjustWidgetDimensions();
	}

	private void overrideSprites()
	{
		Map<Integer, SpritePixels> overrides = new HashMap<>();

		for (SpriteOverride spriteOverride : SpriteOverride.values())
		{
			for (Skin skin : spriteOverride.getSkin())
			{
				if (skin == config.skin())
				{
					SpritePixels spritePixels = getFileSpritePixels(String.valueOf(spriteOverride.getSpriteID()), null);

					if (spriteOverride.getSpriteID() == SpriteID.COMPASS_TEXTURE)
					{
						client.setCompass(spritePixels);
					}
					else
					{
						overrides.put(spriteOverride.getSpriteID(), spritePixels);
					}
				}
			}
		}

		client.getSpriteOverrides().putAll(overrides);
	}

	private void overrideWidgetSprites()
	{
		Map<Integer, SpritePixels> widgetOverrides = new HashMap<>();

		for (WidgetOverride widgetOverride : WidgetOverride.values())
		{
			if (widgetOverride.getSkin() == config.skin())
			{
				SpritePixels spritePixels = getFileSpritePixels(widgetOverride.getName(), "widget");

				if (spritePixels != null)
				{
					for (WidgetInfo widgetInfo : widgetOverride.getWidgetInfo())
					{
						widgetOverrides.put(widgetInfo.getPackedId(), spritePixels);
					}
				}
			}
		}

		client.setWidgetSpriteOverrides(widgetOverrides);
	}

	private SpritePixels getFileSpritePixels(String file, String subfolder)
	{
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(config.skin().toString() + "/");

		if (subfolder != null)
		{
			stringBuilder.append(subfolder + "/");
		}

		stringBuilder.append(file + ".png");
		String filePath = stringBuilder.toString();

		try (InputStream inputStream = InterfaceStylesPlugin.class.getResourceAsStream(filePath))
		{
			log.debug("Loading: " + filePath);
			BufferedImage spriteImage = ImageIO.read(inputStream);
			return Images.getImageSpritePixels(client, spriteImage);
		}
		catch (IOException ex)
		{
			log.debug("Unable to load image: ", ex);
		}

		return null;
	}

	private void adjustWidgetDimensions()
	{
		for (WidgetOffset widgetOffset : WidgetOffset.values())
		{
			if (widgetOffset.getSkin() != config.skin())
			{
				continue;
			}

			Widget widget = client.getWidget(widgetOffset.getWidgetInfo());

			if (widget != null)
			{
				if (widgetOffset.getOffsetX() != null)
				{
					widget.setRelativeX(widgetOffset.getOffsetX());
				}

				if (widgetOffset.getOffsetY() != null)
				{
					widget.setRelativeY(widgetOffset.getOffsetY());
				}

				if (widgetOffset.getWidth() != null)
				{
					widget.setWidth(widgetOffset.getWidth());
				}

				if (widgetOffset.getHeight() != null)
				{
					widget.setHeight(widgetOffset.getHeight());
				}
			}
		}
	}

	private void restoreWidgetDimensions()
	{
		for (WidgetOffset widgetOffset : WidgetOffset.values())
		{
			Widget widget = client.getWidget(widgetOffset.getWidgetInfo());

			if (widget != null)
			{
				if (widgetOffset.isOriginalWidthAndHeight())
				{
					widget.setHeight(widget.getOriginalHeight());
					widget.setWidth(widget.getOriginalWidth());
				}

				if (widgetOffset.getOriginalX() != null)
				{
					widget.setRelativeX(widgetOffset.getOriginalX());
				}
				else
				{
					widget.setRelativeX(widget.getOriginalX());
				}

				if (widgetOffset.getOriginalY() != null)
				{
					widget.setRelativeY(widgetOffset.getOriginalY());
				}
				else
				{
					widget.setRelativeY(widget.getOriginalY());
				}
			}
		}
	}

	private void removeGameframe()
	{
		for (final SpriteOverride spriteOverride : SpriteOverride.values())
		{
			client.getSpriteOverrides().remove(spriteOverride.getSpriteID());
		}

		client.setWidgetSpriteOverrides(null);

		BufferedImage compassImage = spriteManager.getSprite(SpriteID.COMPASS_TEXTURE, 0);

		if (compassImage != null)
		{
			SpritePixels compass = Images.getImageSpritePixels(client, compassImage);
			client.setCompass(compass);
		}
	}
}