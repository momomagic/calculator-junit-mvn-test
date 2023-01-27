package com.example.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private static final Calculator calculator = new Calculator();

    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");

    }

    @ParameterizedTest(name = "{0} {3} {1} = {2}")
    @CsvSource({
            "0,    2,   1, ADD",
            "1,    2,   3, ADD",
            "49,  51, 100, ADD",
            "105,  4, 101, SUBTRACT",
            "113,  10, 103, SUBTRACT",
            "15,  7, 8, SUBTRACT",
            "15,  0, 0, MULTIPLY",
            "5,  7, 35, MULTIPLY",
            "15,  7, 105, MULTIPLY",
            "48,  6, 8, DIVIDE",
            "35,  7, 5, DIVIDE",
            "210,  7, 30, DIVIDE"
    })
    void testOperation(int first, int second, int expectedResult, String operation) {
        switch (operation) {
            case "ADD":
                assertEquals(expectedResult, calculator.add(first, second),
                         first + " + " + second + " should equal " + expectedResult);
                break;
            case "SUBTRACT":
                assertEquals(expectedResult, calculator.subtract(first, second),
                         first + " - " + second + " should equal " + expectedResult);
                break;
            case "MULTIPLY":
                assertEquals(expectedResult, calculator.multiply(first, second),
                         first + " * " + second + " should equal " + expectedResult);
                break;
            case "DIVIDE":
                assertEquals(expectedResult, calculator.divide(first, second),
                         first + " + " + second + " should equal " + expectedResult);
                break;
        }
    }
}



