package costum;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class RectangleBack1 extends JPanel {

    private int cornerRadius;
    private Color fillColor;

    // Konstruktor untuk menetapkan nilai default
    public RectangleBack1() {
        this.cornerRadius = 40; // Default cornerRadius
        this.fillColor = new Color(0, 255, 255); // Warna cyan solid untuk fillColor
        setOpaque(false); // Mengatur agar panel menjadi transparan
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

    // Getter untuk fillColor
    public Color getFillColor() {
        return fillColor;
    }

    // Setter untuk fillColor
    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
        repaint(); // Memastikan panel diperbarui dengan warna baru
    }

    // Method untuk menggambar panel dengan sudut melengkung dan warna solid
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  // Memanggil super.paintComponent untuk memastikan tidak ada gangguan

        Graphics2D g2d = (Graphics2D) g;

        // Menggambar roundRect dengan warna solid
        g2d.setColor(fillColor);  // Mengatur warna untuk roundRect
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);  // Gambar roundRect

        // Tidak menggambar border atau latar belakang lainnya, hanya roundRect yang berwarna
    }
}
