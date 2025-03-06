package com.mod;

import net.fabricmc.api.ModInitializer;
import com.mod.items.ModItems;
import net.fabricmc.api.ModInitializer;

public class mod implements ModInitializer {
	@Override
	public void onInitialize() {
		ModItems.registerItems(); // Регистрируем предметы
	}
}