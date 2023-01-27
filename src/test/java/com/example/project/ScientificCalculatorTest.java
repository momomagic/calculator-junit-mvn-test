package com.example.project;

import com.example.project.http.Connector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class ScientificCalculatorTest {
    @Mock private Connector connector;

    @Test
    public void testAddShouldWorkIfConnectorSucceeded() {
        ScientificCalculator scientificCalculator = new ScientificCalculator(connector,"http://dummy");

        when(connector.connect("http://dummy")).thenReturn(true);

        int expectedResult = scientificCalculator.add(5,4);
        Assertions.assertEquals(expectedResult, 9);
        verify(connector).connect("http://dummy");

        when(connector.connect("http://dummy")).thenReturn(false);
        Assertions.assertThrows(RuntimeException.class, () -> scientificCalculator.add(5,4));

    }

    @Test
    public void testSubtractShouldWorkIfConnectorSucceeded() {
        ScientificCalculator scientificCalculator = new ScientificCalculator(connector, "http://dummy");

        when(connector.connect("http://dummy")).thenReturn(true);

        int expectedResult = scientificCalculator.subtract(7,2);
        Assertions.assertEquals(expectedResult, 5);
        verify(connector).connect("http://dummy");

        when(connector.connect("http://dummy")).thenReturn(false);
        Assertions.assertThrows(RuntimeException.class, () -> scientificCalculator.subtract(7,2));
    }

    @Test
    public void testMultiplyShouldWorkIfConnectorSucceeded() {
        ScientificCalculator scientificCalculator = new ScientificCalculator(connector, "http://dummy");

        when(connector.connect("http://dummy")).thenReturn(true);

        int expectedResult = scientificCalculator.multiply(3,2);
        Assertions.assertEquals(expectedResult, 6);
        verify(connector).connect("http://dummy");

        when(connector.connect("http://dummy")).thenReturn(false);
        Assertions.assertThrows(RuntimeException.class, () -> scientificCalculator.multiply(3,2));
    }
}
