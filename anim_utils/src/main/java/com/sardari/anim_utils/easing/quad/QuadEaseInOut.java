package com.sardari.anim_utils.easing.quad;

import com.sardari.anim_utils.easing.BaseEasingMethod;

public class QuadEaseInOut extends BaseEasingMethod {
    public QuadEaseInOut(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        if ((t/=d/2) < 1) return c/2*t*t + b;
        return -c/2 * ((--t)*(t-2) - 1) + b;
    }
}
