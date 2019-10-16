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
        Circle pizza, donut;
        pizza = new Circle();
        donut = new Circle();

        pizza.name = "피자";
        pizza.radius = 10;
        double pizzaarea = pizza.getArea();
        System.out.println(pizza.name + "의 면적: " + pizzaarea);

        donut.name = "도넛";
        donut.radius = 2;
        double donutarea = donut.getArea();
        System.out.println(donut.name + "의 면적: " + donutarea);
    }
}
