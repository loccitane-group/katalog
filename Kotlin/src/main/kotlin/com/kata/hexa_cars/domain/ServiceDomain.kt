package com.kata.hexa_cars.domain

import com.kata.hexa_cars.api.CarToBeRevised
import java.time.LocalDate


data class CarDomain(
    private val name: String,
    private val color: String,
    private val model: String,
    private val dateOfRelease: LocalDate,
    private val dateOfNextRevision: LocalDate
) {
    fun toCarToBeRevised(): CarToBeRevised {
        return CarToBeRevised(
            name=this.name,
            color= this.color,
            model= this.model,
            yearOfRelease = this.dateOfRelease.year,
            dateOfNextRevision= this.dateOfNextRevision
        )
    }
}

interface ServiceDomain {
   fun getCarsToBeRevised(): List<CarDomain>
}
