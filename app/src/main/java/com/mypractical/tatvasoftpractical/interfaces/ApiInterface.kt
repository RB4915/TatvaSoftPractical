package com.mypractical.tatvasoftpractical.interfaces

import com.mypractical.tatvasoftpractical.model.DataModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("api/users?")
    fun fetchFeed(
        @Query("offset") offset: String?,
        @Query("limit") limit: String?
    ): Call<DataModel>

}