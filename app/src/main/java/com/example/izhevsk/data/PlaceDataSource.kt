package com.example.izhevsk.data

import com.example.izhevsk.R

object PlaceDataSource {

    private val allPlaces = listOf(
        // Coffee Shops (IDs 1-5)
        Place(
            id = 1,
            category = Category.COFFEE_SHOPS,
            nameResId = R.string.coffee_1_name,
            imageResId = R.drawable.place_coffee_1,
            shortDescriptionResId = R.string.coffee_1_short,
            fullDescriptionResId = R.string.coffee_1_full,
            addressResId = R.string.coffee_1_address
        ),
        Place(
            id = 2,
            category = Category.COFFEE_SHOPS,
            nameResId = R.string.coffee_2_name,
            imageResId = R.drawable.place_coffee_2,
            shortDescriptionResId = R.string.coffee_2_short,
            fullDescriptionResId = R.string.coffee_2_full,
            addressResId = R.string.coffee_2_address
        ),
        Place(
            id = 3,
            category = Category.COFFEE_SHOPS,
            nameResId = R.string.coffee_3_name,
            imageResId = R.drawable.place_coffee_3,
            shortDescriptionResId = R.string.coffee_3_short,
            fullDescriptionResId = R.string.coffee_3_full,
            addressResId = R.string.coffee_3_address
        ),
        Place(
            id = 4,
            category = Category.COFFEE_SHOPS,
            nameResId = R.string.coffee_4_name,
            imageResId = R.drawable.place_coffee_4,
            shortDescriptionResId = R.string.coffee_4_short,
            fullDescriptionResId = R.string.coffee_4_full,
            addressResId = R.string.coffee_4_address
        ),
        Place(
            id = 5,
            category = Category.COFFEE_SHOPS,
            nameResId = R.string.coffee_5_name,
            imageResId = R.drawable.place_coffee_5,
            shortDescriptionResId = R.string.coffee_5_short,
            fullDescriptionResId = R.string.coffee_5_full,
            addressResId = R.string.coffee_5_address
        ),

        // Restaurants (IDs 6-10)
        Place(
            id = 6,
            category = Category.RESTAURANTS,
            nameResId = R.string.restaurant_1_name,
            imageResId = R.drawable.place_restaurant_1,
            shortDescriptionResId = R.string.restaurant_1_short,
            fullDescriptionResId = R.string.restaurant_1_full,
            addressResId = R.string.restaurant_1_address
        ),
        Place(
            id = 7,
            category = Category.RESTAURANTS,
            nameResId = R.string.restaurant_2_name,
            imageResId = R.drawable.place_restaurant_2,
            shortDescriptionResId = R.string.restaurant_2_short,
            fullDescriptionResId = R.string.restaurant_2_full,
            addressResId = R.string.restaurant_2_address
        ),
        Place(
            id = 8,
            category = Category.RESTAURANTS,
            nameResId = R.string.restaurant_3_name,
            imageResId = R.drawable.place_restaurant_3,
            shortDescriptionResId = R.string.restaurant_3_short,
            fullDescriptionResId = R.string.restaurant_3_full,
            addressResId = R.string.restaurant_3_address
        ),
        Place(
            id = 9,
            category = Category.RESTAURANTS,
            nameResId = R.string.restaurant_4_name,
            imageResId = R.drawable.place_restaurant_4,
            shortDescriptionResId = R.string.restaurant_4_short,
            fullDescriptionResId = R.string.restaurant_4_full,
            addressResId = R.string.restaurant_4_address
        ),
        Place(
            id = 10,
            category = Category.RESTAURANTS,
            nameResId = R.string.restaurant_5_name,
            imageResId = R.drawable.place_restaurant_5,
            shortDescriptionResId = R.string.restaurant_5_short,
            fullDescriptionResId = R.string.restaurant_5_full,
            addressResId = R.string.restaurant_5_address
        ),

        // Parks (IDs 11-15)
        Place(
            id = 11,
            category = Category.PARKS,
            nameResId = R.string.park_1_name,
            imageResId = R.drawable.place_park_1,
            shortDescriptionResId = R.string.park_1_short,
            fullDescriptionResId = R.string.park_1_full,
            addressResId = R.string.park_1_address
        ),
        Place(
            id = 12,
            category = Category.PARKS,
            nameResId = R.string.park_2_name,
            imageResId = R.drawable.place_park_2,
            shortDescriptionResId = R.string.park_2_short,
            fullDescriptionResId = R.string.park_2_full,
            addressResId = R.string.park_2_address
        ),
        Place(
            id = 13,
            category = Category.PARKS,
            nameResId = R.string.park_3_name,
            imageResId = R.drawable.place_park_3,
            shortDescriptionResId = R.string.park_3_short,
            fullDescriptionResId = R.string.park_3_full,
            addressResId = R.string.park_3_address
        ),
        Place(
            id = 14,
            category = Category.PARKS,
            nameResId = R.string.park_4_name,
            imageResId = R.drawable.place_park_4,
            shortDescriptionResId = R.string.park_4_short,
            fullDescriptionResId = R.string.park_4_full,
            addressResId = R.string.park_4_address
        ),
        Place(
            id = 15,
            category = Category.PARKS,
            nameResId = R.string.park_5_name,
            imageResId = R.drawable.place_park_5,
            shortDescriptionResId = R.string.park_5_short,
            fullDescriptionResId = R.string.park_5_full,
            addressResId = R.string.park_5_address
        ),

        // Landmarks (IDs 16-20)
        Place(
            id = 16,
            category = Category.LANDMARKS,
            nameResId = R.string.landmark_1_name,
            imageResId = R.drawable.place_landmark_1,
            shortDescriptionResId = R.string.landmark_1_short,
            fullDescriptionResId = R.string.landmark_1_full,
            addressResId = R.string.landmark_1_address
        ),
        Place(
            id = 17,
            category = Category.LANDMARKS,
            nameResId = R.string.landmark_2_name,
            imageResId = R.drawable.place_landmark_2,
            shortDescriptionResId = R.string.landmark_2_short,
            fullDescriptionResId = R.string.landmark_2_full,
            addressResId = R.string.landmark_2_address
        ),
        Place(
            id = 18,
            category = Category.LANDMARKS,
            nameResId = R.string.landmark_3_name,
            imageResId = R.drawable.place_landmark_3,
            shortDescriptionResId = R.string.landmark_3_short,
            fullDescriptionResId = R.string.landmark_3_full,
            addressResId = R.string.landmark_3_address
        ),
        Place(
            id = 19,
            category = Category.LANDMARKS,
            nameResId = R.string.landmark_4_name,
            imageResId = R.drawable.place_landmark_4,
            shortDescriptionResId = R.string.landmark_4_short,
            fullDescriptionResId = R.string.landmark_4_full,
            addressResId = R.string.landmark_4_address
        ),
        Place(
            id = 20,
            category = Category.LANDMARKS,
            nameResId = R.string.landmark_5_name,
            imageResId = R.drawable.place_landmark_5,
            shortDescriptionResId = R.string.landmark_5_short,
            fullDescriptionResId = R.string.landmark_5_full,
            addressResId = R.string.landmark_5_address
        ),

        // Shopping Malls (IDs 21-25)
        Place(
            id = 21,
            category = Category.SHOPPING_MALLS,
            nameResId = R.string.shopping_1_name,
            imageResId = R.drawable.place_shopping_1,
            shortDescriptionResId = R.string.shopping_1_short,
            fullDescriptionResId = R.string.shopping_1_full,
            addressResId = R.string.shopping_1_address
        ),
        Place(
            id = 22,
            category = Category.SHOPPING_MALLS,
            nameResId = R.string.shopping_2_name,
            imageResId = R.drawable.place_shopping_2,
            shortDescriptionResId = R.string.shopping_2_short,
            fullDescriptionResId = R.string.shopping_2_full,
            addressResId = R.string.shopping_2_address
        ),
        Place(
            id = 23,
            category = Category.SHOPPING_MALLS,
            nameResId = R.string.shopping_3_name,
            imageResId = R.drawable.place_shopping_3,
            shortDescriptionResId = R.string.shopping_3_short,
            fullDescriptionResId = R.string.shopping_3_full,
            addressResId = R.string.shopping_3_address
        ),
        Place(
            id = 24,
            category = Category.SHOPPING_MALLS,
            nameResId = R.string.shopping_4_name,
            imageResId = R.drawable.place_shopping_4,
            shortDescriptionResId = R.string.shopping_4_short,
            fullDescriptionResId = R.string.shopping_4_full,
            addressResId = R.string.shopping_4_address
        ),
        Place(
            id = 25,
            category = Category.SHOPPING_MALLS,
            nameResId = R.string.shopping_5_name,
            imageResId = R.drawable.place_shopping_5,
            shortDescriptionResId = R.string.shopping_5_short,
            fullDescriptionResId = R.string.shopping_5_full,
            addressResId = R.string.shopping_5_address
        )
    )

    fun getPlacesByCategory(category: Category): List<Place> =
        allPlaces.filter { it.category == category }

    fun getPlaceById(id: Int): Place? =
        allPlaces.find { it.id == id }
}
