package com.huizhong.pro_net;

import com.huizhong.pro_net.callback.ResponseCallback;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NetClient {
    private static String baseUrl;

    public static String getBaseUrl() {
        return baseUrl;
    }

    public static void setBaseUrl(String url) {
        baseUrl = url;
    }

    public static <T> void executeAsync(Call<T> call, ResponseCallback callback) {
        call.enqueue(new Callback<T>() {
            @Override
            public void onResponse(Call<T> call, Response<T> response) {
                if(response.isSuccessful() && callback != null) {
                    callback.onSuccess(response.body());
                }
            }

            @Override
            public void onFailure(Call<T> call, Throwable t) {
                if(callback != null) {
                    callback.onFailure(t);
                }
            }
        });
    }
}
