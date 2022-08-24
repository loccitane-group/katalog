package com.loccitane.kata

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class AppTest {

    @Test
    fun `App has a greeting`() {
        val classUnderTest = App()
        assertThat(classUnderTest.greeting).isEqualTo("Hello World!")
    }
}
