
package nicefilms.stellartech.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class HackertableBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public HackertableBlock() {
		super(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(14, 0, 15, 16, 12, 16), box(0, 0, 15, 2, 12, 16), box(0, 0, 14, 1, 12, 15), box(0, 0, 1, 1, 12, 2), box(15, 0, 14, 16, 12, 15), box(15, 0, 1, 16, 12, 2), box(14, 0, 0, 16, 12, 1), box(0, 0, 0, 2, 12, 1),
					box(0, 12, 0, 16, 14, 16), box(1, 14, 1, 15, 15, 12), box(1, 15, 1, 15, 23, 2), box(13, 14, 13, 15, 15, 16));
			case NORTH -> Shapes.or(box(0, 0, 0, 2, 12, 1), box(14, 0, 0, 16, 12, 1), box(15, 0, 1, 16, 12, 2), box(15, 0, 14, 16, 12, 15), box(0, 0, 1, 1, 12, 2), box(0, 0, 14, 1, 12, 15), box(0, 0, 15, 2, 12, 16), box(14, 0, 15, 16, 12, 16),
					box(0, 12, 0, 16, 14, 16), box(1, 14, 4, 15, 15, 15), box(1, 15, 14, 15, 23, 15), box(1, 14, 0, 3, 15, 3));
			case EAST -> Shapes.or(box(15, 0, 0, 16, 12, 2), box(15, 0, 14, 16, 12, 16), box(14, 0, 15, 15, 12, 16), box(1, 0, 15, 2, 12, 16), box(14, 0, 0, 15, 12, 1), box(1, 0, 0, 2, 12, 1), box(0, 0, 0, 1, 12, 2), box(0, 0, 14, 1, 12, 16),
					box(0, 12, 0, 16, 14, 16), box(1, 14, 1, 12, 15, 15), box(1, 15, 1, 2, 23, 15), box(13, 14, 1, 16, 15, 3));
			case WEST -> Shapes.or(box(0, 0, 14, 1, 12, 16), box(0, 0, 0, 1, 12, 2), box(1, 0, 0, 2, 12, 1), box(14, 0, 0, 15, 12, 1), box(1, 0, 15, 2, 12, 16), box(14, 0, 15, 15, 12, 16), box(15, 0, 14, 16, 12, 16), box(15, 0, 0, 16, 12, 2),
					box(0, 12, 0, 16, 14, 16), box(4, 14, 1, 15, 15, 15), box(14, 15, 1, 15, 23, 15), box(0, 14, 13, 3, 15, 15));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
