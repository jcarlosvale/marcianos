package com.marcianos.learning.interfaces.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MyCalculatorTest {

    @ParameterizedTest
    @MethodSource("valoresValidos")
    void algumTeste(int n, int expected){
        //GIVEN
        var myCalculator = new MyCalculator();

        //WHEN
        var actual = myCalculator.divisor_sum(n);

        //THEN
        assertEquals(expected, actual);

    }

    static Stream<Arguments> valoresValidos() {
        return Stream.of(
                arguments(6, 12),
                arguments(1000, 2340)
        );
    }

    @Test
    public void valorNaoPermitidoTest(){
        //GIVEN
        var myCalculator = new MyCalculator();

        //WHEN
        assertThrows(RuntimeException.class, () -> {
            myCalculator.divisor_sum(1001);
        });
    }
}