package com.loccitane.kata

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FizzBuzzTest {
    @Test
    fun `Should return 1 given 1 in param`() {
        assertThat(FizzBuzz().run(1)).isEqualTo("1")
    }
    @Test
    fun `Should return fizz if multiple of 3`() {
        assertThat(FizzBuzz().run(6)).isEqualTo("Fizz")
    }

}