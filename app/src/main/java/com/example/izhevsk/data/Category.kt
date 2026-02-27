package com.example.izhevsk.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.izhevsk.R

enum class Category(
    @StringRes val titleResId: Int,
    @DrawableRes val iconResId: Int,
    val route: String
) {
    COFFEE_SHOPS(R.string.category_coffee_shops, R.drawable.ic_coffee, "coffee_shops"),
    RESTAURANTS(R.string.category_restaurants, R.drawable.ic_restaurant, "restaurants"),
    PARKS(R.string.category_parks, R.drawable.ic_park, "parks"),
    LANDMARKS(R.string.category_landmarks, R.drawable.ic_landmark, "landmarks"),
    SHOPPING_MALLS(R.string.category_shopping, R.drawable.ic_shopping, "shopping_malls")
}
