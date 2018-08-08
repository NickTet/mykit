package com.sclimin.mykit.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

/**
 * 作者：limin
 * <p>
 * 创建时间：2018/03/28
 */

public class MaskButton extends AppCompatButton {

    private final MaskLayerHelper mMaskHelper;

    public MaskButton(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MaskButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mMaskHelper = new MaskLayerHelper(this, attrs, defStyleAttr);
        mMaskHelper.drawableState(getDrawableState());
    }

    @Override
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        mMaskHelper.drawableState(getDrawableState());
    }

    @Override
    protected void onSizeChanged(int w, int h, int ow, int oh) {
        super.onSizeChanged(w, h, ow, oh);
        mMaskHelper.sizeChange(w, h);
    }

    @Override
    public void draw(Canvas canvas) {
        mMaskHelper.draw(canvas, super::draw);
    }
}
