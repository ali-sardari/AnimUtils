package com.sardari.anim_utils.easing.quad;

import com.sardari.anim_utils.easing.BaseEasingMethod;

public class QuadEaseIn extends BaseEasingMethod {
    public QuadEaseIn(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return c*(t/=d)*t + b;
    }
}
