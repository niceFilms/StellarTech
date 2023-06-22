
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package nicefilms.stellartech.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class StellartechModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == StellartechModVillagerProfessions.HACKER.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(StellartechModItems.GLITHCEDINGOT.get()), new ItemStack(Items.EMERALD, 5), new ItemStack(StellartechModItems.GLITHCEDINGOT.get(), 2), 10, 5, 0f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.NETHERITE_SCRAP), new ItemStack(Items.EMERALD, 48), new ItemStack(Items.NETHERITE_SCRAP, 2), 2, 0, 0.1f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10),

					new ItemStack(StellartechModItems.US_BSTICK.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(StellartechModItems.US_BSTICK.get()), new ItemStack(Items.EMERALD, 64), new ItemStack(StellartechModItems.GLITHCED_USB.get()), 10, 5, 0.05f));
		}
	}
}
