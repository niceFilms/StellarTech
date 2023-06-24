
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package nicefilms.stellartech.init;

import nicefilms.stellartech.block.entity.OutletBlockEntity;
import nicefilms.stellartech.block.entity.LaptopoffBlockEntity;
import nicefilms.stellartech.block.entity.LaptopBlockEntity;
import nicefilms.stellartech.block.entity.CableXCBlockEntity;
import nicefilms.stellartech.block.entity.CableXBlockEntity;
import nicefilms.stellartech.block.entity.CableTXCCBlockEntity;
import nicefilms.stellartech.block.entity.CableTXCBlockEntity;
import nicefilms.stellartech.block.entity.CableTXBlockEntity;
import nicefilms.stellartech.block.entity.CableTCBlockEntity;
import nicefilms.stellartech.block.entity.CableTBlockEntity;
import nicefilms.stellartech.block.entity.CableSBlockEntity;
import nicefilms.stellartech.block.entity.CableLTCBlockEntity;
import nicefilms.stellartech.block.entity.CableLTBlockEntity;
import nicefilms.stellartech.block.entity.CableLCCBlockEntity;
import nicefilms.stellartech.block.entity.CableLCBlockEntity;
import nicefilms.stellartech.block.entity.CableLBlockEntity;
import nicefilms.stellartech.block.entity.CableIBlockEntity;
import nicefilms.stellartech.block.entity.CableFBlockEntity;
import nicefilms.stellartech.block.entity.CableEBlockEntity;
import nicefilms.stellartech.block.entity.CableBlockEntity;
import nicefilms.stellartech.StellartechMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class StellartechModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, StellartechMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> LAPTOP = register("laptop", StellartechModBlocks.LAPTOP, LaptopBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LAPTOPOFF = register("laptopoff", StellartechModBlocks.LAPTOPOFF, LaptopoffBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OUTLET = register("outlet", StellartechModBlocks.OUTLET, OutletBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE = register("cable", StellartechModBlocks.CABLE, CableBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_E = register("cable_e", StellartechModBlocks.CABLE_E, CableEBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_I = register("cable_i", StellartechModBlocks.CABLE_I, CableIBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_L = register("cable_l", StellartechModBlocks.CABLE_L, CableLBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_LC = register("cable_lc", StellartechModBlocks.CABLE_LC, CableLCBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_LCC = register("cable_lcc", StellartechModBlocks.CABLE_LCC, CableLCCBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_LT = register("cable_lt", StellartechModBlocks.CABLE_LT, CableLTBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_LTC = register("cable_ltc", StellartechModBlocks.CABLE_LTC, CableLTCBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_T = register("cable_t", StellartechModBlocks.CABLE_T, CableTBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_TC = register("cable_tc", StellartechModBlocks.CABLE_TC, CableTCBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_TX = register("cable_tx", StellartechModBlocks.CABLE_TX, CableTXBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_TXC = register("cable_txc", StellartechModBlocks.CABLE_TXC, CableTXCBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_TXCC = register("cable_txcc", StellartechModBlocks.CABLE_TXCC, CableTXCCBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_X = register("cable_x", StellartechModBlocks.CABLE_X, CableXBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_XC = register("cable_xc", StellartechModBlocks.CABLE_XC, CableXCBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_F = register("cable_f", StellartechModBlocks.CABLE_F, CableFBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_S = register("cable_s", StellartechModBlocks.CABLE_S, CableSBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
