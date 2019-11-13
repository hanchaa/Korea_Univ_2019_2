package Practice.NOV13.Test1;

public class Test1_2 {
    void f() {
        System.out.println("Class B");
    }
}

class Test1_3 {
    void g() {
        Test1_2 b = new Test1_2();
        System.out.println("Class C");
    }
}

class Test1_4 {
    void h() {
        Test1_3 c = new Test1_3();
        System.out.println("Class D");
    }
}
