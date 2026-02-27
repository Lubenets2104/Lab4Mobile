package com.example.izhevsk.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Place(
    val id: Int,
    val category: Category,
    @StringRes val nameResId: Int,
    @DrawableRes val imageResId: Int,
    @StringRes val shortDescriptionResId: Int,
    @StringRes val fullDescriptionResId: Int,
    @StringRes val addressResId: Int
)
