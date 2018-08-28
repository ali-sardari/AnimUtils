package com.sardari.anim_utils.easing.cubic;

import com.sardari.anim_utils.easing.BaseEasingMethod;

public class CubicEaseOut extends BaseEasingMethod {

    public CubicEaseOut(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return c*((t=t/d-1)*t*t + 1) + b;
    }
}
