package com.mypractical.tatvasoftpractical.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.mypractical.tatvasoftpractical.interfaces.ListItems


class UserDetails {

    @SerializedName("users")
    @Expose
    var users: ArrayList<UserImages>? = null

    @SerializedName("has_more")
    @Expose
    var hasMore: Boolean? = null


   
}