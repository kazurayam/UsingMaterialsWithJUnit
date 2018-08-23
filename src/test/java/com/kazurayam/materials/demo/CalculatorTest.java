package com.kazurayam.materials.demo;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

    @Test
    @Ignore
    public void testEmpty() {
        fail("TO DO");
    }

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        int expected = 12;
        int actual = calc.multiply(3, 4);
        assertThat(actual, is(expected));
    }
}
