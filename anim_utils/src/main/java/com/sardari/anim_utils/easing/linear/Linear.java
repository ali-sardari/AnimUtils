package com.sardari.anim_utils.easing.linear;

import com.sardari.anim_utils.easing.BaseEasingMethod;

public class Linear extends BaseEasingMethod {
    public Linear(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return c*t/d + b;
    }
}
