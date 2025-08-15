import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                // Use cross-platform look and feel for Java 8 compatibility
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } catch (Exception e) {
                // Fallback to default look and feel
            }
            new RouteFinderApp();
        });
    }
}