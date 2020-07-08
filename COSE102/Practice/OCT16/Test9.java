package Practice.OCT16;

class MyCounter {
    MyCounter(int value) {
        counter = value;
    }

    int counter;
}

public class Test9 {
    public static void main(String[] args) {
        MyCounter obj1 = new MyCounter(100);
        MyCounter obj2 = new MyCounter(200);
        System.out.println("counter1 = " + obj1.counter);
        System.out.println("counter2 = " + obj2.counter);
    }
}
