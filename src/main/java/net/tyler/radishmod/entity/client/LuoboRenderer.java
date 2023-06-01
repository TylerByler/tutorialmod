package net.tyler.radishmod.entity.client;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.tyler.radishmod.RadishMod;
import net.tyler.radishmod.entity.custom.LuoboEntity;
import software.bernie.geckolib.renderer.DynamicGeoEntityRenderer;

public class LuoboRenderer extends DynamicGeoEntityRenderer<LuoboEntity> {
    public LuoboRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new LuoboModel());
    }

    @Override
    public ResourceLocation getTextureLocation(LuoboEntity animatable) {
        return new ResourceLocation(RadishMod.MOD_ID, "textures/entity/luobo.png");
    }

    @Override
    public float getMotionAnimThreshold(LuoboEntity animatable) {
        return 0.01f;
    }
}
