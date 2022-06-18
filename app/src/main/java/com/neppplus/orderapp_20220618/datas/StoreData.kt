package com.neppplus.orderapp_20220618.datas

import java.io.Serializable

class StoreData(
    val name: String,
    val phoneNum: String,
    val point: Double,
    val logoURL: String,
) : Serializable {
}