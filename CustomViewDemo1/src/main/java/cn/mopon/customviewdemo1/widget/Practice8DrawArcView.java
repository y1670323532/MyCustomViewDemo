package cn.mopon.customviewdemo1.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    private Paint paint = new Paint();

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        paint.setColor(Color.parseColor("#ce51a6"));
        canvas.drawArc(100, 100, 700, 500, -110, 100, true, paint);

        canvas.drawArc(100, 100, 700, 500, 20, 140, false, paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(100, 100, 700, 500, 180, 60, false, paint);
    }
}
