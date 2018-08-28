package com.sardari.anim_utils.easing.quint;

import com.sardari.anim_utils.easing.BaseEasingMethod;

public class QuintEaseIn extends BaseEasingMethod {
    public QuintEaseIn(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return c*(t/=d)*t*t*t*t + b;
    }
}
