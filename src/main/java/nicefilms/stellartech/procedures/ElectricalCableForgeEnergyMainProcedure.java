package nicefilms.stellartech.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicInteger;

public class ElectricalCableForgeEnergyMainProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean east = false;
		boolean south = false;
		boolean north = false;
		boolean west = false;
		boolean up = false;
		boolean down = false;
		double sides = 0;
		double sendAmount = 0;
		double energy = 0;
		sides = ElectricalCableForgeEnergySidesProcedure.execute(world, x, y, z);
		south = ElectricalCableForgeEnergySouthProcedure.execute(world, x, y, z);
		north = ElectricalCableForgeEnergyNorthProcedure.execute(world, x, y, z);
		east = ElectricalCableForgeEnergyEastProcedure.execute(world, x, y, z);
		west = ElectricalCableForgeEnergyWestProcedure.execute(world, x, y, z);
		up = ElectricalCableForgeEnergyUpProcedure.execute(world, x, y, z);
		down = ElectricalCableForgeEnergyDownProcedure.execute(world, x, y, z);
		if (south) {
			sendAmount = new Object() {
				public int getEnergyStored(LevelAccessor level, BlockPos pos) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
					return _retval.get();
				}
			}.getEnergyStored(world, BlockPos.containing(x, y, z)) / sides;
			energy = new Object() {
				public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
					return _retval.get();
				}
			}.receiveEnergySimulate(world, BlockPos.containing(x, y, z + 1), (int) sendAmount);
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z + 1));
				int _amount = (int) energy;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
				int _amount = (int) energy;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
		}
		if (north) {
			sendAmount = new Object() {
				public int getEnergyStored(LevelAccessor level, BlockPos pos) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
					return _retval.get();
				}
			}.getEnergyStored(world, BlockPos.containing(x, y, z)) / sides;
			energy = new Object() {
				public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
					return _retval.get();
				}
			}.receiveEnergySimulate(world, BlockPos.containing(x, y, z - 1), (int) sendAmount);
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z - 1));
				int _amount = (int) energy;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
				int _amount = (int) energy;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
		}
		if (east) {
			sendAmount = new Object() {
				public int getEnergyStored(LevelAccessor level, BlockPos pos) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
					return _retval.get();
				}
			}.getEnergyStored(world, BlockPos.containing(x, y, z)) / sides;
			energy = new Object() {
				public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
					return _retval.get();
				}
			}.receiveEnergySimulate(world, BlockPos.containing(x + 1, y, z), (int) sendAmount);
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x + 1, y, z));
				int _amount = (int) energy;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
				int _amount = (int) energy;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
		}
		if (west) {
			sendAmount = new Object() {
				public int getEnergyStored(LevelAccessor level, BlockPos pos) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
					return _retval.get();
				}
			}.getEnergyStored(world, BlockPos.containing(x, y, z)) / sides;
			energy = new Object() {
				public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
					return _retval.get();
				}
			}.receiveEnergySimulate(world, BlockPos.containing(x - 1, y, z), (int) sendAmount);
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x - 1, y, z));
				int _amount = (int) energy;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
				int _amount = (int) energy;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
		}
		if (up) {
			sendAmount = new Object() {
				public int getEnergyStored(LevelAccessor level, BlockPos pos) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
					return _retval.get();
				}
			}.getEnergyStored(world, BlockPos.containing(x, y, z)) / sides;
			energy = new Object() {
				public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
					return _retval.get();
				}
			}.receiveEnergySimulate(world, BlockPos.containing(x, y + 1, z), (int) sendAmount);
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y + 1, z));
				int _amount = (int) energy;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
				int _amount = (int) energy;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
		}
		if (down) {
			sendAmount = new Object() {
				public int getEnergyStored(LevelAccessor level, BlockPos pos) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
					return _retval.get();
				}
			}.getEnergyStored(world, BlockPos.containing(x, y, z)) / sides;
			energy = new Object() {
				public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
					return _retval.get();
				}
			}.receiveEnergySimulate(world, BlockPos.containing(x, y - 1, z), (int) sendAmount);
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 1, z));
				int _amount = (int) energy;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
				int _amount = (int) energy;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
		}
	}
}
