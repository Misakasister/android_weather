package com.example.weather.util;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.Request;

//与服务器交互，
public class HttpUtil {
    private static final String TAG = "HttpUtil";
    public  static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();//发送请求
        client.newCall(request).enqueue(callback);//异步获得数据
    }
}
