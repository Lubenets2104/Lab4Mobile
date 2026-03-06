package com.example.izhevsk.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.izhevsk.R
import com.example.izhevsk.data.Category
import com.example.izhevsk.navigation.Screen

@Composable
fun DrawerContent(
    currentRoute: String?,
    onCategorySelected: (Category) -> Unit,
    onAboutClick: () -> Unit,
    onSettingsClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .width(300.dp)
            .fillMaxHeight()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        Text(
            text = stringResource(id = R.string.app_name),
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(16.dp)
        )

        HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))

        Category.entries.forEach { category ->
            NavigationDrawerItem(
                icon = {
                    Icon(
                        painter = painterResource(id = category.iconResId),
                        contentDescription = null
                    )
                },
                label = {
                    Text(text = stringResource(id = category.titleResId))
                },
                selected = currentRoute == category.route,
                onClick = { onCategorySelected(category) },
                modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
            )
        }

        HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))

        NavigationDrawerItem(
            icon = {
                Icon(
                    imageVector = Icons.Outlined.Info,
                    contentDescription = null
                )
            },
            label = {
                Text(text = stringResource(id = R.string.about))
            },
            selected = currentRoute == Screen.About.route,
            onClick = onAboutClick,
            modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
        )

        NavigationDrawerItem(
            icon = {
                Icon(
                    imageVector = Icons.Outlined.Settings,
                    contentDescription = null
                )
            },
            label = {
                Text(text = stringResource(id = R.string.settings))
            },
            selected = currentRoute == Screen.Settings.route,
            onClick = onSettingsClick,
            modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}
