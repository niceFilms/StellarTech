
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package nicefilms.stellartech.init;

import nicefilms.stellartech.item.GlithcedingotItem;
import nicefilms.stellartech.item.CreativeblackholeItem;
import nicefilms.stellartech.item.CannedcornItem;
import nicefilms.stellartech.StellartechMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class StellartechModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, StellartechMod.MODID);
	public static final RegistryObject<Item> CANNEDCORN = REGISTRY.register("cannedcorn", () -> new CannedcornItem());
	public static final RegistryObject<Item> CREATIVEBLACKHOLE = REGISTRY.register("creativeblackhole", () -> new CreativeblackholeItem());
	public static final RegistryObject<Item> GLITHCEDINGOT = REGISTRY.register("glithcedingot", () -> new GlithcedingotItem());
}
