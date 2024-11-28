package costum;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class LabelGambar extends JLabel {
    private Image image;

    // Konstruktor untuk memuat gambar
    public LabelGambar(String imagePath) {
        // Menggunakan getClass().getResource untuk memuat gambar dengan path relatif
        URL imgURL = getClass().getResource(imagePath);  // Pastikan path relatif yang benar
        if (imgURL != null) {
            System.out.println("Gambar ditemukan di path: " + imgURL);  // Menampilkan log path gambar
            ImageIcon icon = new ImageIcon(imgURL);
            image = icon.getImage();
        } else {
            System.out.println("Gambar tidak ditemukan di path: " + imagePath);  // Jika gambar tidak ditemukan
        }
    }

    // Override paintComponent untuk menggambar gambar pada label
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  // Memanggil super untuk membersihkan label

        if (image != null) {
            // Menyesuaikan ukuran gambar dengan ukuran label
            image = image.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);  // Mengubah ukuran gambar agar sesuai dengan ukuran label
            g.drawImage(image, 0, 0, this);  // Gambar akan muncul di posisi (0, 0) pada label
        } else {
            System.out.println("Gambar kosong atau gagal dimuat.");
        }
    }
}
