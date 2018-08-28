package com.sardari.anim_utils.easing.expo;

import com.sardari.anim_utils.easing.BaseEasingMethod;

public class ExpoEaseOut extends BaseEasingMethod {
    public ExpoEaseOut(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return (t==d) ? b+c : c * (-(float)Math.pow(2, -10 * t/d) + 1) + b;
    }
}
