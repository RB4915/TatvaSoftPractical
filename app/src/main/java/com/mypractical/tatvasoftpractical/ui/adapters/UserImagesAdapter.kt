package com.mypractical.tatvasoftpractical.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mypractical.tatvasoftpractical.R


class UserImagesAdapter(private val context: Context, private val items: ArrayList<String>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (items.size % 2 == 0 && items.size == 2) {
            val v: View =
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.adapter_userdata_list_2items, parent, false)
            return VHHeader2Items(v)

        } else if (items.size % 2 == 0 && items.size > 4) {
            val v: View =
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.adapter_userdata_list_4items, parent, false)
            return VHHeader4Items(v)

        } else if (items.size % 2 != 0 && items.size > 4) {
            val v: View =
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.adapter_userdata_list_5items, parent, false)
            return VHHeader5Items(v)

        } else if (items.size % 2 != 0 && items.size == 3) {
            val v: View =
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.adapter_userdata_list_3items, parent, false)
            return VHHeader3Items(v)


        } else {
            val v: View =
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.adapter_userdata_list, parent, false)
            return VHHeader(v)
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        if (items.size % 2 == 0 && items.size == 2) {
            val user: String = items[position]
            val VHheader = holder as VHHeader2Items
            Glide.with(context).asBitmap().load(user).into(VHheader.imgUserImage)
            Glide.with(context).asBitmap().load(user).into(VHheader.imgUserImage2)
        } else if (items.size % 2 == 0 && items.size > 4) {
            val user: String = items[position]
            val VHheader = holder as VHHeader4Items
            Glide.with(context).asBitmap().load(user).into(VHheader.imgUserImage)
            Glide.with(context).asBitmap().load(user).into(VHheader.imgUserImage2)
            Glide.with(context).asBitmap().load(user).into(VHheader.imgUserImage3)
            Glide.with(context).asBitmap().load(user).into(VHheader.imgUserImage4)

        } else if (items.size % 2 != 0 && items.size > 4) {
            val user: String = items[position]
            val VHheader = holder as VHHeader5Items
            Glide.with(context).asBitmap().load(user).into(VHheader.imgUserImage)
            Glide.with(context).asBitmap().load(user).into(VHheader.imgUserImage2)
            Glide.with(context).asBitmap().load(user).into(VHheader.imgUserImage3)
            Glide.with(context).asBitmap().load(user).into(VHheader.imgUserImage4)
            Glide.with(context).asBitmap().load(user).into(VHheader.imgUserImage5)
        } else if (items.size % 2 != 0 && items.size == 3) {
            val user: String = items[position]
            val VHheader = holder as VHHeader3Items
            Glide.with(context).asBitmap().load(user).into(VHheader.imgUserImage)
            Glide.with(context).asBitmap().load(user).into(VHheader.imgUserImage2)
            Glide.with(context).asBitmap().load(user).into(VHheader.imgUserImage3)

        } else {
            val user: String = items[position]
            val VHheader = holder as VHHeader
            Glide.with(context).asBitmap().load(user).into(VHheader.imgUserImage)
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }


    internal inner class VHHeader(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgUserImage: ImageView

        init {
            imgUserImage = itemView.findViewById(R.id.imgUserImages)

        }
    }


    internal inner class VHHeader2Items(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgUserImage: ImageView
        var imgUserImage2: ImageView


        init {
            imgUserImage = itemView.findViewById(R.id.imgUserImages2item1)
            imgUserImage2 = itemView.findViewById(R.id.imgUserImages2item2)

        }
    }

    internal inner class VHHeader3Items(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgUserImage: ImageView
        var imgUserImage2: ImageView
        var imgUserImage3: ImageView


        init {
            imgUserImage = itemView.findViewById(R.id.imgUserImages3item1)
            imgUserImage2 = itemView.findViewById(R.id.imgUserImages3item2)
            imgUserImage3 = itemView.findViewById(R.id.imgUserImages3item3)

        }
    }


    internal inner class VHHeader4Items(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgUserImage: ImageView
        var imgUserImage2: ImageView
        var imgUserImage3: ImageView
        var imgUserImage4: ImageView


        init {
            imgUserImage = itemView.findViewById(R.id.imgUserImages4item1)
            imgUserImage2 = itemView.findViewById(R.id.imgUserImages4item2)
            imgUserImage3 = itemView.findViewById(R.id.imgUserImages4item3)
            imgUserImage4 = itemView.findViewById(R.id.imgUserImages4item4)

        }
    }

    internal inner class VHHeader5Items(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgUserImage: ImageView
        var imgUserImage2: ImageView
        var imgUserImage3: ImageView
        var imgUserImage4: ImageView
        var imgUserImage5: ImageView


        init {
            imgUserImage = itemView.findViewById(R.id.imgUserImages5item1)
            imgUserImage2 = itemView.findViewById(R.id.imgUserImages5item2)
            imgUserImage3 = itemView.findViewById(R.id.imgUserImages5item3)
            imgUserImage4 = itemView.findViewById(R.id.imgUserImages5item4)
            imgUserImage5 = itemView.findViewById(R.id.imgUserImages5item5)

        }
    }

}