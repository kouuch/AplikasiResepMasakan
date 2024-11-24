package costom;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;

public class CustomTablePanel extends JPanel {
    private JTable table;
    private DefaultTableModel model;

    public CustomTablePanel() {
        setLayout(new BorderLayout());

        // Judul kolom default
        String[] kolom = {"Title 1", "Title 2", "Title 3", "Title 4"};

        // Data awal default (kosong)
        Object[][] data = {};

        // Model tabel
        model = new DefaultTableModel(data, kolom);
        table = new JTable(model);

        // Customisasi Header
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("Arial", Font.BOLD, 14));
        header.setBackground(new Color(210, 180, 140)); // Cokelat muda (beige)
        header.setForeground(new Color(85, 60, 40));    // Cokelat tua
        header.setOpaque(true);

        // Customisasi Baris
        table.setRowHeight(30); // Tinggi baris
        table.setFont(new Font("Arial", Font.PLAIN, 12));
        table.setGridColor(new Color(160, 120, 80)); // Cokelat keabu-abuan

        // Warna latar alternatif untuk baris
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                // Set font untuk memastikan simbol bintang tampil
                c.setFont(theme.FontManager.getUnicodeCompatibleFont(Font.PLAIN, 14));

                // Warna alternatif untuk baris
                if (row % 2 == 0) {
                    c.setBackground(Color.WHITE); // Baris genap putih
                } else {
                    c.setBackground(new Color(245, 222, 179)); // Baris ganjil cokelat terang
                }

                c.setForeground(new Color(85, 60, 40)); // Teks cokelat tua
                return c;
            }
        });

        // ScrollPane untuk tabel
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }

    // Method untuk mengubah judul kolom
    public void setTableHeaders(String[] headers) {
        model.setColumnIdentifiers(headers);
    }

    // Method untuk menghapus semua data
    public void clearTableData() {
        model.setRowCount(0);
    }

    // Method untuk menambahkan baris ke tabel
    public void addRow(Object[] rowData) {
        model.addRow(rowData);
    }

    // Method untuk mendapatkan tabel (JTable)
    public JTable getTable() {
        return table;
    }
}
