
package net.mcreator.test.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.test.procedures.GlitchingOnEffectActiveTickProcedure;

public class GlitchingMobEffect extends MobEffect {
	public GlitchingMobEffect() {
		super(MobEffectCategory.HARMFUL, -16711936);
	}

	@Override
	public String getDescriptionId() {
		return "effect.test.glitching";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		GlitchingOnEffectActiveTickProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
