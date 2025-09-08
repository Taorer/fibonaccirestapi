package hu.obuda.devops.fibonaccirestapi.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FibonacciServiceTest {

    private val underTest = FibonacciService()
    @Test
    fun shouldReturn0WhenCall1() {
        // given

        // when
        val result: Int = underTest.fibonacci(1)
        // then
        Assertions.assertEquals(0, result)
    }

    @Test
    fun shouldReturn1WhenCall2() {
        // given

        // when
        val result: Int = underTest.fibonacci(2)
        // then
        Assertions.assertEquals(1, result)
    }

    @Test
    fun shouldReturn1WhenCall3() {
        // given

        // when
        val result: Int = underTest.fibonacci(3)
        // then
        Assertions.assertEquals(1, result)
    }

    @Test
    fun shouldReturn34WhenCall10() {
        // given

        // when
        val result: Int = underTest.fibonacci(10)
        // then
        Assertions.assertEquals(34, result)
    }

    @Test
    fun shouldReturn4181WhenCall20() {
        // given

        // when
        val result: Int = underTest.fibonacci(20)
        // then
        Assertions.assertEquals(4181, result)
    }

    @Test
    fun shouldReturnErrorWhenCall0() {
        // given

        // when
        val result: Int = underTest.fibonacci(0)
        // then
        Assertions.assertEquals(-1, result)
    }

    @Test
    fun shouldReturnErrorWhenCallMinus1() {
        // given

        // when
        val result: Int = underTest.fibonacci(-1)
        // then
        Assertions.assertEquals(-1, result)
    }

    @Test
    fun shouldReturnErrorWhenCall47() {
        // given

        // when
        val result: Int = underTest.fibonacci(47)
        // then
        Assertions.assertEquals(-1, result)
    }

    // TODO - Test with greater numbers and test edge cases
}