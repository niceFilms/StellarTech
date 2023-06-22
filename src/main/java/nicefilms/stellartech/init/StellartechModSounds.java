
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package nicefilms.stellartech.init;

import nicefilms.stellartech.StellartechMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class StellartechModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, StellartechMod.MODID);
	public static final RegistryObject<SoundEvent> BIOME_MUSIC = REGISTRY.register("biome_music", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("stellartech", "biome_music")));
	public static final RegistryObject<SoundEvent> BACKGROUND_MUSIC_BIOME = REGISTRY.register("background_music_biome", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("stellartech", "background_music_biome")));
	public static final RegistryObject<SoundEvent> TYPING = REGISTRY.register("typing", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("stellartech", "typing")));
	public static final RegistryObject<SoundEvent> TYPER_SHORT = REGISTRY.register("typer_short", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("stellartech", "typer_short")));
	public static final RegistryObject<SoundEvent> ERROR = REGISTRY.register("error", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("stellartech", "error")));
	public static final RegistryObject<SoundEvent> BREAKING_LAPTOP = REGISTRY.register("breaking_laptop", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("stellartech", "breaking_laptop")));
	public static final RegistryObject<SoundEvent> FALLING_LAPTOP = REGISTRY.register("falling_laptop", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("stellartech", "falling_laptop")));
	public static final RegistryObject<SoundEvent> STARUP_LAPTOP = REGISTRY.register("starup_laptop", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("stellartech", "starup_laptop")));
}
