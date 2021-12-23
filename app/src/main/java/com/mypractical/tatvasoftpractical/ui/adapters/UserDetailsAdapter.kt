package com.mypractical.tatvasoftpractical.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mypractical.tatvasoftpractical.R
import com.mypractical.tatvasoftpractical.model.UserImages
import com.mypractical.tatvasoftpractical.utils.GridSpacingItemDecoration


class UserDetailsAdapter(private val context: Context, private val items: ArrayList<UserImages>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val v: View =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.adapter_userdata_header, parent, false)
        return VHHeader(v)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val user: UserImages = items[position]
        val VHheader = holder as VHHeader


        Glide.with(context).asBitmap().load(user.image).into(VHheader.imgUserImage)

        VHheader.txtUserName.text = user.name
        holder.rvUserImages.apply {
            layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        }

        holder.rvUserImages.addItemDecoration(GridSpacingItemDecoration(4, 40, true))


        holder.rvUserImages.adapter = UserImagesAdapter(context, user.items!!)

    }

    override fun getItemCount(): Int {
        return items.size
    }


    internal inner class VHHeader(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgUserImage: ImageView
        var txtUserName: TextView
        var rvUserImages: RecyclerView

        init {
            imgUserImage = itemView.findViewById(R.id.imgUserImage)
            txtUserName = itemView.findViewById(R.id.txtUserName)
            rvUserImages = itemView.findViewById(R.id.rvUserImage)
        }
    }


}