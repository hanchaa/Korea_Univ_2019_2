package Practice.DEC11;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Test1 extends JFrame {
    public Test1() {
        setTitle("ContentPane과 JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setBackground(Color.ORANGE);

//        c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
//        c.add(new JButton("Calculate"));
//        c.add(new JButton("add"));
//        c.add(new JButton("sub"));
//        c.add(new JButton("mul"));
//        c.add(new JButton("div"));

        c.setLayout(new BorderLayout(30, 20));
        c.add(new JButton("Calculate"), BorderLayout.CENTER);
        c.add(new JButton("add"), BorderLayout.NORTH);
        c.add(new JButton("sub"), BorderLayout.SOUTH);
        c.add(new JButton("mul"), BorderLayout.EAST);
        c.add(new JButton("div"), BorderLayout.WEST);

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Test1();
    }
}
