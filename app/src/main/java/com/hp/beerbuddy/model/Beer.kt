package com.hp.beerbuddy.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Beer(
    @PrimaryKey
    val id: Int,
    val name: String,
    val tagline: String,
    val ph: Float,
    val abv: Float,
    val description: String,
    val first_brewed: String,
    val image_url: String
)
