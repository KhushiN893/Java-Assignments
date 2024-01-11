import javax.swing.*;
import java.awt.*;

public class LayoutDemo extends JFrame {

    public LayoutDemo() {
        setTitle("Java Layout Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        // Create components
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);

        JLabel addressLabel = new JLabel("Address:");
        JTextArea addressArea = new JTextArea(5, 20);
        JScrollPane addressScrollPane = new JScrollPane(addressArea);

        JButton submitButton = new JButton("Submit");

        // Create layout managers
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel inputPanel = new JPanel(new GridLayout(2, 2));
        JPanel buttonPanel = new JPanel(new FlowLayout());

        // Add components to inputPanel
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(addressLabel);
        inputPanel.add(addressScrollPane);

        // Add components to buttonPanel
        buttonPanel.add(submitButton);

        // Add inputPanel and buttonPanel to mainPanel
        mainPanel.add(inputPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Set background colors
        mainPanel.setBackground(Color.BLUE);
        inputPanel.setBackground(Color.CYAN);
        buttonPanel.setBackground(Color.YELLOW);
        nameLabel.setForeground(Color.WHITE);
        addressLabel.setForeground(Color.WHITE);

        // Add mainPanel to JFrame
        add(mainPanel);

        // Display the JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        new LayoutDemo();
    }
}
