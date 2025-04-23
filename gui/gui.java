import javax.swing.*;
import java.awt.*;

public class gui {
    public static void main(String[] args) {
        // Create JFrame
        JFrame jf = new JFrame("IEEE Registration FORM");

        // Create a container and set layout
        Container c = jf.getContentPane();
        c.setBackground(Color.cyan);

        // Header (spanning 2 columns)
        JLabel l4 = new JLabel("IEEE Registration FORM", JLabel.LEFT);
        c.setLayout(new GridLayout(0, 2, 5, 10)); // rows = auto, cols = 2, hgap = 5, vgap = 10
        l4.setFont(new Font("Arial", Font.BOLD, 14));
        c.add(l4);
        c.add(new JLabel());  // dummy to fill second column

        // Fullname
        c.add(new JLabel("Fullname:"));
        c.add(new JTextField(10));

        // College Name
        c.add(new JLabel("College Name:"));
        c.add(new JTextField(10));

        // Department
        c.add(new JLabel("Department:"));
        c.add(new JTextField(10));

        // Buttons
        JButton b2 = new JButton("Clear");
        JButton b1 = new JButton("Submit");
        c.add(b2);
        c.add(b1);

        // JFrame properties
        jf.setSize(350, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}

