package Practice.DEC11;

import javax.swing.*;
import java.awt.*;

class Timer extends Thread {
    private JLabel l;

    public Timer(JLabel l) {
        this.l = l;
    }

    @Override
    public void run() {
        int n = 0;
        while (true) {
            l.setText(Integer.toString(n));
            n++;
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e){
                return;
            }
        }
    }
}

public class Test5 extends JFrame {
    public Test5() {
        setTitle("타이머 스레드");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel l = new JLabel();
        l.setFont(new Font("Ghotic", Font.ITALIC, 80));
        c.add(l);

        Timer th = new Timer(l);
        th.start();

        setSize(300, 170);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Test5();
    }
}
