package io.github.hanchaa;

abstract class Calculator {
    public abstract int add(int a, int b);

    public abstract int subtract(int a, int b);

    public abstract double average(int[] a);
}

class GoodCalc extends Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public double average(int[] a) {
        double sum = 0;

        for (int i : a)
            sum += i;

        return sum / a.length;
    }
}

public class CalcTest {
    public static void main(String[] args) {
        GoodCalc c = new GoodCalc();
        System.out.println("2 + 3 = " + c.add(2, 3));
        System.out.println("2 - 3 = " + c.subtract(2, 3));
        System.out.println("2 ~ 4 평균 = " + c.average(new int[]{2, 3, 4}));
    }
}
