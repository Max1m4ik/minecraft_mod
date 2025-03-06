package com.mod.items;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class ModItems {
    public static final ExampleItem EXAMPLE_ITEM = new ExampleItem();

    public static void registerItems() {
        // Регистрируем предмет
        Registry.register(Registries.ITEM, Identifier.of("modid", "example_item"), EXAMPLE_ITEM);

        // Добавляем предмет в группу
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(EXAMPLE_ITEM);
        });
    }
}