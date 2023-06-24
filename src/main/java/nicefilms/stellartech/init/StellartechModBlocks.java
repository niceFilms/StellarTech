
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package nicefilms.stellartech.init;

import nicefilms.stellartech.block.OutletBlock;
import nicefilms.stellartech.block.LaptopoffBlock;
import nicefilms.stellartech.block.LaptopBlock;
import nicefilms.stellartech.block.HackertableBlock;
import nicefilms.stellartech.block.GlithcedblockBlock;
import nicefilms.stellartech.block.CableXCBlock;
import nicefilms.stellartech.block.CableXBlock;
import nicefilms.stellartech.block.CableTXCCBlock;
import nicefilms.stellartech.block.CableTXCBlock;
import nicefilms.stellartech.block.CableTXBlock;
import nicefilms.stellartech.block.CableTCBlock;
import nicefilms.stellartech.block.CableTBlock;
import nicefilms.stellartech.block.CableSBlock;
import nicefilms.stellartech.block.CableLTCBlock;
import nicefilms.stellartech.block.CableLTBlock;
import nicefilms.stellartech.block.CableLCCBlock;
import nicefilms.stellartech.block.CableLCBlock;
import nicefilms.stellartech.block.CableLBlock;
import nicefilms.stellartech.block.CableIBlock;
import nicefilms.stellartech.block.CableFBlock;
import nicefilms.stellartech.block.CableEBlock;
import nicefilms.stellartech.block.CableBlock;
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
	public static final RegistryObject<Block> OUTLET = REGISTRY.register("outlet", () -> new OutletBlock());
	public static final RegistryObject<Block> GLITHCEDBLOCK = REGISTRY.register("glithcedblock", () -> new GlithcedblockBlock());
	public static final RegistryObject<Block> CABLE = REGISTRY.register("cable", () -> new CableBlock());
	public static final RegistryObject<Block> CABLE_E = REGISTRY.register("cable_e", () -> new CableEBlock());
	public static final RegistryObject<Block> CABLE_I = REGISTRY.register("cable_i", () -> new CableIBlock());
	public static final RegistryObject<Block> CABLE_L = REGISTRY.register("cable_l", () -> new CableLBlock());
	public static final RegistryObject<Block> CABLE_LC = REGISTRY.register("cable_lc", () -> new CableLCBlock());
	public static final RegistryObject<Block> CABLE_LCC = REGISTRY.register("cable_lcc", () -> new CableLCCBlock());
	public static final RegistryObject<Block> CABLE_LT = REGISTRY.register("cable_lt", () -> new CableLTBlock());
	public static final RegistryObject<Block> CABLE_LTC = REGISTRY.register("cable_ltc", () -> new CableLTCBlock());
	public static final RegistryObject<Block> CABLE_T = REGISTRY.register("cable_t", () -> new CableTBlock());
	public static final RegistryObject<Block> CABLE_TC = REGISTRY.register("cable_tc", () -> new CableTCBlock());
	public static final RegistryObject<Block> CABLE_TX = REGISTRY.register("cable_tx", () -> new CableTXBlock());
	public static final RegistryObject<Block> CABLE_TXC = REGISTRY.register("cable_txc", () -> new CableTXCBlock());
	public static final RegistryObject<Block> CABLE_TXCC = REGISTRY.register("cable_txcc", () -> new CableTXCCBlock());
	public static final RegistryObject<Block> CABLE_X = REGISTRY.register("cable_x", () -> new CableXBlock());
	public static final RegistryObject<Block> CABLE_XC = REGISTRY.register("cable_xc", () -> new CableXCBlock());
	public static final RegistryObject<Block> CABLE_F = REGISTRY.register("cable_f", () -> new CableFBlock());
	public static final RegistryObject<Block> CABLE_S = REGISTRY.register("cable_s", () -> new CableSBlock());
}
