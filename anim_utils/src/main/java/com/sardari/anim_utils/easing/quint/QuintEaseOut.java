package com.sardari.anim_utils.easing.quint;

import com.sardari.anim_utils.easing.BaseEasingMethod;

public class QuintEaseOut extends BaseEasingMethod {
    public QuintEaseOut(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return c*((t=t/d-1)*t*t*t*t + 1) + b;
    }
}
