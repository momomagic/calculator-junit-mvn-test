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
    @DisplayName("1 - 1 = 0")
    void subtractTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.substract(1,1), "1 - 1 should equal 0");
    }
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "2,    -2,   4",
            "3,    1,   2",
            "50,  2, 48",
            "101,  100, 1"
    })
    void substract(int first, int second, int expectedResult){
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.substract(first, second),
                () -> first + " - " + second + "should equal " + expectedResult);
    }

    @Test
    @DisplayName("1 * 1 = 1")
    void multiplyTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.multiply(1,1), "1 * 1 should equal 1");
    }
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "2,    -1,   -2",
            "3,    3,   9",
            "50,  2, 100",
            "100,  3, 300"
    })
    void multiply(int first, int second, int expectedResult){
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.multiply(first, second),
                () -> first + " * " + second + "should equal " + expectedResult);
    }

}
