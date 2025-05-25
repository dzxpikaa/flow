import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleActionDemo extends JFrame implements ActionListener {
    private JButton button;
    private JLabel label;

    public SimpleActionDemo() {
        setTitle("ActionListener Demo");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new java.awt.FlowLayout());

        // Create components
        button = new JButton("Click Me");
        label = new JLabel("Waiting for click...");

        // Register listener
        button.addActionListener(this);

        // Add components to frame
        add(button);
        add(label);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("Button clicked!");
    }

    public static void main(String[] args) {
        // Direct instantiation without EDT safety
        new SimpleActionDemo();
    }
}