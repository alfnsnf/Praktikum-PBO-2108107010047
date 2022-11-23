
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class Flow extends JFrame{
    public Flow() {
        super("Layout Tester");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
        add(new JButton("One"));
        add(new JButton("Two"));
        add(new JButton("Three"));
        add(new JButton("Four"));
        add(new JButton("Five"));

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Flow();
    }
}
