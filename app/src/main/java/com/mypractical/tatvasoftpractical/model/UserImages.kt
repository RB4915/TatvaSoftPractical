package com.mypractical.tatvasoftpractical.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.mypractical.tatvasoftpractical.interfaces.ListItems

class UserImages {

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("image")
    @Expose
    var image: String? = null

    @SerializedName("items")
    @Expose
    var items: ArrayList<String>? = null


}