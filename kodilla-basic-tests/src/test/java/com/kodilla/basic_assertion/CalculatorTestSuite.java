package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.ResultChecker.assertEqualsWithDelta;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator1 = new Calculator();
        int c = 10;
        int d = 9;
        int sumResult = calculator1.subtract(c, d);
        assertEquals(1, sumResult);
    }

    @Test
    public void testSquaring() {
        Calculator calculator2 = new Calculator();
        int e = 8;
        int n = 8;
        int squaringResult = calculator2.squaring(e, n);
        assertEquals(16777216, squaringResult);
    }

    @Test
    public void testSquaring1() {
        Calculator calculator2 = new Calculator();
        int e = -1;
        int n = 8;
        int squaringResult = calculator2.squaring(e, n);
        assertEquals(1, squaringResult);
    }

    @Test
    public void testSquaring2() {
        Calculator calculator2 = new Calculator();
        int e = 0;
        int n = 8;
        int squaringResult = calculator2.squaring(e, n);
        assertEquals(0, squaringResult);
    }

    @Test
    public void testSumDouble() {
        Calculator calculator3 = new Calculator();
        double f = 0.5;
        double g = 0.8;
        double sumDoubleResult = calculator3.sumDouble(f, g);
        assertEqualsWithDelta(1.3,1.34,1.3456);
    }
}
