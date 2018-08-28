package com.sardari.anim_utils.flippers;

import android.animation.ObjectAnimator;
import android.view.View;

import com.sardari.anim_utils.BaseViewAnimator;

public class FlipInXAnimator extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "rotationX", 90, -15, 15, 0),
                ObjectAnimator.ofFloat(target, "alpha", 0.25f, 0.5f, 0.75f, 1)
        );
    }
}
