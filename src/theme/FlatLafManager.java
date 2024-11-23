package theme;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class FlatLafManager {
    public static void applyFlatLaf() {
        try {
            // Set FlatLaf Theme
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException e) {
            System.err.println("Gagal mengatur tema FlatLaf: " + e.getMessage());
        }
    }
}
