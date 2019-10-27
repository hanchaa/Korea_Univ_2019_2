package io.github.hanchaa;

public class Circle {
    String name;
    int radius;

    public Circle() {
        radius = 1;
    }

    public Circle(int r, String n) {
        radius = r;
        name = n;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Circle donut = new Circle();
        donut.name = "도넛";
        double area = donut.getArea();
        System.out.println(donut.name + "의 면적: " + area);
        
        Circle pizza = new Circle(10, "피자");
        area = pizza.getArea();
        System.out.println(pizza.name + "의 면적: " + area);
    }
}
