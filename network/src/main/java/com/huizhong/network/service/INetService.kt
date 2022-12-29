package com.huizhong.network.service

import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

abstract interface INetService {

    @GET()
    abstract fun get()

    @POST()
    abstract fun post()
}