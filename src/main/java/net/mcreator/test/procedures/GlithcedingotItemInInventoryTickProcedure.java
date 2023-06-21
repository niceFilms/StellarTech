package net.mcreator.test.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.test.init.TestModItems;
import net.mcreator.test.TestMod;

public class GlithcedingotItemInInventoryTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TestMod.queueServerWork(Mth.nextInt(RandomSource.create(), 1200, 2400), () -> {
		});
		if (Mth.nextInt(RandomSource.create(), 1, 100) <= 5) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(TestModItems.GLITHCEDINGOT.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
