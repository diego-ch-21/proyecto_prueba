package com.yengo.proyecto_prueba

data class CardData(
    val title: String,
    val details: String,
    val imageResId: Int // Recurso de imagen
)

object CardDataProvider {
    fun getSampleData(): List<CardData> {
        return listOf(
            CardData("Título 2", "Detalles 2", android.R.drawable.ic_menu_gallery),
            CardData("Título 3", "Detalles 3", android.R.drawable.ic_menu_gallery),
            CardData("Título 4", "Detalles 4", android.R.drawable.ic_menu_gallery),
            CardData("Título 5", "Detalles 5", android.R.drawable.ic_menu_gallery),
            CardData("Título 6", "Detalles 6", android.R.drawable.ic_menu_gallery),
            CardData("Título 7", "Detalles 7", android.R.drawable.ic_menu_gallery)
        )
    }
}