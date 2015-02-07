package com.momnop.simplypaths.items;

import com.momnop.simplypaths.blocks.SimplyPathsBlocks;
import com.momnop.simplypaths.config.ConfigHandler;
import com.momnop.simplypaths.info.ItemInfo;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class SimplyPathsItems {
	public static Item pathChisel, conveyorWrench;

	public static void load() {
		conveyorWrench = new ItemConveyorWrench(ItemInfo.CONVEYOR_WRENCH_UNLOCALIZED_NAME);
		
		if (ConfigHandler.pathChisel == true) {
			pathChisel = new ItemPathChisel(
					ItemInfo.PATH_CHISEL_UNLOCALIZED_NAME);
		}
		registerItems();
	}

	public static void registerItems() {
		registerItem(conveyorWrench);
		
		if (ConfigHandler.pathChisel == true) {
			registerItem(pathChisel);
		}
	}

	public static void registerItem(Item i) {
		GameRegistry.registerItem(i, i.getUnlocalizedName().substring(5));
	}
}