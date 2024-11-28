package costum;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.AlphaComposite;
import javax.swing.JPanel;

public class RectangleBack1 extends JPanel {

    private int cornerRadius;
    private Color backgroundColor;

    // Konstruktor untuk menetapkan nilai default cornerRadius dan backgroundColor
    public RectangleBack1() {
        this.cornerRadius = 40; // Default cornerRadius
        this.backgroundColor = new Color(0, 255, 255, 150); // Default backgroundColor dengan transparansi
        setOpaque(true); // Menyeting panel agar tetap opak (tidak transparan)
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

        // Mengatur transparansi hanya untuk backgroundColor roundRect
        AlphaComposite alphaComposite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f);  // Transparansi 50%
        g2d.setComposite(alphaComposite);

        // Mengatur warna untuk roundRect dengan transparansi
        g2d.setColor(backgroundColor);  // Menentukan warna untuk isi roundRect
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);  // Gambar roundRect

        // Jika Anda ingin menambahkan border atau efek lainnya, bisa ditambahkan di sini.
    }
}
