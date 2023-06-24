package nicefilms.stellartech.procedures;

import net.minecraft.world.level.LevelAccessor;

public class CableUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		CableModelUpdaterMainProcedure.execute(world, x, y, z);
		ElectricalCableForgeEnergyMainProcedure.execute(world, x, y, z);
	}
}
