package com.example.izhevsk.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.PermanentDrawerSheet
import androidx.compose.material3.PermanentNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.izhevsk.data.Category
import com.example.izhevsk.navigation.IzhevskNavGraph
import com.example.izhevsk.navigation.Screen
import com.example.izhevsk.ui.components.DrawerContent
import com.example.izhevsk.ui.components.IzhevskTopBar
import com.example.izhevsk.viewmodel.IzhevskViewModel
import kotlinx.coroutines.launch

@Composable
fun IzhevskApp(
    viewModel: IzhevskViewModel,
    windowSizeClass: WindowSizeClass,
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val coroutineScope = rememberCoroutineScope()

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    val categoryRoutes = Category.entries.map { it.route }
    val topLevelRoutes = categoryRoutes + listOf(Screen.About.route, Screen.Settings.route)

    val showBottomBar = currentRoute in categoryRoutes
    val isTopLevel = currentRoute in topLevelRoutes
    val isExpanded = windowSizeClass.widthSizeClass == WindowWidthSizeClass.Expanded

    val startDestination = Screen.CoffeeShops.route

    fun navigateToRoute(route: String) {
        navController.navigate(route) {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }

    val drawerContent: @Composable () -> Unit = {
        DrawerContent(
            currentRoute = currentRoute,
            onCategorySelected = { category ->
                navigateToRoute(category.route)
                coroutineScope.launch { drawerState.close() }
            },
            onAboutClick = {
                navigateToRoute(Screen.About.route)
                coroutineScope.launch { drawerState.close() }
            },
            onSettingsClick = {
                navigateToRoute(Screen.Settings.route)
                coroutineScope.launch { drawerState.close() }
            }
        )
    }

    @Composable
    fun IzhevskBottomBar() {
        NavigationBar {
            Category.entries.forEach { category ->
                NavigationBarItem(
                    icon = {
                        Icon(
                            painter = painterResource(id = category.iconResId),
                            contentDescription = stringResource(id = category.titleResId)
                        )
                    },
                    label = {
                        Text(text = stringResource(id = category.titleResId))
                    },
                    selected = currentRoute == category.route,
                    onClick = { navigateToRoute(category.route) }
                )
            }
        }
    }

    @Composable
    fun AppScaffold() {
        Scaffold(
            topBar = {
                IzhevskTopBar(
                    currentRoute = currentRoute,
                    isTopLevel = isTopLevel,
                    isExpanded = isExpanded,
                    onMenuClick = {
                        coroutineScope.launch { drawerState.open() }
                    },
                    onBackClick = {
                        navController.popBackStack()
                    }
                )
            },
            bottomBar = {
                if (showBottomBar) {
                    IzhevskBottomBar()
                }
            }
        ) { innerPadding ->
            IzhevskNavGraph(
                navController = navController,
                viewModel = viewModel,
                innerPadding = innerPadding
            )
        }
    }

    if (isExpanded) {
        PermanentNavigationDrawer(
            drawerContent = {
                PermanentDrawerSheet {
                    drawerContent()
                }
            },
            modifier = modifier.fillMaxSize()
        ) {
            AppScaffold()
        }
    } else {
        ModalNavigationDrawer(
            drawerState = drawerState,
            drawerContent = {
                ModalDrawerSheet {
                    drawerContent()
                }
            },
            modifier = modifier.fillMaxSize()
        ) {
            AppScaffold()
        }
    }
}
