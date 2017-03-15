package com.shld.tools;


import android.text.TextUtils;
import android.util.Log;

/**
 * 日志工具
 */
public class L {
    public static boolean DEBUG = BuildConfig.DEBUG;
    public static String LOG_TAG = "SHLD";


    public static void error(String log) {
        if (DEBUG && !TextUtils.isEmpty(log)) Log.e(LOG_TAG, "" + log);
    }

    public static void log(String log) {
        if (DEBUG && !TextUtils.isEmpty(log)) Log.i(LOG_TAG, log);
    }

    public static void log(String tag, String log) {
        if (DEBUG && !TextUtils.isEmpty(tag) && !TextUtils.isEmpty(log)) Log.i(tag, log);
    }

    public static void d(String log) {
        if (DEBUG && !TextUtils.isEmpty(log)) Log.d(LOG_TAG, log);
    }

    public static void d(String tag, String log) {
        if (DEBUG && !TextUtils.isEmpty(tag) && !TextUtils.isEmpty(log)) Log.d(tag, log);
    }

    public static void e(String log) {
        if (DEBUG && !TextUtils.isEmpty(log)) Log.e(LOG_TAG, log);
    }

    public static void e(String tag, String log) {
        if (DEBUG && !TextUtils.isEmpty(tag) && !TextUtils.isEmpty(log)) Log.e(tag, log);
    }

    public static void i(String log) {
        if (DEBUG && !TextUtils.isEmpty(log)) Log.i(LOG_TAG, log);
    }

    public static void i(String tag, String log) {
        if (DEBUG && !TextUtils.isEmpty(tag) && !TextUtils.isEmpty(log)) Log.i(tag, log);
    }
}


