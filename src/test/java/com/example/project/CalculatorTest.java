package com.example.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
    }

    @Test
    @DisplayName("1 - 1 = 0")
    void subtractTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.substract(1, 1));
    }

    @Test
    @DisplayName("1 * 1 = 1")
    void multiplyTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.multiply(1, 1));
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    void add(int first, int second, int expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.add(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "0,    1,   -1",
            "1,    2,   -1",
            "49,  51, -2",
            "1,  100, -99"
    })
    void subtract(int first, int second, int expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.substract(first, second),
                () -> first + " - " + second + " Should equal " + expectedResult);
    }
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "0,    1,   0",
            "1,    2,   2",
            "49,  51, 2499",
            "1,  100, 100"
    })
    void multiply(int first, int second, int expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.multiply(first, second),
                () -> first + " * " + second + " Should equal " + expectedResult);
    }

    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "50,    2,   25",
            "250,    2,   125",
            "100,  4, 25",
            "10,  2, 5"
    })
    void divide(int first, int second, int expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.divide(first, second),
                () -> first + " / " + second + " Should equal " + expectedResult);
    }

}
