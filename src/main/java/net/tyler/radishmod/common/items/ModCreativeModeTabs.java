package net.tyler.radishmod.common.items;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.tyler.radishmod.RadishMod;
import net.tyler.radishmod.common.blocks.ModBlocks;

@Mod.EventBusSubscriber(modid = RadishMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab RADISH_TAB;

    @SubscribeEvent
    public static void registerCreativeModTabs(CreativeModeTabEvent.Register event) {
        RADISH_TAB = event.registerCreativeModeTab(new ResourceLocation(RadishMod.MOD_ID, "radish_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.RADISH.get()))
                        .title(Component.translatable("creativemodetab.radish_tab")));
    }
}
