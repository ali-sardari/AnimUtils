package com.sardari.anim_utils.flippers;

import android.animation.ObjectAnimator;
import android.view.View;

import com.sardari.anim_utils.BaseViewAnimator;

public class FlipOutYAnimator extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "rotationY", 0, 90),
                ObjectAnimator.ofFloat(target, "alpha", 1, 0)
        );
    }
}
