package com.iblogstreet.reportmessage;

import android.app.Application;

import com.iflytek.cloud.SpeechUtility;

/**
 * 类描述：App
 * 创建人：王军
 * 创建时间：2018/4/2
 */

public class App extends Application {
    @Override
    public void onCreate() {
        SpeechUtility.createUtility(App.this, "appid=" + getString(R.string.app_id));

        // 以下语句用于设置日志开关（默认开启），设置成false时关闭语音云SDK日志打印
        // Setting.setShowLog(false);
        super.onCreate();
    }
}
