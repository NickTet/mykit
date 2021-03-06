package com.sclimin.mykit.widget.corner;

import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;

/**
 * 作者：limin
 * <p>
 * 创建时间：2018/08/10
 */
interface CornerView {
    void setCornerRadius(float cornerRadius);
    void setCornerRadiusRes(@DimenRes int radiusRes);
    void setShadowColor(@ColorInt int shadowColor);
    void setShadowColorRes(@ColorRes int colorRes);
    void setShadowSize(float shadowSize);
    void setShadowSizeRes(@DimenRes int shadowSizeRes);
    void setClipContent(boolean clipContent);
}
