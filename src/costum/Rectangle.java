package costum;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Rectangle extends JPanel {

    private int cornerRadius;

    // Constructor untuk menetapkan nilai default cornerRadius
    public Rectangle() {
        this.cornerRadius = 40;  // Nilai default cornerRadius
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

    // Method untuk menggambar panel dengan sudut melengkung
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.CYAN);  // Set warna panel menjadi cyan
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius); // Gambar dengan sudut melengkung
    }
}
