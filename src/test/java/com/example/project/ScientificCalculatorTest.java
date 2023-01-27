package com.example.project;

import com.example.project.http.Connector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ScientificCalculatorTest {
    @Mock
    private Connector connector;

    @Test
    public void testAddShouldWorkIfConnectorSucceded() {
        ScientificCalculator scientificCalculator = new ScientificCalculator(connector, "http://");

        when(connector.connect("http://dummy")).thenReturn(true);

//        verify(connector).connect("http://dummy");
        int expectedResult = scientificCalculator.add(5,4);
        Assertions.assertEquals(expectedResult, 9);

        int expectedResult2 = scientificCalculator.subtract(3,2);
        Assertions.assertEquals(expectedResult2, 1);

        int expectedResult3 = scientificCalculator.multiply(5,5);
        Assertions.assertEquals(expectedResult3, 25);

        int expectedResult4 = scientificCalculator.divide(10, 2);
        Assertions.assertEquals(expectedResult4,5);

    }
}
