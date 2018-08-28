package com.sardari.anim_utils.easing.circ;

import com.sardari.anim_utils.easing.BaseEasingMethod;

public class CircEaseIn extends BaseEasingMethod {

    public CircEaseIn(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return -c * ((float)Math.sqrt(1 - (t/=d)*t) - 1) + b;
    }
}
