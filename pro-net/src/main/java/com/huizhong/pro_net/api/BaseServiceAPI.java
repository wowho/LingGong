package com.huizhong.pro_net.api;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

public interface BaseServiceAPI {

    @GET()
    Call<String> executeGet(@Url String url);

    @GET()
    Call<String> executeGet(@Url String url, @QueryMap Map<String, String> param);

    @POST()
    Call<String> executePost(@Url String url);

    @POST()
    Call<String> executePost(@Url String url, @QueryMap Map<String, String> param);


}
