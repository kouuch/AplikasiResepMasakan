package theme;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class FontManager {
    public static Font loadFont(String fontName, float fontSize) {
        try {
            // Lokasi font dalam folder theme/fonts
            String fontPath = "src/theme/fonts/" + fontName;
            Font font = Font.createFont(Font.TRUETYPE_FONT, new File(fontPath));
            return font.deriveFont(fontSize);
        } catch (FontFormatException | IOException e) {
            System.err.println("Gagal memuat font: " + fontName + " - " + e.getMessage());
            return new Font("Arial", Font.PLAIN, (int) fontSize); // Fallback font
        }
    }
}
