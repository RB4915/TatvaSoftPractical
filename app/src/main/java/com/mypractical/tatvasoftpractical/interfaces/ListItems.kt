package com.mypractical.tatvasoftpractical.interfaces

interface ListItems {

    val itemType: Int

    companion object {
        const val TYPE_ITEM = 0
        const val TYPE_HEADER = 1
    }
}