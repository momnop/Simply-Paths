package com.momnop.simplypaths;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

import org.lwjgl.input.Keyboard;

import com.momnop.simplypaths.blocks.SimplyPathsBlocks;

import java.util.List;

public class TooltipHelper
{
	
    public static void addExtraInformationTooltip(String information, List list)
    {
        if (!Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) && !Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            list.add(EnumChatFormatting.ITALIC + "" + EnumChatFormatting.WHITE + StatCollector.translateToLocal("item.tooltip.holdShift"));
        }
        else
        {
            list.add(EnumChatFormatting.WHITE + StatCollector.translateToLocal(information));
        }
    }
    
    public static void addExtraInformationTooltip2(String information1, String information2, List list)
    {
        if (!Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) && !Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            list.add(EnumChatFormatting.ITALIC + "" + EnumChatFormatting.WHITE + StatCollector.translateToLocal("item.tooltip.holdShift"));
        }
        else
        {
            list.add(EnumChatFormatting.WHITE + StatCollector.translateToLocal(information1));
            list.add(EnumChatFormatting.WHITE + StatCollector.translateToLocal(information2));
        }
    }
    
    public static void addExtraInformationTooltip(String informationPrimary, String informationSecondary, List list)
    {
        if (!Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) && !Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            list.add(EnumChatFormatting.ITALIC + "" + EnumChatFormatting.WHITE + StatCollector.translateToLocal("item.tooltip.holdShift"));
        }
        else
        {
            list.add(EnumChatFormatting.WHITE + StatCollector.translateToLocal(informationPrimary));
            list.add(EnumChatFormatting.WHITE + StatCollector.translateToLocal(informationSecondary));
        }
    }
    
    public static void addExtraInformationTooltip(String informationPrimary, String informationSecondary1, String informationSecondary2, List list)
    {
        if (!Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) && !Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            list.add(EnumChatFormatting.ITALIC + "" + EnumChatFormatting.WHITE + StatCollector.translateToLocal("item.tooltip.holdShift"));
        }
        else
        {
            list.add(EnumChatFormatting.WHITE + StatCollector.translateToLocal(informationPrimary));
            list.add(EnumChatFormatting.WHITE + StatCollector.translateToLocal(informationSecondary1));
            list.add(EnumChatFormatting.WHITE + StatCollector.translateToLocal(informationSecondary2));
        }
    }
    
    public static void addVariantTooltip(ItemStack itemStack, Block comparedBlock, String informationPrimary, List info) {
    	if (itemStack.getItem() == Item.getItemFromBlock(comparedBlock)) {
			info.add(EnumChatFormatting.WHITE + StatCollector.translateToLocal("item.tooltip.variant") + EnumChatFormatting.GRAY + " " + StatCollector.translateToLocal(informationPrimary));
		}
    }
}