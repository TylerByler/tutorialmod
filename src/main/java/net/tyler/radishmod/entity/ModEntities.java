package net.tyler.radishmod.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tyler.radishmod.RadishMod;
import net.tyler.radishmod.entity.custom.RadscalEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, RadishMod.MOD_ID);

    public static final RegistryObject<EntityType<RadscalEntity>> RADSCAL =
            ENTITY_TYPES.register("radscal",
                    () -> EntityType.Builder.of(RadscalEntity::new, MobCategory.MONSTER)
                            .sized(.6f,.8f)
                            .build(new ResourceLocation(RadishMod.MOD_ID,"radscal").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
