package com.example.utsnativemobile

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CharRe(
    val imgChar : Int,
    val nameChar : String,
    val descChar : String
) : Parcelable
