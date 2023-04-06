package net.tyler.radishmod.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.tyler.radishmod.RadishMod;
import net.tyler.radishmod.entity.ModEntities;
import net.tyler.radishmod.entity.custom.RadscalEntity;

@Mod.EventBusSubscriber(modid = RadishMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {

    // adds attributes bitch
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntities.RADSCAL.get(), RadscalEntity.setAttributes());
    }
}
