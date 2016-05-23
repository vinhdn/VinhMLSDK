package ml.vinh.lib;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by vinh on 5/23/16.
 */
public class ColorTextView extends TextView{
    public ColorTextView(Context context) {
        super(context);
        setup();
    }

    public ColorTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setup();
    }

    public ColorTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setup();
    }

    private void setup(){
        TypedArray typedArray = getContext().obtainStyledAttributes(new int[]{android.R.attr.textColor});
        int color = typedArray.getColor(0, getResources().getColor(android.R.color.black));
        if(color > 0){
            setTextColor(color);
        }
    }
}
