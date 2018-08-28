package com.sardari.anim_utils.zooming_exits;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

import com.sardari.anim_utils.BaseViewAnimator;

public class ZoomOutDownAnimator extends BaseViewAnimator {
    @Override
    protected void prepare(View target) {
        ViewGroup parent = (ViewGroup) target.getParent();
        int distance = parent.getHeight() - target.getTop();
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "alpha", 1, 1, 0),
                ObjectAnimator.ofFloat(target, "scaleX", 1, 0.475f, 0.1f),
                ObjectAnimator.ofFloat(target, "scaleY", 1, 0.475f, 0.1f),
                ObjectAnimator.ofFloat(target, "translationY", 0, -60, distance)
        );
    }
}
