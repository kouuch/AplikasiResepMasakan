package costum;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GradientPaint;
import javax.swing.JPanel;

// Kelas GradientPanel yang mewarisi JPanel
public class GradientPanel extends JPanel {

    private Color color1; // Warna pertama
    private Color color2; // Warna kedua
    private boolean isVertical; // Arah gradien

    // Konstruktor untuk mengatur warna dan arah gradien
    public GradientPanel(Color color1, Color color2, boolean isVertical) {
        this.color1 = color1;
        this.color2 = color2;
        this.isVertical = isVertical;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Tentukan arah gradien
        int x1 = 0, y1 = 0, x2 = getWidth(), y2 = getHeight();
        if (isVertical) {
            x2 = 0; // Gradien vertikal
        } else {
            y2 = 0; // Gradien horizontal
        }

        // Buat gradien warna
        GradientPaint gradient = new GradientPaint(x1, y1, color1, x2, y2, color2);
        g2d.setPaint(gradient);
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }
}
