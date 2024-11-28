package costum;

import javax.swing.*;
import java.awt.*;

public class LabelGambar extends JLabel {

    private Image image;

    // Konstruktor untuk memuat gambar
    public LabelGambar(String imagePath) {
        // Muat gambar dari file
        ImageIcon icon = new ImageIcon(imagePath);  // Ganti dengan path gambar Anda
        image = icon.getImage();
    }

    // Override paintComponent untuk menggambar gambar pada label
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  // Memanggil super untuk membersihkan label

        // Menyesuaikan ukuran gambar dengan ukuran label
        image = image.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);  // Mengubah ukuran gambar agar sesuai dengan ukuran label
        g.drawImage(image, 0, 0, this);  // Gambar akan muncul di posisi (0, 0) pada label
    }
}
