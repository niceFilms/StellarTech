package nicefilms.stellartech.procedures;

import nicefilms.stellartech.init.StellartechModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class CableModelUpdaterMainProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == StellartechModBlocks.CABLE.get())) {
			ElectricalCableModelUpdaterNProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == StellartechModBlocks.CABLE_E.get())) {
			ElectricalCableModelUpdaterEProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == StellartechModBlocks.CABLE_I.get())) {
			ElectricalCableModelUpdaterIProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == StellartechModBlocks.CABLE_L.get())) {
			ElectricalCableModelUpdaterLProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == StellartechModBlocks.CABLE_LC.get())) {
			ElectricalCableModelUpdaterLCProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == StellartechModBlocks.CABLE_LCC.get())) {
			ElectricalCableModelUpdaterLCCProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == StellartechModBlocks.CABLE_LT.get())) {
			ElectricalCableModelUpdaterLTProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == StellartechModBlocks.CABLE_LTC.get())) {
			ElectricalCableModelUpdaterLTCProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == StellartechModBlocks.CABLE_T.get())) {
			ElectricalCableModelUpdaterTProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == StellartechModBlocks.CABLE_TC.get())) {
			ElectricalCableModelUpdaterTCProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == StellartechModBlocks.CABLE_TX.get())) {
			ElectricalCableModelUpdaterTXProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == StellartechModBlocks.CABLE_TXC.get())) {
			ElectricalCableModelUpdaterTXCProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == StellartechModBlocks.CABLE_TXCC.get())) {
			ElectricalCableModelUpdaterTXCCProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == StellartechModBlocks.CABLE_X.get())) {
			ElectricalCableModelUpdaterXProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == StellartechModBlocks.CABLE_XC.get())) {
			ElectricalCableModelUpdaterXCProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == StellartechModBlocks.CABLE_F.get())) {
			ElectricalCableModelUpdaterFProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == StellartechModBlocks.CABLE_S.get())) {
			ElectricalCableModelUpdaterSProcedure.execute(world, x, y, z);
		}
	}
}
