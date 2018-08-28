package com.sardari.anim_utils.easing.sine;

import com.sardari.anim_utils.easing.BaseEasingMethod;

public class SineEaseInOut extends BaseEasingMethod {
    public SineEaseInOut(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return -c/2 * ((float)Math.cos(Math.PI*t/d) - 1) + b;
    }
}
