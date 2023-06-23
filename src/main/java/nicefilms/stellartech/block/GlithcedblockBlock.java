
package nicefilms.stellartech.block;

import org.checkerframework.checker.units.qual.s;

import nicefilms.stellartech.procedures.GlithcedblockEntityWalksOnTheBlockProcedure;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class GlithcedblockBlock extends Block {
	public GlithcedblockBlock() {
		super(BlockBehaviour.Properties.of(Material.METAL)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("stellartech:glitch_sound_effect")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("stellartech:glitch_sound_effect")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("stellartech:glitch_sound_effect")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("stellartech:glitch_sound_effect")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("stellartech:glitch_sound_effect"))))
				.strength(6f, 10f).lightLevel(s -> 5).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
		super.stepOn(world, pos, blockstate, entity);
		GlithcedblockEntityWalksOnTheBlockProcedure.execute(entity);
	}
}
