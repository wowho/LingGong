package com.huizhong.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit

object NetClient {
    lateinit var baseUrl : String

    private val okHttpClient : OkHttpClient
        get(){
            return OkHttpClient.Builder().build()
        }

    fun <T> getAPI(serviceClass : Class<T>) : T{
        return Retrofit.Builder().client(okHttpClient).baseUrl(baseUrl).build().create(serviceClass)
    }
}