package com.example.izhevsk.viewmodel

import androidx.lifecycle.ViewModel
import com.example.izhevsk.data.Category
import com.example.izhevsk.data.Place
import com.example.izhevsk.data.PlaceDataSource

class IzhevskViewModel : ViewModel() {
    private val placesByCategory: Map<Category, List<Place>> =
        Category.entries.associateWith { PlaceDataSource.getPlacesByCategory(it) }

    fun getPlacesByCategory(category: Category): List<Place> =
        placesByCategory[category] ?: emptyList()

    fun getPlaceById(placeId: Int): Place? =
        PlaceDataSource.getPlaceById(placeId)
}
