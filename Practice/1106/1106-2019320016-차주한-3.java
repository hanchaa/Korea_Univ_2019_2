package io.github.hanchaa;

class Shape {
    protected int x, y;

    public void draw(){
        System.out.println("Shape Draw");
    }
}

class Rectangle extends Shape{
    private int width, height;

    @Override
    public void draw(){
        System.out.println("Recntagle Draw");
    }
}

class Circle extends Shape{
    private int raidus;

    @Override
    public void draw(){
        System.out.println("Circle Draw");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Rectangle s2 = new Rectangle();
        Circle s3 = new Circle();

        s1.draw();
        s2.draw();
        s3.draw();
    }
}
