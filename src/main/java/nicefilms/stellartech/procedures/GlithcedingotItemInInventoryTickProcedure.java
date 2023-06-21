package nicefilms.stellartech.procedures;

import nicefilms.stellartech.init.StellartechModItems;
import nicefilms.stellartech.StellartechMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class GlithcedingotItemInInventoryTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		StellartechMod.queueServerWork(Mth.nextInt(RandomSource.create(), 1200, 2400), () -> {
		});
		if (Mth.nextInt(RandomSource.create(), 1, 100) <= 5) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(StellartechModItems.GLITHCEDINGOT.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
