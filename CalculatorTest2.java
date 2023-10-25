package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest2 {

    @Test
    void multiply() {
        assertEquals(16, Calculator.multiply(4,4));
    }
}