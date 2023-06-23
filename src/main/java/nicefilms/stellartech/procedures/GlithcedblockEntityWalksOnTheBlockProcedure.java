package nicefilms.stellartech.procedures;

import nicefilms.stellartech.init.StellartechModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class GlithcedblockEntityWalksOnTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(StellartechModMobEffects.GLITCHING.get(), 20, 1));
	}
}
