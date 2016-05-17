package com.example.abeer.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by ABeeR on 17-May-16.
 */
public class MyView extends LinearLayout {

    public MyView(Context context) {
        super(context);
        initialize(context);
    }



    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private void initialize(Context context) {
        inflate(context, R.layout.my_view, this);
    }
}
