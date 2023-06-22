
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package nicefilms.stellartech.init;

import nicefilms.stellartech.block.entity.LaptopoffBlockEntity;
import nicefilms.stellartech.block.entity.LaptopBlockEntity;
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

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
