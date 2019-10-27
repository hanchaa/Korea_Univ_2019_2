package io.github.hanchaa;

public class Circle {
    int radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    double getArea() {
        return 3.14 * this.radius * this.radius;
    }

    public static void main(String[] args) {
        Circle donut = new Circle();
        System.out.println(donut.getArea());

        Circle pizza = new Circle(10);
        System.out.println(pizza.getArea());
    }
}
