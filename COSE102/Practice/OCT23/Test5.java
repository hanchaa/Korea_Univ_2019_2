package Practice.OCT23;

class StaticSample {
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

public class Test5 {
    public static void main(String[] args) {
        StaticSample S1, S2;

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
