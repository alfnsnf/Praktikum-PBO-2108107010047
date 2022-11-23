
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Border extends JFrame {
    // Construct the frame 
    public Border() {
        super("Layout Tester");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout());
        add(new JButton("One"),BorderLayout.NORTH);
        add(new JButton("Two"),BorderLayout.WEST);
        add(new JButton("Three"),BorderLayout.CENTER);
        add(new JButton("Four"),BorderLayout.EAST);
        add(new JButton("Five"),BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    public static void main (String[] args) {
        new Border();
    }
}
