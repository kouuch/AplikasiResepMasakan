package theme;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import java.awt.Font;

public class FlatLafManager {
    public static void applyFlatLaf() {
        try {
            // Atur tema FlatLaf
            UIManager.setLookAndFeel(new FlatLightLaf());

            // Load Font Poppins-Regular
            Font poppinsFont = FontManager.loadFont("Poppins-Regular.ttf", 14f);

            // Terapkan font Poppins secara global
            UIManager.put("defaultFont", poppinsFont);

        } catch (Exception e) {
            System.err.println("Gagal mengatur tema FlatLaf atau font: " + e.getMessage());
        }
    }
}
