package com.shld.tools;

import android.content.Context;
import android.text.TextUtils;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
/**
 * 常用Toast提醒，避免Toast多次提醒问题
 */
public class T {

    private static Toast toast;

    private static void makeText(Context context, CharSequence text, int gravity, int duration) {
        if (toast == null) {
            toast = Toast.makeText(context, text, duration);
        } else {
            toast.setDuration(duration);
            toast.setText(text);
        }
        if (gravity != 0) {
            toast.setGravity(gravity, 0, 0);
        } else {
            toast.setGravity(Gravity.BOTTOM, 0, 200);
        }
        if (!TextUtils.isEmpty(text)){
            toast.show();
        }
    }

    /**
     * 显示一段较长时间的提示
     * @param context context
     * @param res 资源文件
     */
    public static void showToastLong(Context context, int res) {
        showToastLong(context, context.getText(res));
    }

    public static void showToastLong(Context context, CharSequence message) {
        makeText(context, message, 0, Toast.LENGTH_LONG);
    }

    /**
     * 显示一段较短的提示
     * @param context context
     * @param res 资源文件
     */
    public static void showToastShort(Context context, int res) {
        showToastShort(context, context.getText(res));
    }

    public static void showToastShort(Context context, CharSequence message) {
        makeText(context, message, 0, Toast.LENGTH_SHORT);
    }

    /**
     * 在指定位置显示
     * @param context context
     * @param gravity gravity
     * @param res 资源文件
     */
    public static void showToastInGravity(Context context, int gravity, int res) {
        showToastInGravity(context, gravity, context.getText(res));
    }

    public static void showToastInGravity(Context context, int gravity,
                                          CharSequence message) {
        makeText(context, message, gravity, Toast.LENGTH_SHORT);
    }

    /**
     * 显示提示和图标
     * @param context context
     * @param drawable drawable
     * @param res res
     */
    public static void showToastWithIcon(Context context, int drawable, int res) {
        showToastWithIcon(context, drawable, context.getText(res));
    }

    public static void showToastWithIcon(Context context, int drawable,
                                         CharSequence message) {
        Toast toast = getToast(context, drawable, message);
        toast.show();
    }

    /**
     * 在指定位置显示提示和图标
     * @param context context
     * @param drawable drawable
     * @param gravity gravity
     * @param res res
     */
    public static void showToastWithIconInGravity(Context context,
                                                  int drawable, int gravity, int res) {
        showToastWithIconInGravity(context, drawable, gravity,
                context.getText(res));
    }

    public static void showToastWithIconInGravity(Context context,
                                                  int drawable, int gravity, CharSequence message) {
        Toast toast = getToast(context, drawable, message);
        toast.setGravity(gravity, 0, 0);
        toast.show();
    }

    private static Toast getToast(Context context, int drawable,
                                  CharSequence message) {
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        LinearLayout linearLayout = (LinearLayout) toast.getView();
        ImageView iv = new ImageView(context);
        iv.setImageResource(drawable);
        linearLayout.addView(iv, 0);
        return toast;
    }
}