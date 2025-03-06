package com.mod;

import com.mod.items.ExampleItem;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class mod implements ModInitializer {
	public static final Item EXAMPLE_ITEM = new ExampleItem(new Item.Settings());

	@Override
	public void onInitialize() {
		// Используйте Identifier.of вместо new Identifier
		Registry.register(Registries.ITEM, Identifier.of("modid", "example_item"), EXAMPLE_ITEM);
	}
}