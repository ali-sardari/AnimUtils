package com.sardari.anim_utils.easing.bounce;

import com.sardari.anim_utils.easing.BaseEasingMethod;

public class BounceEaseInOut extends BaseEasingMethod {

    private BounceEaseOut mBounceEaseOut;
    private BounceEaseIn mBounceEaseIn;

    public BounceEaseInOut(float duration){
        super(duration);
        mBounceEaseIn = new BounceEaseIn(duration);
        mBounceEaseOut = new BounceEaseOut(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        if (t < d/2)
            return mBounceEaseIn.calculate (t*2, 0, c, d) * .5f + b;
        else
            return mBounceEaseOut.calculate (t*2-d, 0, c, d) * .5f + c*.5f + b;
    }
}
