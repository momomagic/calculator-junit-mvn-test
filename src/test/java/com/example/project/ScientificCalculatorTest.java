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
    void authorizeConnection(){
        ScientificCalculator scientificCalculator = new ScientificCalculator(connector, "http://dummy");

        when(connector.connect("http://dummy")).thenReturn(false);
        Assertions.assertThrowsExactly(RuntimeException.class,()->
                scientificCalculator.add(5,4));

    }
}
