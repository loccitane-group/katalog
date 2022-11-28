package com.kata.hexa_cars.api

import java.time.LocalDate

data class CarToBeRevised(
    private val name: String,
    private val color: String,
    private val model: String,
    private val yearOfRelease: Int,
    private val dateOfNextRevision: LocalDate
)
