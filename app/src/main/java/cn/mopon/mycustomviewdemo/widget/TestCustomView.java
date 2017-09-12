package cn.mopon.mycustomviewdemo.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Description :
 * Author ：Robin
 * Date   ：2017/9/12 11:16
 */

public class TestCustomView extends View {

    private Paint paint = new Paint();
    private float[] points = {0, 0, 400, 50, 450, 50, 400, 100, 450, 100, 500, 50, 550, 50};

    public TestCustomView(Context context) {
        super(context, null);
    }

    public TestCustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.RED);
        paint.setAntiAlias(true);

        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(50, 400, 250, 600, paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(300, 400, 500, 600, paint);

        paint.setStrokeWidth(20);
        canvas.drawCircle(200, 200, 150, paint);

        paint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoint(200, 150, paint);
        canvas.drawPoints(points, 0, 12, paint);

        paint.setStrokeCap(Paint.Cap.BUTT);
        canvas.drawPoint(200, 200, paint);

        paint.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawPoint(200, 250, paint);

//        canvas.drawColor(Color.BLUE);
//        canvas.drawColor(Color.parseColor("#88880000"));
    }
}
