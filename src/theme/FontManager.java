package theme;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class FontManager {

    // Lokasi folder font
    private static final String FONT_FOLDER = "src/theme/fonts/";

    /**
     * Method untuk memuat font Poppins dengan gaya dan ukuran tertentu.
     *
     * @param style    Gaya font (Font.PLAIN, Font.BOLD, Font.ITALIC).
     * @param fontSize Ukuran font.
     * @return Font yang dimuat, atau fallback ke Arial jika gagal.
     */
    public static Font getPoppinsFont(int style, float fontSize) {
        try {
            String fontFileName;
            switch (style) {
                case Font.BOLD:
                    fontFileName = "Poppins-Bold.ttf";
                    break;
                case Font.ITALIC:
                    fontFileName = "Poppins-Italic.ttf";
                    break;
                case Font.PLAIN:
                default:
                    fontFileName = "Poppins-Regular.ttf";
                    break;
            }

            // Path ke file font
            File fontFile = new File(FONT_FOLDER + fontFileName);

            // Muat font dari file
            Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
            return font.deriveFont(fontSize); // Kembalikan font dengan ukuran tertentu

        } catch (FontFormatException | IOException e) {
            // Log error jika font gagal dimuat
            System.err.println("Gagal memuat font Poppins: " + e.getMessage());
            return new Font("Arial", Font.PLAIN, (int) fontSize); // Fallback ke Arial
        }
    }

    /**
     * Method untuk memuat font lain berdasarkan nama file dan ukuran.
     *
     * @param fontName Nama file font (misalnya, "Roboto-Regular.ttf").
     * @param fontSize Ukuran font dalam float.
     * @return Font yang dimuat, atau fallback ke Arial jika gagal.
     */
    public static Font loadFont(String fontName, float fontSize) {
        try {
            // Lokasi file font
            String fontPath = FONT_FOLDER + fontName;

            // Log debugging untuk memeriksa path
            System.out.println("Memuat font dari: " + fontPath);

            // Muat font dari file
            Font font = Font.createFont(Font.TRUETYPE_FONT, new File(fontPath));
            return font.deriveFont(fontSize);

        } catch (FontFormatException | IOException e) {
            // Log error jika font gagal dimuat
            System.err.println("Gagal memuat font: " + fontName + " - " + e.getMessage());
            return new Font("Arial", Font.PLAIN, (int) fontSize); // Fallback ke Arial
        }
    }

    /**
     * Method untuk mendapatkan fallback font default.
     *
     * @param fontSize Ukuran font dalam float.
     * @return Fallback font (Arial).
     */
    public static Font getDefaultFont(float fontSize) {
        return new Font("Arial", Font.PLAIN, (int) fontSize);
    }
}
