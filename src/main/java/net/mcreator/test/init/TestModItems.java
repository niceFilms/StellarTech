
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.test.item.GlithcedingotItem;
import net.mcreator.test.item.CreativeblackholeItem;
import net.mcreator.test.item.CannedcornItem;
import net.mcreator.test.TestMod;

public class TestModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);
	public static final RegistryObject<Item> CANNEDCORN = REGISTRY.register("cannedcorn", () -> new CannedcornItem());
	public static final RegistryObject<Item> CREATIVEBLACKHOLE = REGISTRY.register("creativeblackhole", () -> new CreativeblackholeItem());
	public static final RegistryObject<Item> GLITHCEDINGOT = REGISTRY.register("glithcedingot", () -> new GlithcedingotItem());
}
