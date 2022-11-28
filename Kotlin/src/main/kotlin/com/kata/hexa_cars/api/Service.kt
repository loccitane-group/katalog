package com.kata.hexa_cars.api

import com.kata.hexa_cars.domain.ServiceDomain

class Service(val domainService: ServiceDomain) {

    fun getListOfCarsToBeRevised(): List<CarToBeRevised>{
        return domainService.getCarsToBeRevised().map { it.toCarToBeRevised() }
    }
}
