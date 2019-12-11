package Practice.DEC11;

import javax.swing.*;
import java.awt.*;

public class Test2 extends JFrame {
    public Test2(){
        setTitle("GridLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new GridLayout(4,2, 0, 5));

        c.add(new JLabel("이름", JLabel.CENTER));
        c.add(new JTextField(""));
        c.add(new JLabel("학번", JLabel.CENTER));
        c.add(new JTextField(""));
        c.add(new JLabel("학과", JLabel.CENTER));
        c.add(new JTextField(""));
        c.add(new JLabel("과목", JLabel.CENTER));
        c.add(new JTextField(""));

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Test2();
    }
}
