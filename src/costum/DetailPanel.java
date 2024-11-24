import javax.swing.*;
import java.awt.*;

public class DetailPanel extends JPanel {
    private JLabel namaResepLabel;
    private JTextArea bahanTextArea;
    private JTextArea caraMemasakTextArea;
    private JLabel ratingLabel;
    private JLabel gambarLabel;

    public DetailPanel() {
        setLayout(new BorderLayout(10, 10));

        // Panel atas untuk nama resep
        JPanel headerPanel = new JPanel(new BorderLayout());
        namaResepLabel = new JLabel("Nama Resep");
        namaResepLabel.setFont(new Font("Serif", Font.BOLD, 24));
        namaResepLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headerPanel.add(namaResepLabel, BorderLayout.CENTER);

        // Panel tengah untuk bahan dan cara memasak
        JPanel contentPanel = new JPanel(new GridLayout(2, 1, 10, 10));

        // Bahan
        JPanel bahanPanel = new JPanel(new BorderLayout());
        JLabel bahanLabel = new JLabel("Bahan:");
        bahanLabel.setFont(new Font("Serif", Font.BOLD, 18));
        bahanTextArea = new JTextArea(5, 20);
        bahanTextArea.setWrapStyleWord(true);
        bahanTextArea.setLineWrap(true);
        bahanTextArea.setEditable(false);
        JScrollPane bahanScrollPane = new JScrollPane(bahanTextArea);
        bahanPanel.add(bahanLabel, BorderLayout.NORTH);
        bahanPanel.add(bahanScrollPane, BorderLayout.CENTER);

        // Cara Memasak
        JPanel caraPanel = new JPanel(new BorderLayout());
        JLabel caraLabel = new JLabel("Cara Memasak:");
        caraLabel.setFont(new Font("Serif", Font.BOLD, 18));
        caraMemasakTextArea = new JTextArea(5, 20);
        caraMemasakTextArea.setWrapStyleWord(true);
        caraMemasakTextArea.setLineWrap(true);
        caraMemasakTextArea.setEditable(false);
        JScrollPane caraScrollPane = new JScrollPane(caraMemasakTextArea);
        caraPanel.add(caraLabel, BorderLayout.NORTH);
        caraPanel.add(caraScrollPane, BorderLayout.CENTER);

        contentPanel.add(bahanPanel);
        contentPanel.add(caraPanel);

        // Panel bawah untuk rating dan gambar
        JPanel footerPanel = new JPanel(new BorderLayout());

        // Rating
        ratingLabel = new JLabel("Rating: ⭐⭐⭐⭐");
        ratingLabel.setFont(new Font("Serif", Font.BOLD, 18));
        footerPanel.add(ratingLabel, BorderLayout.NORTH);

        // Gambar
        gambarLabel = new JLabel("Gambar Masakan", SwingConstants.CENTER);
        gambarLabel.setFont(new Font("Serif", Font.ITALIC, 16));
        gambarLabel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        gambarLabel.setPreferredSize(new Dimension(300, 200));
        footerPanel.add(gambarLabel, BorderLayout.CENTER);

        add(headerPanel, BorderLayout.NORTH);
        add(contentPanel, BorderLayout.CENTER);
        add(footerPanel, BorderLayout.SOUTH);
    }

    // Method untuk mengupdate detail panel
    public void setDetail(String namaResep, String bahan, String caraMemasak, String rating, String gambar) {
        namaResepLabel.setText(namaResep);
        bahanTextArea.setText(bahan);
        caraMemasakTextArea.setText(caraMemasak);
        ratingLabel.setText("Rating: " + rating);

        if (gambar != null && !gambar.isEmpty()) {
            gambarLabel.setText(gambar);
        } else {
            gambarLabel.setText("Gambar tidak tersedia");
        }
    }

    public static void main(String[] args) {
        // Test Panel
        JFrame frame = new JFrame("Detail Resep Masakan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 800);

        DetailPanel detailPanel = new DetailPanel();
        detailPanel.setDetail(
                "Nasi Goreng",
                "Nasi, Telur, Kecap, Bawang Merah, Bawang Putih",
                "1. Panaskan wajan\n2. Tumis bawang\n3. Masukkan nasi dan bumbu\n4. Sajikan hangat",
                "⭐⭐⭐⭐",
                "Ini adalah gambar masakan"
        );

        frame.add(detailPanel);
        frame.setVisible(true);
    }
}
