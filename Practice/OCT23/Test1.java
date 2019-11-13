package Practice.OCT23;

public class Test1 {
    int radius;

    public Test1() {
        this.radius = 1;
    }

    public Test1(int radius) {
        this.radius = radius;
    }

    double getArea() {
        return 3.14 * this.radius * this.radius;
    }

    public static void main(String[] args) {
        Test1 donut = new Test1();
        System.out.println(donut.getArea());

        Test1 pizza = new Test1(10);
        System.out.println(pizza.getArea());
    }
}
