package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(3, calc.add(1.4,1.6));

    }

    @Test
    public void testSubtract() {
        assertEquals(4, calc.sub(6.4,2.4));
    }

    @Test
    public void testMultiply() {
        assertEquals(8, calc.mul(2,4));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calc.div(4,2));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.div(10,0));
    }
}
