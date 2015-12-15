package com.wedidit.twitterheart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * TODO: document your custom view class.
 */
public class TweeterHeart extends View {
    Paint paint;
    Path path;

    public TweeterHeart(Context context) {
        super(context);
        initUI();
    }

    public TweeterHeart(Context context, AttributeSet attrs) {
        super(context, attrs);
        initUI();
    }

    public TweeterHeart(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initUI();
    }

    @Override
    protected void onDraw(Canvas canvas) {

        path.reset();
        paint.setStyle(Paint.Style.FILL);

        path.cubicTo(75,37,70,25,50,25);
        path.cubicTo(20,25,20,62,20,62);
        path.cubicTo(20,80,40,102,75,120);
        path.cubicTo(110,102,130,80,130,62);
        path.cubicTo(130,62,130,25,100,25);
        path.cubicTo(85,25,75,37,75,40);
        path.close();
        canvas.drawPath(path, paint);

        super.onDraw(canvas);
    }

    void initUI(){
        paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);

        path = new Path();
    }
}
