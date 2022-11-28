package com.kata.hexa_cars.api

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import java.time.LocalDate

internal class ServiceTest{

    @Test
    fun `Should return the cars to be revised`(){
        
        val service = Service()

        val listOfCarsToBeRevised = service.getListOfCarsToBeRevised()

        Assertions.assertThat(listOfCarsToBeRevised).isEqualTo(
            listOf(
            CarToBeRevised(name="name 1",
                color="blue",
                model="break",
                yearOfRelease=2010,
                dateOfNextRevision= LocalDate.of(2025,5,10)
            )
        ));
    }

}
