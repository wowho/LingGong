package com.huizhong.network

import retrofit2.Retrofit

class RetrofitManager {
    val lock = Any()

    var retrofitMap = HashMap<String, Retrofit>()

    @Synchronized
    fun getRetrofit(baseUrl : String) {

    }
}