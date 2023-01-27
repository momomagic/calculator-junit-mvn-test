package com.example.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {

    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
    }

    @Test
    @DisplayName("3 - 2 = 1")
    void subtractTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.substract(3,2), "3 - 2 should equal 2");
    }

    @Test
    @DisplayName("5 * 5 = 25")
    void multiplyTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(25, calculator.multiply(5,5), "5 * 5 should equal 25");
    }

    @Test
    @DisplayName("10 / 2 = 5")
    void divideTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.divide(10,2), "10 / 2 should equal 5");
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

    void subtract(int second, int first, int expectedResult2) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult2, calculator.substract(second, first),
                () -> second + " + " + first + " should equal " + expectedResult2);

    }

    void multiply(int second, int first, int expectedResult3) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult3, calculator.substract(second, first),
                () -> second + " + " + first + " should equal " + expectedResult3);

    }

    void divide (int second, int first, int expectedResult4) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult4, calculator.substract(second, first),
                () -> second + " + " + first + " should equal " + expectedResult4);

    }
}
