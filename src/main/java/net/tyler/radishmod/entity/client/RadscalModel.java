package net.tyler.radishmod.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.tyler.radishmod.RadishMod;
import net.tyler.radishmod.entity.custom.RadscalEntity;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;

public class RadscalModel extends GeoModel<RadscalEntity> {

    @Override
    public ResourceLocation getModelResource(RadscalEntity animatable) {
        return new ResourceLocation(RadishMod.MOD_ID, "geo/radscal.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RadscalEntity animatable) {
        return new ResourceLocation(RadishMod.MOD_ID, "textures/entity/radscal.png");
    }

    @Override
    public ResourceLocation getAnimationResource(RadscalEntity animatable) {
        return new ResourceLocation(RadishMod.MOD_ID, "animations/radscal.animation.json");
    }

    @Override
    public void setCustomAnimations(RadscalEntity animatable, long instanceId, AnimationState<RadscalEntity> animationState) {
        CoreGeoBone angryFace = getAnimationProcessor().getBone("angryFace");

        if (angryFace != null && animatable.isAggressive()) {
            angryFace.setHidden(false);
        } else {
            angryFace.setHidden(true);
        }
    }
}
