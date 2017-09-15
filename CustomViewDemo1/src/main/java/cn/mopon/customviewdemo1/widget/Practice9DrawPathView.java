package cn.mopon.customviewdemo1.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    private Paint paint = new Paint();
    private Path path = new Path();

    {
        // 使用 path 对图形进行描述（这段描述代码不必看懂）
        path.addArc(100, 100, 300, 300, -225, 225);
        path.arcTo(300, 100, 500, 300, -180, 225, false);
        path.lineTo(300, 442);
    }

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        canvas.drawPath(path, paint);
    }
}
