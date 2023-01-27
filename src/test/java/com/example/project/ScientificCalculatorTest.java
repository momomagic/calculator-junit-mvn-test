package com.example.project;

import com.example.project.http.Connector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ScientificCalculatorTest {
    @Mock
    private Connector connector;

    @Test
    public void testAddShouldWorkIfConnectorSucceeded(){
        ScientificCalculator scientificCalculator = new ScientificCalculator(connector, "http://dummy");

        when(connector.connect("http://dummy")).thenReturn(true);
        //verify(connector).connect("http://dummy");

        int expectedResult1 = scientificCalculator.add(5, 4);
        Assertions.assertEquals(expectedResult1, 9);

        int expectedResult2 = scientificCalculator.substract(5, 4);
        Assertions.assertEquals(expectedResult2, 1);

        int expectedResult3 = scientificCalculator.multiple(5, 4);
        Assertions.assertEquals(expectedResult3, 20);
    }
}
