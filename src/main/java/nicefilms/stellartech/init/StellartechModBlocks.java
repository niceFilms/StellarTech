
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package nicefilms.stellartech.init;

import nicefilms.stellartech.block.LaptopoffBlock;
import nicefilms.stellartech.block.LaptopBlock;
import nicefilms.stellartech.block.HackertableBlock;
import nicefilms.stellartech.StellartechMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class StellartechModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, StellartechMod.MODID);
	public static final RegistryObject<Block> HACKERTABLE = REGISTRY.register("hackertable", () -> new HackertableBlock());
	public static final RegistryObject<Block> LAPTOP = REGISTRY.register("laptop", () -> new LaptopBlock());
	public static final RegistryObject<Block> LAPTOPOFF = REGISTRY.register("laptopoff", () -> new LaptopoffBlock());
}
