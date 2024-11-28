package costum;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Rectangle extends JPanel {

    private int cornerRadius;

    // Constructor untuk menetapkan nilai cornerRadius secara langsung
    public Rectangle() {
        // Tentukan nilai cornerRadius langsung dalam kode
        this.cornerRadius = 40; // Misalnya, sudut dengan radius 40
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
