package com.sg_stackables;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.Item;
import net.minecraft.item.Items;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sg_stackables implements ModInitializer {
	public static final String MOD_ID = "sg_stackables";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final Item[] itemsTo64 = new Item[] {
			Items.ENDER_PEARL,
			Items.EGG,
			Items.SNOWBALL,
			Items.BIRCH_BOAT,
			Items.OAK_BOAT,
			Items.SPRUCE_BOAT,
			Items.JUNGLE_BOAT,
			Items.ACACIA_BOAT,
			Items.DARK_OAK_BOAT,
			Items.MANGROVE_BOAT,
			Items.CHERRY_BOAT,
			Items.BAMBOO_RAFT,
			Items.BIRCH_CHEST_BOAT,
			Items.OAK_CHEST_BOAT,
			Items.SPRUCE_CHEST_BOAT,
			Items.JUNGLE_CHEST_BOAT,
			Items.ACACIA_CHEST_BOAT,
			Items.DARK_OAK_CHEST_BOAT,
			Items.MANGROVE_CHEST_BOAT,
			Items.CHERRY_CHEST_BOAT,
			Items.BAMBOO_CHEST_RAFT,
			Items.MINECART,
			Items.HOPPER_MINECART,
			Items.CHEST_MINECART,
			Items.FURNACE_MINECART,
			Items.TNT_MINECART,
			Items.SADDLE,
			Items.OAK_SIGN,
			Items.DARK_OAK_SIGN,
			Items.BIRCH_SIGN,
			Items.JUNGLE_SIGN,
			Items.ACACIA_SIGN,
			Items.SPRUCE_SIGN,
			Items.MANGROVE_SIGN,
			Items.CHERRY_SIGN,
			Items.BAMBOO_SIGN,
			Items.CRIMSON_SIGN,
			Items.WARPED_SIGN,
			Items.OAK_HANGING_SIGN,
			Items.DARK_OAK_HANGING_SIGN,
			Items.BIRCH_HANGING_SIGN,
			Items.JUNGLE_HANGING_SIGN,
			Items.ACACIA_HANGING_SIGN,
			Items.SPRUCE_HANGING_SIGN,
			Items.MANGROVE_HANGING_SIGN,
			Items.CHERRY_HANGING_SIGN,
			Items.BAMBOO_HANGING_SIGN,
			Items.CRIMSON_HANGING_SIGN,
			Items.WARPED_HANGING_SIGN,
			Items.WHITE_BED,
			Items.LIGHT_GRAY_BED,
			Items.GRAY_BED,
			Items.BLACK_BED,
			Items.BROWN_BED,
			Items.RED_BED,
			Items.ORANGE_BED,
			Items.YELLOW_BED,
			Items.LIME_BED,
			Items.GREEN_BED,
			Items.CYAN_BED,
			Items.LIGHT_BLUE_BED,
			Items.BLUE_BED,
			Items.PURPLE_BED,
			Items.MAGENTA_BED,
			Items.PINK_BED,
			Items.WHITE_BANNER,
			Items.LIGHT_GRAY_BANNER,
			Items.GRAY_BANNER,
			Items.BLACK_BANNER,
			Items.BROWN_BANNER,
			Items.RED_BANNER,
			Items.ORANGE_BANNER,
			Items.YELLOW_BANNER,
			Items.LIME_BANNER,
			Items.GREEN_BANNER,
			Items.CYAN_BANNER,
			Items.LIGHT_BLUE_BANNER,
			Items.BLUE_BANNER,
			Items.PURPLE_BANNER,
			Items.MAGENTA_BANNER,
			Items.PINK_BANNER,
			Items.BUCKET,
			Items.LAVA_BUCKET,
			Items.WATER_BUCKET,
			Items.MUSIC_DISC_13,
			Items.MUSIC_DISC_CAT,
			Items.MUSIC_DISC_BLOCKS,
			Items.MUSIC_DISC_CHIRP,
			Items.MUSIC_DISC_FAR,
			Items.MUSIC_DISC_MALL,
			Items.MUSIC_DISC_MELLOHI,
			Items.MUSIC_DISC_STAL,
			Items.MUSIC_DISC_STRAD,
			Items.MUSIC_DISC_WARD,
			Items.MUSIC_DISC_11,
			Items.MUSIC_DISC_CREATOR_MUSIC_BOX,
			Items.MUSIC_DISC_WAIT,
			Items.MUSIC_DISC_CREATOR,
			Items.MUSIC_DISC_PRECIPICE,
			Items.MUSIC_DISC_OTHERSIDE,
			Items.MUSIC_DISC_RELIC,
			Items.MUSIC_DISC_5,
			Items.MUSIC_DISC_PIGSTEP,
			Items.HONEY_BOTTLE,
			Items.SUSPICIOUS_STEW,
			Items.RABBIT_STEW,
			Items.BEETROOT_SOUP,
			Items.MUSHROOM_STEW,
			Items.TOTEM_OF_UNDYING,
			Items.FIELD_MASONED_BANNER_PATTERN,
			Items.BORDURE_INDENTED_BANNER_PATTERN,
			Items.FLOWER_BANNER_PATTERN,
			Items.CREEPER_BANNER_PATTERN,
			Items.SKULL_BANNER_PATTERN,
			Items.MOJANG_BANNER_PATTERN,
			Items.GLOBE_BANNER_PATTERN,
			Items.PIGLIN_BANNER_PATTERN,
			Items.FLOW_BANNER_PATTERN,
			Items.GUSTER_BANNER_PATTERN,
			Items.ENCHANTED_BOOK,
			Items.SHULKER_BOX,
			Items.WHITE_SHULKER_BOX,
			Items.LIGHT_GRAY_SHULKER_BOX,
			Items.GRAY_SHULKER_BOX,
			Items.BLACK_SHULKER_BOX,
			Items.BROWN_SHULKER_BOX,
			Items.RED_SHULKER_BOX,
			Items.ORANGE_SHULKER_BOX,
			Items.YELLOW_SHULKER_BOX,
			Items.LIME_SHULKER_BOX,
			Items.GREEN_SHULKER_BOX,
			Items.CYAN_SHULKER_BOX,
			Items.LIGHT_BLUE_SHULKER_BOX,
			Items.BLUE_SHULKER_BOX,
			Items.PURPLE_SHULKER_BOX,
			Items.MAGENTA_SHULKER_BOX,
			Items.PINK_SHULKER_BOX,
			Items.ARMOR_STAND,
			Items.POWDER_SNOW_BUCKET,
			Items.MILK_BUCKET
	};
	
	public static final Item[] itemsTo16 = new Item[]{
		Items.LINGERING_POTION,
		Items.SPLASH_POTION,
		Items.POTION,
	};

	@Override
	public void onInitialize() {
		registerStackChanges();
	}

	void registerStackChanges() {
		DefaultItemComponentEvents.MODIFY.register(context -> {
			for (int i = 0; i < itemsTo64.length; i++) {
				context.modify(itemsTo64[i], builder -> {
					builder.add(DataComponentTypes.MAX_STACK_SIZE, 64);
				});
			}
			for (int i = 0; i < itemsTo16.length; i++) {
				context.modify(itemsTo16[i], builder -> {
					builder.add(DataComponentTypes.MAX_STACK_SIZE, 16);
				});
			}
		});
	}
}