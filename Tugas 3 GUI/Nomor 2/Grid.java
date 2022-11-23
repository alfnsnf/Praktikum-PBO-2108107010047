

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Grid  extends JFrame{
    public Grid() {
        super("Layout Tester");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(3, 2));
        add(new JButton("One"));
        add(new JButton("Two"));
        add(new JButton("Three"));
        add(new JButton("Four"));
        add(new JButton("Five"));

        pack();
        setVisible(true);
    }

    public static void main(String args[]) {
        new Grid();

    }
}
