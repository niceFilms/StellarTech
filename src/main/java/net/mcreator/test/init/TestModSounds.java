
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.test.TestMod;

public class TestModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TestMod.MODID);
	public static final RegistryObject<SoundEvent> BIOME_MUSIC = REGISTRY.register("biome_music", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("test", "biome_music")));
	public static final RegistryObject<SoundEvent> BACKGROUND_MUSIC_BIOME = REGISTRY.register("background_music_biome", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("test", "background_music_biome")));
	public static final RegistryObject<SoundEvent> TYPING = REGISTRY.register("typing", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("test", "typing")));
	public static final RegistryObject<SoundEvent> TYPER_SHORT = REGISTRY.register("typer_short", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("test", "typer_short")));
	public static final RegistryObject<SoundEvent> ERROR = REGISTRY.register("error", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("test", "error")));
}
