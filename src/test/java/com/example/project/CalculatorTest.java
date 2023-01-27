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

    @Test
    @DisplayName("6 - 2 = 4")
    void subtractTwoNumbers () {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.substract(6, 2), "6 - 2 = 4");
    }

    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "3,    1,   2",
            "6,    2,   4",
            "11,   4,   7",
            "18,   3,  15"
    }) void subtract(int first, int second, int expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.substract(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("2 * 4 = 8")
    void multiplyTwoNumbers () {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.multiply(2, 4), "2 * 4 = 8");
    }

    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "2,    3,   6",
            "4,    2,   8",
            "3,    3,   9",
            "4,    3,  12"
    }) void multiply(int first, int second, int expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.multiply(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("9 / 3 = 3")
    void divideTwoNumbers () {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.divide(9, 3), "9 / 3 = 3");
    }

    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "3,    3,   1",
            "6,    2,   3",
            "12,   3,   4",
            "16,   8,   2"
    }) void divide(int first, int second, int expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.divide(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }

}
