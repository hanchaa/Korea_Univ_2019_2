package Practice.OCT16;

class MyMath {
    int square(int i) {
        return i * i;
    }

    double square(double i) {
        return i * i;
    }
}

public class Test8 {
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = 3.14;
        MyMath obj = new MyMath();
        System.out.println(obj.square(num1));
        System.out.println(obj.square(num2));
    }
}
