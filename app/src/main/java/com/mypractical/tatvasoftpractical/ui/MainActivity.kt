package com.mypractical.tatvasoftpractical.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mypractical.tatvasoftpractical.R
import com.mypractical.tatvasoftpractical.interfaces.ApiInterface
import com.mypractical.tatvasoftpractical.model.DataModel
import com.mypractical.tatvasoftpractical.model.UserImages
import com.mypractical.tatvasoftpractical.ui.adapters.UserDetailsAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    lateinit var rvUserDetails: RecyclerView
    lateinit var userAdapter: UserDetailsAdapter
    private var userList: ArrayList<UserImages> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvUserDetails = findViewById(R.id.rvUserDetails)
        rvUserDetails.apply {
            layoutManager =
                LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
        }

        getCurrentData()

    }


    private fun getCurrentData() {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASEURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val services = retrofit.create(ApiInterface::class.java)

        val call = services.fetchFeed("10", "10")
        call.enqueue(object : Callback<DataModel> {
            override fun onResponse(call: Call<DataModel>, response: Response<DataModel>) {
                if (response.code() == 200) {
                    val resposes = response.body()!!
                    userList = resposes.data!!.users!!
                    userAdapter = UserDetailsAdapter(this@MainActivity, userList)
                    rvUserDetails.adapter = userAdapter

                }
            }

            override fun onFailure(call: Call<DataModel>, t: Throwable) {
            }
        })
    }

    companion object {
        const val BASEURL = "http://sd2-hiring.herokuapp.com/"
    }
}