package cn.mopon.mycustomviewdemo.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
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
        Xfermode xfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        paint.setColor(Color.BLUE);
        paint.setDither(true);

        int saved = canvas.saveLayer(null, null, Canvas.ALL_SAVE_FLAG);

        canvas.drawRect(100, 200, 300, 400, paint);
        paint.setColor(Color.RED);
        paint.setXfermode(xfermode);
        canvas.drawCircle(300, 200, 100, paint);
        paint.setXfermode(null);

        canvas.restoreToCount(saved);
//        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.xiao);
//        Shader shader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);

//        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(),R.drawable.xiaonan);
//        Shader shader1 = new BitmapShader(bitmap1, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
//
//        Shader shader2 = new ComposeShader(shader, shader1, PorterDuff.Mode.SCREEN);
//        paint.setShader(shader);
//        ColorFilter filter = new LightingColorFilter(0xffffff, 0x000030);
//        ColorFilter filter = new PorterDuffColorFilter(0xff0000, PorterDuff.Mode.DST_OVER);
//        paint.setColorFilter(filter);
//        canvas.drawCircle(300, 300, 300, paint);
//        Shader shader = new LinearGradient(0, 0, 150, 150, Color.parseColor("#e91e63"),
//                Color.parseColor("#2196f3"), Shader.TileMode.CLAMP);
//        Shader shader = new RadialGradient(400, 400, 200, Color.parseColor("#e91e63"),
//                Color.parseColor("#2169f3"), Shader.TileMode.REPEAT
//        );
//        Shader shader = new SweepGradient(400, 300, Color.parseColor("#e91e63"),
//                Color.parseColor("#2169f3"));
//        paint.setShader(shader);
//        canvas.drawRect(100, 100, 700, 500, paint);
//        canvas.drawCircle(300, 300, 200, paint);
//        paint.setARGB(100, 255, 0, 0);
//        canvas.drawRect(0, 0, 200, 200, paint);
//
//        paint.setARGB(100, 0, 0, 0);
//        canvas.drawLine(0, 0, 200, 200, paint);
//        paint.setColor(Color.parseColor("#009688"));
//        canvas.drawRect(30, 30, 230, 180, paint);
//
//        paint.setColor(Color.parseColor("#ff9800"));
//        canvas.drawLine(300, 30, 450, 180, paint);
//
//        paint.setColor(Color.parseColor("#e91e63"));
//        paint.setTextSize(30);
//        canvas.drawText("HenCoder", 500, 130, paint);
//        paint.setColor(Color.RED);
//        paint.setAntiAlias(true);
//
//        paint.setStyle(Paint.Style.FILL);
//        canvas.drawRect(50, 400, 250, 600, paint);
//
//        paint.setStyle(Paint.Style.STROKE);
//        canvas.drawRect(300, 400, 500, 600, paint);
//
//        paint.setStrokeWidth(20);
//        canvas.drawCircle(200, 200, 150, paint);
//
//        paint.setStrokeCap(Paint.Cap.ROUND);
//        canvas.drawPoint(200, 150, paint);
//        canvas.drawPoints(points, 0, 12, paint);
//
//        paint.setStrokeCap(Paint.Cap.BUTT);
//        canvas.drawPoint(200, 200, paint);
//
//        paint.setStrokeCap(Paint.Cap.SQUARE);
//        canvas.drawPoint(200, 250, paint);

//        canvas.drawColor(Color.BLUE);
//        canvas.drawColor(Color.parseColor("#88880000"));
    }
}
