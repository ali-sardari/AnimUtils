package com.sardari.anim_utils.zooming_exits;

import android.animation.ObjectAnimator;
import android.view.View;

import com.sardari.anim_utils.BaseViewAnimator;

public class ZoomOutAnimator extends BaseViewAnimator {
    @Override
    protected void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "alpha", 1, 0, 0),
                ObjectAnimator.ofFloat(target, "scaleX", 1, 0.3f, 0),
                ObjectAnimator.ofFloat(target, "scaleY", 1, 0.3f, 0)
        );
    }
}
