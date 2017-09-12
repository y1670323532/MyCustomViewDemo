package cn.mopon.mycustomviewdemo.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/**
 * Description :
 * Author ：Robin
 * Date   ：2017/9/12 11:16
 */

public class TestCustomView extends View {

    public TestCustomView(Context context) {
        super(context, null);
    }

    public TestCustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
