package com.sardari.anim_utils.zooming_entrances;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

import com.sardari.anim_utils.BaseViewAnimator;

public class ZoomInUpAnimator extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        ViewGroup parent = (ViewGroup) target.getParent();
        int distance = parent.getHeight() - target.getTop();
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "alpha", 0, 1, 1),
                ObjectAnimator.ofFloat(target, "scaleX", 0.1f, 0.475f, 1),
                ObjectAnimator.ofFloat(target, "scaleY", 0.1f, 0.475f, 1),
                ObjectAnimator.ofFloat(target, "translationY", distance, -60, 0)
        );
    }
}
