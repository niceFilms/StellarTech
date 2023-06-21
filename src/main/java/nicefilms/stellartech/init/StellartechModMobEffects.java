
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package nicefilms.stellartech.init;

import nicefilms.stellartech.potion.GlitchingMobEffect;
import nicefilms.stellartech.StellartechMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class StellartechModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, StellartechMod.MODID);
	public static final RegistryObject<MobEffect> GLITCHING = REGISTRY.register("glitching", () -> new GlitchingMobEffect());
}
