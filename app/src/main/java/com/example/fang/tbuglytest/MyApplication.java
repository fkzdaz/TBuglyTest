package com.example.fang.tbuglytest;

import android.app.Application;
import android.util.Log;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by fang on 17-4-10.
 */
public class MyApplication extends Application {
    private static final String TAG = "MyApplication";
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "onCreate");

        CrashReport.initCrashReport(getApplicationContext(),"a22dcf7916",true);
    }
}
