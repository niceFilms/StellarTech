package nicefilms.stellartech.procedures;

import nicefilms.stellartech.StellartechMod;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class LaptopRedstoneOnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		StellartechMod.queueServerWork(200, () -> {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
				int _amount = 1;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		});
	}
}
