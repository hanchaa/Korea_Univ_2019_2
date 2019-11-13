package Practice.NOV06;

class Point {
    private int x, y;

    public Point(int a, int b) {
        x = a;
        y = b;
    }

    @Override
    public String toString() {
        return "[X=" + x + ", Y=" + y + "]";
    }
}

class Circle5 {
    private int radius;
    private Point center;

    public Circle5(Point p, int r) {
        center = p;
        radius = r;
    }

    @Override
    public String toString() {
        return "반지름 : " + radius + "\n중심 : " + center;
    }
}

public class Test5 {
    public static void main(String[] args) {
        Point p = new Point(25, 78);
        System.out.println(p);

        Circle5 c = new Circle5(p, 10);
        System.out.println(c);
    }
}
