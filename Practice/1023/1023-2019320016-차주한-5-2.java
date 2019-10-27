package io.github.hanchaa;

public class StaticSample {
    public int n;

    static public int m;

    protected void g() {
        m = 20;
    }

    protected void h() {
        m = 30;
    }

    static protected void f() {
        m = 5;
    }

}
