/*Try to develop the following user interfaces.. For last interface, you don’t need to make any actions..
The following UI is used to change the background color of the UI. When user press on the button color will change…*/

//IntelliJ IDEA 2023.1

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class BackgroundColorChanger extends JFrame implements ActionListener {
    private JButton blueButton, redButton, greenButton, setDefaultButton;
    private JPanel panel;

    public BackgroundColorChanger() {
        setTitle("Click to Change Color");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 300)); // Set a larger size for the JFrame
        initComponents();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents() {
        panel = new JPanel();
        getContentPane().add(panel);

        blueButton = new JButton("Blue");
        redButton = new JButton("Red");
        greenButton = new JButton("Green");
        setDefaultButton = new JButton("Set Default");

        blueButton.addActionListener(this);
        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        setDefaultButton.addActionListener(this);

        panel.add(blueButton);
        panel.add(redButton);
        panel.add(greenButton);
        panel.add(setDefaultButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "Blue":
                panel.setBackground(Color.BLUE);
                break;
            case "Red":
                panel.setBackground(Color.RED);
                break;
            case "Green":
                panel.setBackground(Color.GREEN);
                break;
            case "Set Default":
                panel.setBackground(null);
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BackgroundColorChanger());
    }
}
