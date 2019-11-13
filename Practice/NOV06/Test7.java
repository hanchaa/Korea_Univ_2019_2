package Practice.NOV06;

abstract class Shape7 {
    private int x, y;

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw();
}

class Circle7 extends Shape7 {
    private int radius;

    @Override
    public void draw() {
        System.out.println("원 그리기");
    }
}

class Rectangle7 extends Shape7 {
    private int width, height;

    @Override
    public void draw() {
        System.out.println("사각형 그리기");
    }
}

public class Test7 {
    public static void main(String[] args) {
        Rectangle7 obj1 = new Rectangle7();
        Circle7 obj2 = new Circle7();

        obj1.draw();
        obj2.draw();
    }
}
