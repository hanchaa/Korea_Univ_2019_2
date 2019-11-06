package io.github.hanchaa;

abstract class Shape {
    private int x, y;

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw();
}

class Circle extends Shape {
    private int radius;

    @Override
    public void draw() {
        System.out.println("원 그리기");
    }
}

class Rectangle extends Shape {
    private int width, height;

    @Override
    public void draw() {
        System.out.println("사각형 그리기");
    }
}

public class BankTest {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        Circle obj2 = new Circle();

        obj1.draw();
        obj2.draw();
    }
}
