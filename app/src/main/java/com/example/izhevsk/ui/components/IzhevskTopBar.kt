package com.example.izhevsk.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.izhevsk.R
import com.example.izhevsk.data.Category
import com.example.izhevsk.navigation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IzhevskTopBar(
    currentRoute: String?,
    isTopLevel: Boolean,
    isExpanded: Boolean,
    onMenuClick: () -> Unit,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val title = when (currentRoute) {
        Screen.CoffeeShops.route -> stringResource(id = Category.COFFEE_SHOPS.titleResId)
        Screen.Restaurants.route -> stringResource(id = Category.RESTAURANTS.titleResId)
        Screen.Parks.route -> stringResource(id = Category.PARKS.titleResId)
        Screen.Landmarks.route -> stringResource(id = Category.LANDMARKS.titleResId)
        Screen.ShoppingMalls.route -> stringResource(id = Category.SHOPPING_MALLS.titleResId)
        Screen.About.route -> stringResource(id = R.string.about)
        Screen.Settings.route -> stringResource(id = R.string.settings)
        else -> stringResource(id = R.string.app_name)
    }

    TopAppBar(
        title = { Text(text = title) },
        modifier = modifier,
        navigationIcon = {
            if (isTopLevel) {
                if (!isExpanded) {
                    IconButton(onClick = onMenuClick) {
                        Icon(
                            imageVector = Icons.Default.Menu,
                            contentDescription = stringResource(id = R.string.menu)
                        )
                    }
                }
            } else {
                IconButton(onClick = onBackClick) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = stringResource(id = R.string.back)
                    )
                }
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
            navigationIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer
        )
    )
}
