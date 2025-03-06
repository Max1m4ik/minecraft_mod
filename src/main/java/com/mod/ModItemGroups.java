package com.mod;

import com.mod.items.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MY_MOD_GROUP = FabricItemGroup.builder()
            .displayName(Text.literal("My Mod Group")) // Название группы
            .icon(() -> new ItemStack(ModItems.EXAMPLE_ITEM)) // Иконка группы
            .build();
}