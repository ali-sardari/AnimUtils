package com.sardari.anim_utils.bouncing_entrances;

import android.animation.ObjectAnimator;
import android.view.View;

import com.sardari.anim_utils.BaseViewAnimator;

public class BounceInLeftAnimator extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "translationX", -target.getWidth(), 30, -10, 0),
                ObjectAnimator.ofFloat(target, "alpha", 0, 1, 1, 1)
        );
    }
}

