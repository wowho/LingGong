package com.huizhong.pro_net;

import android.text.TextUtils;

import java.util.HashMap;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitManager {

    private RetrofitManager(){}

    private static class RetrofitManagerHolder{
        private static final RetrofitManager INSTANCE = new RetrofitManager();
    }

    /**
     * 获取单例
     * @return
     */
    public static RetrofitManager getInstance() {
        return RetrofitManagerHolder.INSTANCE;
    }

    private static HashMap<String, Retrofit> retrofitHashMap = new HashMap<>();

    /**
     * 获取Retrofit实例
     * 使用默认baseUrl初始化
     * @return
     */
    public static synchronized Retrofit getRetrofit() {
        checkBaseUrl(NetClient.getBaseUrl());
        Retrofit retrofit = retrofitHashMap.get(NetClient.getBaseUrl());
        if(retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(NetClient.getBaseUrl())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        retrofitHashMap.put(NetClient.getBaseUrl(), retrofit);
        return retrofit;
    }

    /**
     * 获取Retrofit实例
     * 使用提供等URL进行初始化
     * @param baseUrl
     * @return
     */
    public static synchronized Retrofit getRetrofit(String baseUrl) {
        checkBaseUrl(baseUrl);
        Retrofit retrofit = retrofitHashMap.get(baseUrl);
        if(retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        retrofitHashMap.put(baseUrl, retrofit);
        return retrofit;
    }


    /**
     * 获取Retrofit实例
     * 使用默认baseUrl初始化
     * @return
     */
    public static synchronized Retrofit getStringRetrofit() {
        checkBaseUrl(NetClient.getBaseUrl());
        Retrofit retrofit = retrofitHashMap.get(NetClient.getBaseUrl());
        if(retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(NetClient.getBaseUrl())
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .build();
        }
        retrofitHashMap.put(NetClient.getBaseUrl(), retrofit);
        return retrofit;
    }

    /**
     * 获取StringRetrofit实例
     * 使用提供等URL进行初始化
     * @param baseUrl
     * @return
     */
    public static synchronized Retrofit getStringRetrofit(String baseUrl) {
        checkBaseUrl(baseUrl);
        Retrofit retrofit = retrofitHashMap.get(baseUrl);
        if(retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .build();
        }
        retrofitHashMap.put(baseUrl, retrofit);
        return retrofit;
    }

    private static void checkBaseUrl(String url) {
        if(TextUtils.isEmpty(url)) {
            throw new RuntimeException("BaseUrl can not be null");
        }
    }


}
