package com.neppplus.orderapp_20220618

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.neppplus.orderapp_20220618.datas.StoreData
import kotlinx.android.synthetic.main.activity_view_store_detail.*

class ViewStoreDetailActivity : AppCompatActivity() {

    lateinit var mStoreData : StoreData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)
        mStoreData = intent.getSerializableExtra("store") as StoreData
        setupEvents()
        setValues()
    }

    fun setupEvents() {

    }

    fun setValues() {

        Glide.with(this).load(mStoreData.logoURL).into( imgLogo )

        txtStoreName.text = mStoreData.name

        storeRatingBar.rating = mStoreData.point.toFloat()

        txtPhoneNum.text = mStoreData.phoneNum

        txtStoreRating.text = "(${mStoreData.point})"

    }

}