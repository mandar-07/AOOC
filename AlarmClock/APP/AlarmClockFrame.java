// Import necessary Swing and AWT packages for GUI components
import javax.swing.*;
import java.awt.*;

// Main application window class extending JFrame
public class AlarmClockFrame extends JFrame {
    // GUI Components
    private AlarmPanel alarmPanel;      // Panel for clock and alarm settings
    private PuzzlePanel puzzlePanel;    // Panel for math puzzle when alarm triggers
    private JPanel mainPanel;           // Container panel using CardLayout
    private AlarmController controller; // Business logic controller

    // Constructor - sets up the main application window
    public AlarmClockFrame() {
        // Basic window configuration
        setTitle("Alarm Clock for Heavy Sleeper");  // Window title
        setSize(500, 400);                          // Window dimensions (width, height)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close button behavior
        setLocationRelativeTo(null);                // Center window on screen

        // Initialize the controller that manages alarm logic
        controller = new AlarmController(this);

        // Set up the main panel with CardLayout for screen switching
        mainPanel = new JPanel(new CardLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15)); // Add padding
        mainPanel.setBackground(new Color(240, 240, 240)); // Light gray background

        // Create the two main screens of the application
        alarmPanel = new AlarmPanel(controller);  // Clock/alarm settings screen
        puzzlePanel = new PuzzlePanel(controller); // Math puzzle screen

        // Add both panels to the main panel with unique identifiers
        mainPanel.add(alarmPanel, "alarm");   // First screen (default)
        mainPanel.add(puzzlePanel, "puzzle"); // Second screen

        // Add the main panel to the window
        add(mainPanel);

        // Initialize controller (starts clock timer, loads sounds)
        controller.initialize();
    }

    // ========================
    // Getter Methods
    // (Allow controlled access to components)
    // ========================

    /** Returns the main CardLayout panel for screen switching */
    public JPanel getMainPanel() {
        return mainPanel;
    }

    /** Returns the alarm panel (clock/alarm settings) */
    public AlarmPanel getAlarmPanel() {
        return alarmPanel;
    }

    /** Returns the puzzle panel (math challenge screen) */
    public PuzzlePanel getPuzzlePanel() {
        return puzzlePanel;
    }
}