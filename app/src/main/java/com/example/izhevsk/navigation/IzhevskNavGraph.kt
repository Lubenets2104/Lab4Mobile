package com.example.izhevsk.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.izhevsk.data.Category
import com.example.izhevsk.ui.screens.AboutScreen
import com.example.izhevsk.ui.screens.CategoryListScreen
import com.example.izhevsk.ui.screens.PlaceDetailScreen
import com.example.izhevsk.ui.screens.SettingsScreen
import com.example.izhevsk.viewmodel.IzhevskViewModel

@Composable
fun IzhevskNavGraph(
    navController: NavHostController,
    viewModel: IzhevskViewModel,
    innerPadding: PaddingValues,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Screen.CoffeeShops.route,
        modifier = modifier.padding(innerPadding)
    ) {
        composable(Screen.CoffeeShops.route) {
            CategoryListScreen(
                category = Category.COFFEE_SHOPS,
                viewModel = viewModel,
                onPlaceClick = { placeId ->
                    navController.navigate(Screen.PlaceDetail.createRoute(placeId))
                }
            )
        }

        composable(Screen.Restaurants.route) {
            CategoryListScreen(
                category = Category.RESTAURANTS,
                viewModel = viewModel,
                onPlaceClick = { placeId ->
                    navController.navigate(Screen.PlaceDetail.createRoute(placeId))
                }
            )
        }

        composable(Screen.Parks.route) {
            CategoryListScreen(
                category = Category.PARKS,
                viewModel = viewModel,
                onPlaceClick = { placeId ->
                    navController.navigate(Screen.PlaceDetail.createRoute(placeId))
                }
            )
        }

        composable(Screen.Landmarks.route) {
            CategoryListScreen(
                category = Category.LANDMARKS,
                viewModel = viewModel,
                onPlaceClick = { placeId ->
                    navController.navigate(Screen.PlaceDetail.createRoute(placeId))
                }
            )
        }

        composable(Screen.ShoppingMalls.route) {
            CategoryListScreen(
                category = Category.SHOPPING_MALLS,
                viewModel = viewModel,
                onPlaceClick = { placeId ->
                    navController.navigate(Screen.PlaceDetail.createRoute(placeId))
                }
            )
        }

        composable(
            route = Screen.PlaceDetail.route,
            arguments = listOf(
                navArgument("placeId") { type = NavType.IntType }
            )
        ) { backStackEntry ->
            val placeId = backStackEntry.arguments?.getInt("placeId") ?: return@composable
            PlaceDetailScreen(
                placeId = placeId,
                viewModel = viewModel,
                onBackClick = { navController.popBackStack() }
            )
        }

        composable(Screen.About.route) {
            AboutScreen()
        }

        composable(Screen.Settings.route) {
            SettingsScreen()
        }
    }
}
