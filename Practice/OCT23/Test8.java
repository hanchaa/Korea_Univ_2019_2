package Practice.OCT23;

class Point8 {
    private int x, y;

    Point8(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}

class ColorPoint8 extends Point8 {
    private String color;

    public ColorPoint8(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public void showColorPoint() {
        System.out.print(color);
        showPoint();
    }
}


public class Test8 {
    public static void main(String[] args) {
        Point8 p = new Point8(1, 2);
        p.showPoint();

        ColorPoint8 cp = new ColorPoint8(3, 4, "red");
        cp.showColorPoint();
    }
}
