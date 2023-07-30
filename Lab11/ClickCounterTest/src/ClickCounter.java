
//IntelliJ IDEA 2023.1
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickCounter extends JFrame implements ActionListener {
    private JButton clickButton;
    private JLabel countLabel;
    private int clickCount;

    public ClickCounter() {
        setTitle("Click Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        setSize(300, 150); // Set a larger size for the JFrame
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents() {
        clickCount = 0;

        JPanel panel = new JPanel(new FlowLayout());

        clickButton = new JButton("Click Me!");
        clickButton.addActionListener(this);

        countLabel = new JLabel("Click Count: " + clickCount);

        panel.add(clickButton);
        panel.add(countLabel);

        getContentPane().add(panel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clickButton) {
            clickCount++;
            countLabel.setText("Click Count: " + clickCount);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ClickCounter());
    }
}
