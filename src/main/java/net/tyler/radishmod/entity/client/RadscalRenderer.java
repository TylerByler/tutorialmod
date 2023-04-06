package net.tyler.radishmod.entity.client;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.tyler.radishmod.RadishMod;
import net.tyler.radishmod.entity.custom.RadscalEntity;
import software.bernie.geckolib.renderer.DynamicGeoEntityRenderer;

public class RadscalRenderer extends DynamicGeoEntityRenderer<RadscalEntity> {
    public RadscalRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new RadscalModel());
    }

    @Override
    public ResourceLocation getTextureLocation(RadscalEntity animatable) {
        return new ResourceLocation(RadishMod.MOD_ID, "textures/entity/radscal.png");
    }

    @Override
    public float getMotionAnimThreshold(RadscalEntity animatable) {
        return 0.01f;
    }
}
