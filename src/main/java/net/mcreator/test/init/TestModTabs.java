
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TestModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("test", "stellar_tech"),
				builder -> builder.title(Component.translatable("item_group.test.stellar_tech")).icon(() -> new ItemStack(TestModItems.CREATIVEBLACKHOLE.get())).displayItems((parameters, tabData) -> {
					tabData.accept(TestModItems.CANNEDCORN.get());
					tabData.accept(TestModItems.GLITHCEDINGOT.get());
				}).withSearchBar());
	}
}
