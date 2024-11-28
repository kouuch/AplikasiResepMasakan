package costum;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Rectangle extends JPanel {

    private int cornerRadius;
    private Color backgroundColor;

    // Konstruktor untuk menetapkan nilai default cornerRadius dan backgroundColor
    public Rectangle() {
        this.cornerRadius = 40; // Default cornerRadius
        this.backgroundColor = Color.CYAN; // Default backgroundColor untuk roundRect
    }

    // Getter untuk cornerRadius
    public int getCornerRadius() {
        return cornerRadius;
    }

    // Setter untuk cornerRadius
    public void setCornerRadius(int cornerRadius) {
        this.cornerRadius = cornerRadius;
        repaint(); // Memastikan panel diperbarui dengan cornerRadius baru
    }

    // Getter untuk backgroundColor
    public Color getBackgroundColor() {
        return backgroundColor;
    }

    // Setter untuk backgroundColor
    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
        repaint(); // Memastikan panel diperbarui dengan warna baru
    }

    // Method untuk menggambar panel dengan sudut melengkung dan backgroundColor
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  // Memanggil paintComponent dari JPanel untuk menjaga latar belakang default

        Graphics2D g2d = (Graphics2D) g;

        // Mengatur warna untuk roundRect
        g2d.setColor(backgroundColor);  // Menentukan warna untuk isi roundRect
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);  // Gambar roundRect

        // Jika Anda ingin menambahkan border atau efek lainnya, bisa ditambahkan di sini.
    }
}
