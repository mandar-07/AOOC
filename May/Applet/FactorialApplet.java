import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FactorialApplet extends Applet implements ActionListener {
    private TextField inputField;
    private Label resultLabel;

    // Applet initialization
    public void init() {
        setLayout(new FlowLayout());

        add(new Label("Enter a number:"));
        inputField = new TextField(10);
        add(inputField);

        Button computeButton = new Button("Compute Factorial");
        computeButton.addActionListener(this);
        add(computeButton);

        resultLabel = new Label("Result will appear here");
        add(resultLabel);
    }

    // Handle button click
    public void actionPerformed(ActionEvent e) {
        try {
            int num = Integer.parseInt(inputField.getText());
            long factorial = computeFactorial(num);
            resultLabel.setText("Factorial: " + factorial);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input!");
        }
    }

    // Compute factorial
    private long computeFactorial(int n) {
        if (n <= 1) return 1;
        return n * computeFactorial(n - 1);
    }

    // --- Added for standalone support ---
    public static void main(String[] args) {
        // Create a JFrame to host the applet as a standalone app
        JFrame frame = new JFrame("Factorial Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150); // Adjusted for better layout

        // Create and set up the applet
        FactorialApplet applet = new FactorialApplet();
        applet.init();
        applet.start();

        // Add the applet to the frame
        frame.add(applet);
        frame.setVisible(true);
    }
}