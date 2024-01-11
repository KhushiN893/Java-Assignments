import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculateFact extends JFrame {
    private JLabel numberLabel, resultLabel;
    private JTextField numberField, resultField;
    private JButton calculateButton;

    public CalculateFact() {
        setTitle("Factorial Calculator");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
         getContentPane().setBackground(Color.BLACK); // set background color as black
        numberLabel = new JLabel("Enter a number:");
        numberLabel.setBounds(30, 30, 100, 20);
        numberLabel.setForeground(Color.WHITE);
        add(numberLabel);

        numberField = new JTextField();
        numberField.setBounds(140, 30, 100, 20);
        add(numberField);

        calculateButton = new JButton("Calculate");
        calculateButton.setBounds(140, 70, 100, 30);
        add(calculateButton);
        calculateButton.addActionListener(e -> {
            int number = Integer.parseInt(numberField.getText());
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            resultField.setText(Long.toString(factorial));
        });

        resultLabel = new JLabel("Factorial:");
       resultLabel.setForeground(Color.WHITE);
        resultLabel.setBounds(30, 120, 100, 20);
        add(resultLabel);

        resultField = new JTextField();
        resultField.setBounds(140, 120, 100, 20);
        resultField.setEditable(false);
        add(resultField);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculateFact();
    }
}
