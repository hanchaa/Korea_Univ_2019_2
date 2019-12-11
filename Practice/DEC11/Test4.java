package Practice.DEC11;

class Tr implements Runnable {
    String name;

    public Tr(String name){
        this.name = name;
    }

    public void run() {
        for (int i = 10; i >= 0; i--)
            System.out.print(name + i + " ");
    }
}

public class Test4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Tr("A"));
        t1.start();
        Thread t2 = new Thread(new Tr("B"));
        t2.start();
    }
}
