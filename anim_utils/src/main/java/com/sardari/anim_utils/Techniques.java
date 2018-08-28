package com.sardari.anim_utils;

import com.sardari.anim_utils.attention.FlashAnimator;
import com.sardari.anim_utils.attention.PulseAnimator;
import com.sardari.anim_utils.attention.RubberBandAnimator;
import com.sardari.anim_utils.attention.ShakeAnimator;
import com.sardari.anim_utils.attention.StandUpAnimator;
import com.sardari.anim_utils.attention.SwingAnimator;
import com.sardari.anim_utils.attention.TadaAnimator;
import com.sardari.anim_utils.attention.WaveAnimator;
import com.sardari.anim_utils.attention.WobbleAnimator;
import com.sardari.anim_utils.bouncing_entrances.BounceInAnimator;
import com.sardari.anim_utils.bouncing_entrances.BounceInDownAnimator;
import com.sardari.anim_utils.bouncing_entrances.BounceInLeftAnimator;
import com.sardari.anim_utils.bouncing_entrances.BounceInRightAnimator;
import com.sardari.anim_utils.bouncing_entrances.BounceInUpAnimator;
import com.sardari.anim_utils.fading_entrances.FadeInAnimator;
import com.sardari.anim_utils.fading_entrances.FadeInDownAnimator;
import com.sardari.anim_utils.fading_entrances.FadeInLeftAnimator;
import com.sardari.anim_utils.fading_entrances.FadeInRightAnimator;
import com.sardari.anim_utils.fading_entrances.FadeInUpAnimator;
import com.sardari.anim_utils.fading_exits.FadeOutAnimator;
import com.sardari.anim_utils.fading_exits.FadeOutDownAnimator;
import com.sardari.anim_utils.fading_exits.FadeOutLeftAnimator;
import com.sardari.anim_utils.fading_exits.FadeOutRightAnimator;
import com.sardari.anim_utils.fading_exits.FadeOutUpAnimator;
import com.sardari.anim_utils.flippers.FlipInXAnimator;
import com.sardari.anim_utils.flippers.FlipInYAnimator;
import com.sardari.anim_utils.flippers.FlipOutXAnimator;
import com.sardari.anim_utils.flippers.FlipOutYAnimator;
import com.sardari.anim_utils.rotating_entrances.RotateInAnimator;
import com.sardari.anim_utils.rotating_entrances.RotateInDownLeftAnimator;
import com.sardari.anim_utils.rotating_entrances.RotateInDownRightAnimator;
import com.sardari.anim_utils.rotating_entrances.RotateInUpLeftAnimator;
import com.sardari.anim_utils.rotating_entrances.RotateInUpRightAnimator;
import com.sardari.anim_utils.rotating_exits.RotateOutAnimator;
import com.sardari.anim_utils.rotating_exits.RotateOutDownLeftAnimator;
import com.sardari.anim_utils.rotating_exits.RotateOutDownRightAnimator;
import com.sardari.anim_utils.rotating_exits.RotateOutUpLeftAnimator;
import com.sardari.anim_utils.rotating_exits.RotateOutUpRightAnimator;
import com.sardari.anim_utils.sliders.SlideInDownAnimator;
import com.sardari.anim_utils.sliders.SlideInLeftAnimator;
import com.sardari.anim_utils.sliders.SlideInRightAnimator;
import com.sardari.anim_utils.sliders.SlideInUpAnimator;
import com.sardari.anim_utils.sliders.SlideOutDownAnimator;
import com.sardari.anim_utils.sliders.SlideOutLeftAnimator;
import com.sardari.anim_utils.sliders.SlideOutRightAnimator;
import com.sardari.anim_utils.sliders.SlideOutUpAnimator;
import com.sardari.anim_utils.specials.HingeAnimator;
import com.sardari.anim_utils.specials.RollInAnimator;
import com.sardari.anim_utils.specials.RollOutAnimator;
import com.sardari.anim_utils.specials.in.LandingAnimator;
import com.sardari.anim_utils.specials.out.TakingOffAnimator;
import com.sardari.anim_utils.zooming_entrances.ZoomInAnimator;
import com.sardari.anim_utils.zooming_entrances.ZoomInDownAnimator;
import com.sardari.anim_utils.zooming_entrances.ZoomInLeftAnimator;
import com.sardari.anim_utils.zooming_entrances.ZoomInRightAnimator;
import com.sardari.anim_utils.zooming_entrances.ZoomInUpAnimator;
import com.sardari.anim_utils.zooming_exits.ZoomOutAnimator;
import com.sardari.anim_utils.zooming_exits.ZoomOutDownAnimator;
import com.sardari.anim_utils.zooming_exits.ZoomOutLeftAnimator;
import com.sardari.anim_utils.zooming_exits.ZoomOutRightAnimator;
import com.sardari.anim_utils.zooming_exits.ZoomOutUpAnimator;
import com.sardari.anim_utils.attention.BounceAnimator;
import com.sardari.anim_utils.specials.in.DropOutAnimator;

public enum Techniques {

    DropOut(DropOutAnimator.class),
    Landing(LandingAnimator.class),
    TakingOff(TakingOffAnimator.class),

    Flash(FlashAnimator.class),
    Pulse(PulseAnimator.class),
    RubberBand(RubberBandAnimator.class),
    Shake(ShakeAnimator.class),
    Swing(SwingAnimator.class),
    Wobble(WobbleAnimator.class),
    Bounce(BounceAnimator.class),
    Tada(TadaAnimator.class),
    StandUp(StandUpAnimator.class),
    Wave(WaveAnimator.class),

    Hinge(HingeAnimator.class),
    RollIn(RollInAnimator.class),
    RollOut(RollOutAnimator.class),

    BounceIn(BounceInAnimator.class),
    BounceInDown(BounceInDownAnimator.class),
    BounceInLeft(BounceInLeftAnimator.class),
    BounceInRight(BounceInRightAnimator.class),
    BounceInUp(BounceInUpAnimator.class),

    FadeIn(FadeInAnimator.class),
    FadeInUp(FadeInUpAnimator.class),
    FadeInDown(FadeInDownAnimator.class),
    FadeInLeft(FadeInLeftAnimator.class),
    FadeInRight(FadeInRightAnimator.class),

    FadeOut(FadeOutAnimator.class),
    FadeOutDown(FadeOutDownAnimator.class),
    FadeOutLeft(FadeOutLeftAnimator.class),
    FadeOutRight(FadeOutRightAnimator.class),
    FadeOutUp(FadeOutUpAnimator.class),

    FlipInX(FlipInXAnimator.class),
    FlipOutX(FlipOutXAnimator.class),
    FlipInY(FlipInYAnimator.class),
    FlipOutY(FlipOutYAnimator.class),
    RotateIn(RotateInAnimator.class),
    RotateInDownLeft(RotateInDownLeftAnimator.class),
    RotateInDownRight(RotateInDownRightAnimator.class),
    RotateInUpLeft(RotateInUpLeftAnimator.class),
    RotateInUpRight(RotateInUpRightAnimator.class),

    RotateOut(RotateOutAnimator.class),
    RotateOutDownLeft(RotateOutDownLeftAnimator.class),
    RotateOutDownRight(RotateOutDownRightAnimator.class),
    RotateOutUpLeft(RotateOutUpLeftAnimator.class),
    RotateOutUpRight(RotateOutUpRightAnimator.class),

    SlideInLeft(SlideInLeftAnimator.class),
    SlideInRight(SlideInRightAnimator.class),
    SlideInUp(SlideInUpAnimator.class),
    SlideInDown(SlideInDownAnimator.class),

    SlideOutLeft(SlideOutLeftAnimator.class),
    SlideOutRight(SlideOutRightAnimator.class),
    SlideOutUp(SlideOutUpAnimator.class),
    SlideOutDown(SlideOutDownAnimator.class),

    ZoomIn(ZoomInAnimator.class),
    ZoomInDown(ZoomInDownAnimator.class),
    ZoomInLeft(ZoomInLeftAnimator.class),
    ZoomInRight(ZoomInRightAnimator.class),
    ZoomInUp(ZoomInUpAnimator.class),

    ZoomOut(ZoomOutAnimator.class),
    ZoomOutDown(ZoomOutDownAnimator.class),
    ZoomOutLeft(ZoomOutLeftAnimator.class),
    ZoomOutRight(ZoomOutRightAnimator.class),
    ZoomOutUp(ZoomOutUpAnimator.class);

    private Class animatorClazz;

    private Techniques(Class clazz) {
        animatorClazz = clazz;
    }

    public BaseViewAnimator getAnimator() {
        try {
            return (BaseViewAnimator) animatorClazz.newInstance();
        } catch (Exception e) {
            throw new Error("Can not init animatorClazz instance");
        }
    }
}
