package io.github.hanchaa;

class Shape {
    int x, y;
    public void draw() {
        System.out.println("Shape");
    }
}

class Circle extends Shape{
    int x = 1, y = 1;

    @Override
    public void draw(){
        System.out.println("Circle");
    }
}

class Rectangle extends Shape{
    int x = 2, y = 2;

    @Override
    public void draw(){
        System.out.println("Rectangle");
    }
}

class Triangle extends Shape{
    int  x = 3, y = 3;

    @Override
    public void draw(){
        System.out.println("Triangle");
    }
}

public class CircleTest {
    public static void main(String[] args) {
//        Circle s1 = new Circle();
//        Rectangle s2 = new Rectangle();
//        Triangle s3 = new Triangle();

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        Shape s3 = new Triangle();

        System.out.println(s1.x + ", " + s1.y);
        System.out.println(s2.x + ", " + s2.y);
        System.out.println(s3.x + ", " + s3.y);

        s1.draw();
        s2.draw();
        s3.draw();
    }
}
