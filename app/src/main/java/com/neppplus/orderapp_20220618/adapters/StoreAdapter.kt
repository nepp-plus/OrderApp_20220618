package com.neppplus.orderapp_20220618.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.neppplus.orderapp_20220618.datas.StoreData

class StoreAdapter(
    val mContext: Context,
    resId: Int,
    val mList: ArrayList<StoreData>
) : ArrayAdapter<StoreData>( mContext, resId, mList ) {
}