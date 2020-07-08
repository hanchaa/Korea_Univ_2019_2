package Practice.NOV13;

class Television implements Test4_2 {
    boolean onOff = false;

    public void turnOn() {
        onOff = true;
    }

    public void turnOff() {
        onOff = false;
    }
}

public class Test4_1 {
    public static void main(String[] args) {
        Television t = new Television();
        t.turnOn();
        System.out.println("전원ON: " + t.onOff);
        t.turnOff();
        System.out.println("전원ON: " + t.onOff);
    }
}
