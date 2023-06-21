
package nicefilms.stellartech.potion;

import nicefilms.stellartech.procedures.GlitchingOnEffectActiveTickProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class GlitchingMobEffect extends MobEffect {
	public GlitchingMobEffect() {
		super(MobEffectCategory.HARMFUL, -16711936);
	}

	@Override
	public String getDescriptionId() {
		return "effect.stellartech.glitching";
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
