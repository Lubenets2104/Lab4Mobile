package com.example.izhevsk.navigation

sealed class Screen(val route: String) {
    data object CoffeeShops : Screen("coffee_shops")
    data object Restaurants : Screen("restaurants")
    data object Parks : Screen("parks")
    data object Landmarks : Screen("landmarks")
    data object ShoppingMalls : Screen("shopping_malls")
    data object PlaceDetail : Screen("place_detail/{placeId}") {
        fun createRoute(placeId: Int): String = "place_detail/$placeId"
    }
    data object About : Screen("about")
    data object Settings : Screen("settings")
}
