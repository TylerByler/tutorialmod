package net.tyler.radishmod.common.items;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tyler.radishmod.RadishMod;
import net.tyler.radishmod.common.blocks.ModBlocks;
import net.tyler.radishmod.common.items.custom.EightBallItem;
import net.tyler.radishmod.entity.ModEntities;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RadishMod.MOD_ID);

    public static final RegistryObject<Item> RADISH = ITEMS.register("radish",
            () -> new Item(new Item.Properties().food(Foods.RADISH)));
    public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
            () -> new EightBallItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> RADISH_SEEDS = ITEMS.register("radish_seeds",
            () -> new ItemNameBlockItem(ModBlocks.RADISH_CROP.get(), new Item.Properties()));

    public static final RegistryObject<Item> RADSCAL_SPAWN_EGG = ITEMS.register("radscal_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.RADSCAL, 0xAB3636, 0x269B41, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static class Foods {
        public static FoodProperties RADISH = new FoodProperties.Builder()
                .nutrition(6)
                .saturationMod(0.5f)
                .build();
    }
}
