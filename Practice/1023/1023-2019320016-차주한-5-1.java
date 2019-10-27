package io.github.hanchaa;

public class StaticSampleTest {
    public static void main(String[] args) {
        StaticSample S1 , S2;

        S1 = new StaticSample();
        S1.n = 5;
        S1.g();
        S1.m = 50;
        System.out.println(S1.m);

        S2 = new StaticSample();
        S2.n = 8;
        S2.h();
        S2.f();
        System.out.println(S2.m);
    }
}
