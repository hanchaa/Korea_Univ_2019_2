package Practice.OCT16;

public class Test5 {
    String name;
    int radius;

    public Test5() {
        radius = 1;
    }

    public Test5(int r, String n) {
        radius = r;
        name = n;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Test5 donut = new Test5();
        donut.name = "도넛";
        double area = donut.getArea();
        System.out.println(donut.name + "의 면적: " + area);

        Test5 pizza = new Test5(10, "피자");
        area = pizza.getArea();
        System.out.println(pizza.name + "의 면적: " + area);
    }
}
