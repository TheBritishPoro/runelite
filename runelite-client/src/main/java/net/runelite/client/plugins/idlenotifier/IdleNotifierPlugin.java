/*
 * Copyright (c) 2016-2017, Abel Briggs
 * Copyright (c) 2017, Kronos <https://github.com/KronosDesign>
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
package net.runelite.client.plugins.idlenotifier;

import com.google.common.collect.ImmutableSet;
import com.google.common.eventbus.Subscribe;
import com.google.inject.Provides;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.AnimationID;
import static net.runelite.api.AnimationID.*;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.NPC;
import net.runelite.api.NPCComposition;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.Varbits;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.client.Notifier;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@PluginDescriptor(
	name = "Idle Notifier",
	description = "Send a notification when going idle, or when HP/Prayer reaches a threshold",
	tags = {"health", "hitpoints", "notifications", "prayer"}
)
public class IdleNotifierPlugin extends Plugin
{
	private static final int LOGOUT_WARNING_AFTER_TICKS = 14000; // 4 minutes and 40 seconds
	private static final Duration SIX_HOUR_LOGOUT_WARNING_AFTER_DURATION = Duration.ofMinutes(340);
	private static final Set<Integer> IDLE_ANIMATIONS = ImmutableSet
		.<Integer>builder()
		.add(
			/* Woodcutting */
			WOODCUTTING_BRONZE,
			WOODCUTTING_IRON,
			WOODCUTTING_STEEL,
			WOODCUTTING_BLACK,
			WOODCUTTING_MITHRIL,
			WOODCUTTING_ADAMANT,
			WOODCUTTING_RUNE,
			WOODCUTTING_DRAGON,
			WOODCUTTING_INFERNAL,
			WOODCUTTING_3A_AXE,
			/* Cooking(Fire, Range) */
			COOKING_FIRE,
			COOKING_RANGE,
			COOKING_WINE,
			/* Crafting(Gem Cutting, Glassblowing, Spinning, Battlestaves) */
			GEM_CUTTING_OPAL,
			GEM_CUTTING_JADE,
			GEM_CUTTING_REDTOPAZ,
			GEM_CUTTING_SAPPHIRE,
			GEM_CUTTING_EMERALD,
			GEM_CUTTING_RUBY,
			GEM_CUTTING_DIAMOND,
			CRAFTING_GLASSBLOWING,
			CRAFTING_SPINNING,
			CRAFTING_BATTLESTAVES,
			/* Fletching(Cutting, Stringing) */
			FLETCHING_BOW_CUTTING,
			FLETCHING_STRING_NORMAL_SHORTBOW,
			FLETCHING_STRING_OAK_SHORTBOW,
			FLETCHING_STRING_WILLOW_SHORTBOW,
			FLETCHING_STRING_MAPLE_SHORTBOW,
			FLETCHING_STRING_YEW_SHORTBOW,
			FLETCHING_STRING_MAGIC_SHORTBOW,
			FLETCHING_STRING_NORMAL_LONGBOW,
			FLETCHING_STRING_OAK_LONGBOW,
			FLETCHING_STRING_WILLOW_LONGBOW,
			FLETCHING_STRING_MAPLE_LONGBOW,
			FLETCHING_STRING_YEW_LONGBOW,
			FLETCHING_STRING_MAGIC_LONGBOW,
			/* Smithing(Anvil, Furnace, Cannonballs */
			SMITHING_ANVIL,
			SMITHING_SMELTING,
			SMITHING_CANNONBALL,
			/* Fishing */
			FISHING_NET,
			FISHING_BIG_NET,
			FISHING_HARPOON,
			FISHING_BARBTAIL_HARPOON,
			FISHING_DRAGON_HARPOON,
			FISHING_CAGE,
			FISHING_POLE_CAST,
			FISHING_INFERNAL_HARPOON,
			FISHING_OILY_ROD,
			FISHING_KARAMBWAN,
			FISHING_CRUSHING_INFERNAL_EELS,
			FISHING_BAREHAND,
			/* Mining(Normal) */
			MINING_BRONZE_PICKAXE,
			MINING_IRON_PICKAXE,
			MINING_STEEL_PICKAXE,
			MINING_BLACK_PICKAXE,
			MINING_MITHRIL_PICKAXE,
			MINING_ADAMANT_PICKAXE,
			MINING_RUNE_PICKAXE,
			MINING_DRAGON_PICKAXE,
			MINING_DRAGON_PICKAXE_ORN,
			MINING_INFERNAL_PICKAXE,
			MINING_3A_PICKAXE,
			/* Mining(Motherlode) */
			MINING_MOTHERLODE_BRONZE,
			MINING_MOTHERLODE_IRON,
			MINING_MOTHERLODE_STEEL,
			MINING_MOTHERLODE_BLACK,
			MINING_MOTHERLODE_MITHRIL,
			MINING_MOTHERLODE_ADAMANT,
			MINING_MOTHERLODE_RUNE,
			MINING_MOTHERLODE_DRAGON,
			MINING_MOTHERLODE_DRAGON_ORN,
			MINING_MOTHERLODE_INFERNAL,
			MINING_MOTHERLODE_3A,
			/* Herblore */
			HERBLORE_POTIONMAKING,
			HERBLORE_MAKE_TAR,
			/* Magic */
			MAGIC_CHARGING_ORBS,
			MAGIC_LUNAR_STRING_JEWELRY,
			MAGIC_LUNAR_BAKE_PIE,
			/* Prayer */
			USING_GILDED_ALTAR)
		.build();

	@Inject
	private Notifier notifier;

	@Inject
	private Client client;

	@Inject
	private IdleNotifierConfig config;

	private Instant lastAnimating;
	private Instant lastInteracting;
	private boolean notifyIdle = false;
	private boolean notifyHitpoints = true;
	private boolean notifyPrayer = true;
	private boolean notifyIdleLogout = true;
	private boolean notify6HourLogout = true;

	private Instant sixHourWarningTime;
	private boolean ready;

	@Provides
	IdleNotifierConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(IdleNotifierConfig.class);
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged gameStateChanged)
	{
		lastInteracting = null;

		GameState state = gameStateChanged.getGameState();

		switch (state)
		{
			case LOGGING_IN:
			case HOPPING:
			case CONNECTION_LOST:
				ready = true;
				break;
			case LOGGED_IN:
				if (ready)
				{
					sixHourWarningTime = Instant.now().plus(SIX_HOUR_LOGOUT_WARNING_AFTER_DURATION);
					ready = false;
				}
				break;
		}
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		final Player local = client.getLocalPlayer();
		final Duration waitDuration = Duration.ofMillis(config.getIdleNotificationDelay());

		if (client.getGameState() != GameState.LOGGED_IN || local == null || client.getMouseIdleTicks() < 10)
		{
			resetTimers();
			return;
		}

		if (checkIdleLogout())
		{
			notifier.notify("[" + local.getName() + "] is about to log out from idling too long!");
		}

		if (check6hrLogout())
		{
			notifier.notify("[" + local.getName() + "] is about to log out from being online for 6 hours!");
		}

		if (config.animationIdle() && checkAnimationIdle(waitDuration, local))
		{
			notifier.notify("[" + local.getName() + "] is now idle!");
		}

		if (config.combatIdle() && checkOutOfCombat(waitDuration, local))
		{
			notifier.notify("[" + local.getName() + "] is now out of combat!");
		}

		if (checkLowHitpoints())
		{
			notifier.notify("[" + local.getName() + "] has low hitpoints!");
		}

		if (checkLowPrayer())
		{
			notifier.notify("[" + local.getName() + "] has low prayer!");
		}
	}

	private boolean checkLowHitpoints()
	{
		if (config.getHitpointsThreshold() == 0)
		{
			return false;
		}
		if (client.getRealSkillLevel(Skill.HITPOINTS) > config.getHitpointsThreshold())
		{
			if (client.getBoostedSkillLevel(Skill.HITPOINTS) + client.getVar(Varbits.NMZ_ABSORPTION) <= config.getHitpointsThreshold())
			{
				if (!notifyHitpoints)
				{
					notifyHitpoints = true;
					return true;
				}
			}
			else
			{
				notifyHitpoints = false;
			}
		}

		return false;
	}

	private boolean checkLowPrayer()
	{
		if (config.getPrayerThreshold() == 0)
		{
			return false;
		}
		if (client.getRealSkillLevel(Skill.PRAYER) > config.getPrayerThreshold())
		{
			if (client.getBoostedSkillLevel(Skill.PRAYER) <= config.getPrayerThreshold())
			{
				if (!notifyPrayer)
				{
					notifyPrayer = true;
					return true;
				}
			}
			else
			{
				notifyPrayer = false;
			}
		}

		return false;
	}

	private boolean checkOutOfCombat(Duration waitDuration, Player local)
	{
		final Actor opponent = local.getInteracting();

		if (opponent != null)
		{
			// Reset last interaction time
			lastInteracting = null;

			final boolean isNpc = opponent instanceof NPC;

			// If player is interacting with NPC but his animation is thieving, do not set new opponent
			if (isNpc && local.getAnimation() != AnimationID.THIEVING_HUMAN)
			{
				final NPC npc = (NPC) opponent;
				final NPCComposition npcComposition = npc.getComposition();
				final List<String> npcMenuActions = Arrays.asList(npcComposition.getActions());

				if (npcMenuActions.contains("Attack"))
				{
					// Player is most likely in combat with attack-able NPC
					resetTimers();
					lastInteracting = Instant.now();
				}
			}
		}

		if (lastInteracting != null && Instant.now().compareTo(lastInteracting.plus(waitDuration)) >= 0)
		{
			lastInteracting = null;
			return true;
		}

		return false;
	}

	private boolean checkIdleLogout()
	{
		if (client.getMouseIdleTicks() > LOGOUT_WARNING_AFTER_TICKS
			&& client.getKeyboardIdleTicks() > LOGOUT_WARNING_AFTER_TICKS)
		{
			if (notifyIdleLogout)
			{
				notifyIdleLogout = false;
				return true;
			}
		}
		else
		{
			notifyIdleLogout = true;
		}

		return false;
	}

	private boolean check6hrLogout()
	{
		if (sixHourWarningTime == null)
		{
			return false;
		}

		if (Instant.now().compareTo(sixHourWarningTime) >= 0)
		{
			if (notify6HourLogout)
			{
				notify6HourLogout = false;
				return true;
			}
		}
		else
		{
			notify6HourLogout = true;
		}

		return false;
	}

	private boolean checkAnimationIdle(Duration waitDuration, Player local)
	{
		final int animation = local.getAnimation();

		if (IDLE_ANIMATIONS.contains(animation))
		{
			resetTimers();
			notifyIdle = true;
		}

		if (notifyIdle)
		{
			if (lastAnimating != null)
			{
				if (Instant.now().compareTo(lastAnimating.plus(waitDuration)) >= 0)
				{
					notifyIdle = false;
					lastAnimating = null;
					return true;
				}
			}
			else if (animation == IDLE)
			{
				lastAnimating = Instant.now();
			}
		}

		return false;
	}

	private void resetTimers()
	{
		// Reset animation idle timer
		notifyIdle = false;
		lastAnimating = null;

		// Reset combat idle timer
		lastInteracting = null;
	}
}
