package com.know.weather.CustomTextView;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Nourhan on 12/19/2016.
 */

public class PamegaDemoTextView extends TextView {

    public PamegaDemoTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public PamegaDemoTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PamegaDemoTextView(Context context) {
        super(context);
        init();
    }

    private void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(),
                "Pamega demo.ttf");
        setTypeface(tf);
    }

}
