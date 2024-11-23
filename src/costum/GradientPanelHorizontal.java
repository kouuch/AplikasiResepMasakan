package costum;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GradientPaint;
import javax.swing.JPanel;

public class GradientPanelHorizontal extends JPanel {

    private Color color1 = Color.BLUE; // Warna awal (default)
    private Color color2 = Color.WHITE; // Warna akhir (default)

    // Konstruktor default (dibutuhkan untuk NetBeans Palette)
    public GradientPanelHorizontal() {
        super();
    }

    // Konstruktor dengan parameter untuk menentukan warna gradien
    public GradientPanelHorizontal(Color color1, Color color2) {
        this.color1 = color1;
        this.color2 = color2;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Gradien horizontal: Dari kiri ke kanan
        GradientPaint gradient = new GradientPaint(0, 0, color1, getWidth(), 0, color2);
        g2d.setPaint(gradient);
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }

    // Getter dan Setter untuk mendukung JavaBeans (opsional, tapi direkomendasikan)
    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
        repaint(); // Memastikan tampilan diperbarui
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
        repaint(); // Memastikan tampilan diperbarui
    }
}
