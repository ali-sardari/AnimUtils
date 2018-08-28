package com.sardari.anim_utils.zooming_entrances;

import android.animation.ObjectAnimator;
import android.view.View;

import com.sardari.anim_utils.BaseViewAnimator;

public class ZoomInLeftAnimator extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "scaleX", 0.1f, 0.475f, 1),
                ObjectAnimator.ofFloat(target, "scaleY", 0.1f, 0.475f, 1),
                ObjectAnimator.ofFloat(target, "translationX", -target.getRight(), 48, 0),
                ObjectAnimator.ofFloat(target, "alpha", 0, 1, 1)
        );
    }
}
