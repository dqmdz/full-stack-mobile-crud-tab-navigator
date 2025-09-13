package com.dqmdz.client.network.model

import kotlinx.serialization.Serializable

@Serializable
data class ProductRequest(
    val description: String,
    val price: Double
)