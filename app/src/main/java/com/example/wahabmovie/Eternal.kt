package com.example.wahabmovie

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Eternal(
    val imgEternal: Int,
    val nameEternal: String,
    val descEternal: String,
    val desc2Eternal: String,
) : Parcelable

