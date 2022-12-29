package com.huizhong.linggong

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface TestApi {
    @GET("users/{user}/repos")
    fun listRepos(@Path("user") user: String?): Call<List<Repo?>?>?
}