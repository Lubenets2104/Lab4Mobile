package com.example.izhevsk.ui.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.izhevsk.data.Category
import com.example.izhevsk.ui.components.PlaceListItem
import com.example.izhevsk.viewmodel.IzhevskViewModel

@Composable
fun CategoryListScreen(
    category: Category,
    viewModel: IzhevskViewModel,
    onPlaceClick: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    val places = viewModel.getPlacesByCategory(category)

    LazyColumn(modifier = modifier) {
        item {
            Spacer(modifier = Modifier.height(8.dp))
        }

        items(places, key = { it.id }) { place ->
            PlaceListItem(
                place = place,
                onClick = { onPlaceClick(place.id) }
            )
        }

        item {
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}
