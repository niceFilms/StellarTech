
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package nicefilms.stellartech.init;

import nicefilms.stellartech.item.USBstickItem;
import nicefilms.stellartech.item.GlithcedingotItem;
import nicefilms.stellartech.item.GlithcedUSBItem;
import nicefilms.stellartech.item.CreativeblackholeItem;
import nicefilms.stellartech.item.CannedcornItem;
import nicefilms.stellartech.StellartechMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class StellartechModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, StellartechMod.MODID);
	public static final RegistryObject<Item> CANNEDCORN = REGISTRY.register("cannedcorn", () -> new CannedcornItem());
	public static final RegistryObject<Item> CREATIVEBLACKHOLE = REGISTRY.register("creativeblackhole", () -> new CreativeblackholeItem());
	public static final RegistryObject<Item> GLITHCEDINGOT = REGISTRY.register("glithcedingot", () -> new GlithcedingotItem());
	public static final RegistryObject<Item> HACKERTABLE = block(StellartechModBlocks.HACKERTABLE);
	public static final RegistryObject<Item> US_BSTICK = REGISTRY.register("us_bstick", () -> new USBstickItem());
	public static final RegistryObject<Item> LAPTOPOFF = block(StellartechModBlocks.LAPTOPOFF);
	public static final RegistryObject<Item> LAPTOP = block(StellartechModBlocks.LAPTOP);
	public static final RegistryObject<Item> GLITHCED_USB = REGISTRY.register("glithced_usb", () -> new GlithcedUSBItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
