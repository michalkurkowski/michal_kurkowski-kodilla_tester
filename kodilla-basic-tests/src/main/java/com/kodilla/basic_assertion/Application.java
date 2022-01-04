package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);

        Calculator calculator1 = new Calculator();
        int c = 10;
        int d = 9;
        int subtractResult = calculator1.subtract(c, d);

        Calculator calculator2 = new Calculator();
        int e = 4;
        int n = 3;
        int squaringResult = calculator2.squaring(e, n);

        Calculator calculator3 = new Calculator();
        double f = 0.5;
        double g = 0.8;
        double sumDoubleResult = calculator3.sumDouble(f, g);
    }
}

