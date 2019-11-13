package Practice.NOV06;

class Shape4 {
    public Shape4 next;

    public Shape4() {
        next = null;
    }

    public void draw() {
        System.out.println("Shape");
    }
}

class Line extends Shape4 {
    @Override
    public void draw() {
        System.out.println("Line");
    }
}

class Rect extends Shape4 {
    @Override
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle4 extends Shape4 {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

public class Test4 {
    public static void main(String[] args) {
        Shape4 start, last, obj;
        start = new Line();
        last = start;

        obj = new Rect();
        last.next = obj;
        last = obj;

        obj = new Line();
        last.next = obj;
        last = obj;

        obj = new Circle4();
        last.next = obj;

        Shape4 p = start;
        while (p != null) {
            p.draw();
            p = p.next;
        }
    }
}
