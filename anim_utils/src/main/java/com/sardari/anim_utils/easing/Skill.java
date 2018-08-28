package com.sardari.anim_utils.easing;

import com.sardari.anim_utils.easing.back.BackEaseIn;
import com.sardari.anim_utils.easing.back.BackEaseInOut;
import com.sardari.anim_utils.easing.back.BackEaseOut;
import com.sardari.anim_utils.easing.bounce.BounceEaseIn;
import com.sardari.anim_utils.easing.bounce.BounceEaseInOut;
import com.sardari.anim_utils.easing.bounce.BounceEaseOut;
import com.sardari.anim_utils.easing.circ.CircEaseIn;
import com.sardari.anim_utils.easing.circ.CircEaseInOut;
import com.sardari.anim_utils.easing.circ.CircEaseOut;
import com.sardari.anim_utils.easing.cubic.CubicEaseIn;
import com.sardari.anim_utils.easing.cubic.CubicEaseInOut;
import com.sardari.anim_utils.easing.cubic.CubicEaseOut;
import com.sardari.anim_utils.easing.elastic.ElasticEaseIn;
import com.sardari.anim_utils.easing.elastic.ElasticEaseOut;
import com.sardari.anim_utils.easing.expo.ExpoEaseIn;
import com.sardari.anim_utils.easing.expo.ExpoEaseInOut;
import com.sardari.anim_utils.easing.expo.ExpoEaseOut;
import com.sardari.anim_utils.easing.linear.Linear;
import com.sardari.anim_utils.easing.quad.QuadEaseIn;
import com.sardari.anim_utils.easing.quad.QuadEaseInOut;
import com.sardari.anim_utils.easing.quad.QuadEaseOut;
import com.sardari.anim_utils.easing.quint.QuintEaseIn;
import com.sardari.anim_utils.easing.quint.QuintEaseInOut;
import com.sardari.anim_utils.easing.quint.QuintEaseOut;
import com.sardari.anim_utils.easing.sine.SineEaseIn;
import com.sardari.anim_utils.easing.sine.SineEaseInOut;
import com.sardari.anim_utils.easing.sine.SineEaseOut;

public enum Skill {
    BackEaseIn(BackEaseIn.class),
    BackEaseOut(BackEaseOut.class),
    BackEaseInOut(BackEaseInOut.class),

    BounceEaseIn(BounceEaseIn.class),
    BounceEaseOut(BounceEaseOut.class),
    BounceEaseInOut(BounceEaseInOut.class),

    CircEaseIn(CircEaseIn.class),
    CircEaseOut(CircEaseOut.class),
    CircEaseInOut(CircEaseInOut.class),

    CubicEaseIn(CubicEaseIn.class),
    CubicEaseOut(CubicEaseOut.class),
    CubicEaseInOut(CubicEaseInOut.class),

    ElasticEaseIn(ElasticEaseIn.class),
    ElasticEaseOut(ElasticEaseOut.class),

    ExpoEaseIn(ExpoEaseIn.class),
    ExpoEaseOut(ExpoEaseOut.class),
    ExpoEaseInOut(ExpoEaseInOut.class),

    QuadEaseIn(QuadEaseIn.class),
    QuadEaseOut(QuadEaseOut.class),
    QuadEaseInOut(QuadEaseInOut.class),

    QuintEaseIn(QuintEaseIn.class),
    QuintEaseOut(QuintEaseOut.class),
    QuintEaseInOut(QuintEaseInOut.class),

    SineEaseIn(SineEaseIn.class),
    SineEaseOut(SineEaseOut.class),
    SineEaseInOut(SineEaseInOut.class),

    Linear(Linear.class);


    private Class easingMethod;

    private Skill(Class clazz) {
        easingMethod = clazz;
    }

    public BaseEasingMethod getMethod(float duration) {
        try {
            return (BaseEasingMethod) easingMethod.getConstructor(float.class).newInstance(duration);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Error("Can not init easingMethod instance");
        }
    }
}
