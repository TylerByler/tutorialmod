package net.tyler.radishmod.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.tyler.radishmod.RadishMod;
import net.tyler.radishmod.entity.custom.LuoboEntity;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;

public class LuoboModel extends GeoModel<LuoboEntity> {
    @Override
    public ResourceLocation getModelResource(LuoboEntity animatable) {
        return new ResourceLocation(RadishMod.MOD_ID, "geo/luobo.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(LuoboEntity animatable) {
        return new ResourceLocation(RadishMod.MOD_ID, "textures/entity/luobo.png");
    }

    @Override
    public ResourceLocation getAnimationResource(LuoboEntity animatable) {
        return new ResourceLocation(RadishMod.MOD_ID, "animations/luobo.animation.json");
    }

    @Override
    public void setCustomAnimations(LuoboEntity animatable, long instanceId, AnimationState<LuoboEntity> animationState) {
        CoreGeoBone angryFace = getAnimationProcessor().getBone("AngryFace");

        if (angryFace != null && animatable.isAggressive()) {
            angryFace.setHidden(false);
        } else {
            angryFace.setHidden(true);
        }
    }
}
