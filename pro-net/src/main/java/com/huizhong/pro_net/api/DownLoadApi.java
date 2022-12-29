package com.huizhong.pro_net.api;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

public interface DownLoadApi {
    @GET()
    @Streaming
    Call<ResponseBody> executeDownLoad(@Url String url);

    @GET()
    @Streaming
    Call<ResponseBody> executeDownLoad(@Url String url, @QueryMap Map<String, String> param);
}
