
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package nicefilms.stellartech.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StellartechModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("stellartech", "stellar_tech"),
				builder -> builder.title(Component.translatable("item_group.stellartech.stellar_tech")).icon(() -> new ItemStack(StellartechModItems.CREATIVEBLACKHOLE.get())).displayItems((parameters, tabData) -> {
					tabData.accept(StellartechModItems.CANNEDCORN.get());
					tabData.accept(StellartechModItems.GLITHCEDINGOT.get());
					tabData.accept(StellartechModBlocks.HACKERTABLE.get().asItem());
					tabData.accept(StellartechModItems.USB.get());
					tabData.accept(StellartechModItems.GLITCHED_USB.get());
					tabData.accept(StellartechModBlocks.LAPTOP.get().asItem());
					tabData.accept(StellartechModBlocks.OUTLET.get().asItem());
					tabData.accept(StellartechModBlocks.GLITHCEDBLOCK.get().asItem());
					tabData.accept(StellartechModBlocks.CABLE.get().asItem());
					tabData.accept(StellartechModItems.ENERGY_REMOTE.get());
				}).withSearchBar());
	}
}
