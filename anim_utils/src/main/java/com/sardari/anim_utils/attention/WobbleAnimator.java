package com.sardari.anim_utils.attention;

import android.animation.ObjectAnimator;
import android.view.View;

import com.sardari.anim_utils.BaseViewAnimator;

public class WobbleAnimator extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        float width = target.getWidth();
        float one = (float) (width / 100.0);
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "translationX", 0 * one, -25 * one, 20 * one, -15 * one, 10 * one, -5 * one, 0 * one, 0),
                ObjectAnimator.ofFloat(target, "rotation", 0, -5, 3, -3, 2, -1, 0)
        );
    }
}
