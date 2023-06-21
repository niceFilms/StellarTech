package nicefilms.stellartech.procedures;

import nicefilms.stellartech.StellartechMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;

public class GlitchingOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double random = 0;
		StellartechMod.queueServerWork(20, () -> {
		});
		random = Mth.nextInt(RandomSource.create(), 1, 10);
		if (random == 1) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 100, 99, false, false));
		} else if (random == 2) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 100, 99, false, false));
		} else if (random == 3) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 100, 99, false, false));
		} else if (random == 4) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 100, 99, false, false));
		} else if (random == 5) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 100, 99, false, false));
		} else if (random == 6) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 100, 99, false, false));
		} else if (random == 7) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 100, 99, false, false));
		} else if (random == 8) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, 100, 99, false, false));
		} else if (random == 9) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 99, false, false));
		} else if (random == 10) {
			{
				Entity _ent = entity;
				_ent.teleportTo((entity.getX() + Mth.nextInt(RandomSource.create(), -10, 10)), (entity.getY() + Mth.nextInt(RandomSource.create(), -1, 1)), (entity.getZ() + Mth.nextInt(RandomSource.create(), -10, 10)));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((entity.getX() + Mth.nextInt(RandomSource.create(), -10, 10)), (entity.getY() + Mth.nextInt(RandomSource.create(), -1, 1)), (entity.getZ() + Mth.nextInt(RandomSource.create(), -10, 10)),
							_ent.getYRot(), _ent.getXRot());
			}
		}
	}
}
