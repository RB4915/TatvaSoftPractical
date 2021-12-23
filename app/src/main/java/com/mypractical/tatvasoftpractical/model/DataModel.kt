package com.mypractical.tatvasoftpractical.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class DataModel {

    @SerializedName("status")
    @Expose
    private val status: Boolean? = null

    @SerializedName("message")
    @Expose
    private val message: Any? = null

    @SerializedName("data")
    @Expose
    val data: UserDetails? = null


}