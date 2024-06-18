package com.example.application1.app.javaexs;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    Calculator calculator;

    protected void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator();
    }


    public void testAdd() {
        int expected = 30;
        int actual = calculator.add(10, 20);
        assertEquals(expected, actual);
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testMultiply() {
        int expected = 20;
        int actual = calculator.multiply(20, 4);
        assertEquals(expected, actual);
    }
}