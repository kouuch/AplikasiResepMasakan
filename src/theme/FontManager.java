package theme;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class FontManager {
    public static Font loadFont(String fontName, float fontSize) {
        try {
            // Lokasi font dalam folder theme/fonts
            String fontPath = "src/theme/fonts/" + fontName;

            // Tambahkan log untuk memeriksa path font
            System.out.println("Memuat font dari: " + fontPath);

            // Muat font dari file
            Font font = Font.createFont(Font.TRUETYPE_FONT, new File(fontPath));
            return font.deriveFont(fontSize);
        } catch (FontFormatException | IOException e) {
            // Log jika font gagal dimuat
            System.err.println("Gagal memuat font: " + fontName + " - " + e.getMessage());
            return new Font("Arial", Font.PLAIN, (int) fontSize); // Fallback font
        }
    }
}
