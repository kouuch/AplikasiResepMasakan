/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.MasakanRumahan;

import java.io.File;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class DaftarMasakan extends javax.swing.JPanel {

    /**
     * Creates new form Daftarmasakan
     */
    public DaftarMasakan() {
        initComponents();
        
          // Set header tabel
        recipeTablePanel.setTableHeaders(new String[]{"Nama Resep", "Tingkat Kesulitan", "Waktu Memasak", "Rating"});

        // Muat data ke tabel
        loadTableData();

        // Tambahkan listener untuk tabel
        recipeTablePanel.getTable().getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) { // Pastikan perubahan selesai
                int selectedRow = recipeTablePanel.getTable().getSelectedRow(); // Dapatkan baris yang dipilih
                deleteButton.setEnabled(selectedRow != -1); // Aktifkan tombol hapus jika ada baris dipilih
            }
        });

        // Nonaktifkan tombol hapus secara default
        deleteButton.setEnabled(false);

        // Tambahkan aksi untuk tombol hapus
        deleteButton.addActionListener(evt -> {
            deleteSelectedRecipe();
        });
    }

    private void deleteSelectedRecipe() {
        JTable table = recipeTablePanel.getTable();
        int selectedRow = table.getSelectedRow();

        if (selectedRow != -1) {
            int confirm = javax.swing.JOptionPane.showConfirmDialog(this,
                "Apakah Anda yakin ingin menghapus resep ini?",
                "Konfirmasi Hapus",
                javax.swing.JOptionPane.YES_NO_OPTION);

            if (confirm == javax.swing.JOptionPane.YES_OPTION) {
                String recipeName = (String) table.getValueAt(selectedRow, 0); // Ambil nama resep
                try {
                    // Hapus file resep dari folder
                    java.nio.file.Path filePath = java.nio.file.Paths.get("data/FmasakanRumahan/" + recipeName + ".txt");
                    java.nio.file.Files.deleteIfExists(filePath);

                    // Hapus baris dari tabel
                    ((DefaultTableModel) table.getModel()).removeRow(selectedRow);

                    javax.swing.JOptionPane.showMessageDialog(this, "Resep berhasil dihapus!");
                } catch (Exception e) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Gagal menghapus resep: " + e.getMessage());
                }
            }
        } else {
            //javax.swing.JOptionPane.showMessageDialog(this, "Pilih resep yang ingin dihapus!");
        }
    }

    private void loadTableData() {
    try {
        java.nio.file.Path folderPath = java.nio.file.Paths.get("data/FmasakanRumahan");

        // Log untuk memantau apakah folder ditemukan
        System.out.println("Memeriksa folder: " + folderPath.toAbsolutePath());

        // Pastikan folder ada
        if (!java.nio.file.Files.exists(folderPath)) {
            System.out.println("Folder tidak ditemukan: " + folderPath);
            return; // Jika folder tidak ada, keluar dari metode
        }

        // Reset tabel sebelum memuat data baru
        recipeTablePanel.clearTableData(); // Pastikan ini hanya dipanggil sekali
        System.out.println("Tabel direset, memuat data baru...");

        // Ambil file dalam folder dan muat datanya
        File folder = folderPath.toFile();
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    // Log file yang sedang diproses
                    System.out.println("Memproses file: " + file.getName());

                    // Baca isi file
                    List<String> lines = java.nio.file.Files.readAllLines(file.toPath());
                    
                    // Log isi file untuk debugging (opsional)
                    for (String line : lines) {
                        System.out.println("  " + line);
                    }

                    // Parsing data dari lines dan tambahkan ke tabel (sesuaikan dengan struktur tabel Anda)
                    // Misalnya: Tambahkan ke model tabel
                }
            }
            System.out.println("Pemuatan data selesai.");
        } else {
            System.out.println("Tidak ada file di folder: " + folderPath);
        }
    } catch (Exception e) {
        e.printStackTrace(); // Log lengkap error ke console
        javax.swing.JOptionPane.showMessageDialog(this, "Gagal memuat data: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
    }
}



    private String extractValue(java.util.List<String> lines, String key) {
        for (String line : lines) {
            if (line.startsWith(key + ":")) {
                return line.split(":", 2)[1].trim();
            }
        }
        return "";
    }

    private void openFormTambahResep(java.awt.event.ActionEvent evt) {
        // Dapatkan parent container dari panel ini
        javax.swing.JPanel parentPanel = (javax.swing.JPanel) this.getParent();

        // Hapus semua komponen sebelumnya di parent panel
        parentPanel.removeAll();

        // Tambahkan form FormTambahResep ke parent panel
        parentPanel.add(new FormTambahResep());

        // Refresh tampilan
        parentPanel.revalidate();
        parentPanel.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        subtitleLabel = new javax.swing.JLabel();
        recipeTablePanel = new costom.CustomTablePanel();
        deleteButton = new javax.swing.JButton();
        selectButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleLabel.setText("Rumahan");

        subtitleLabel.setFont(new java.awt.Font("Edwardian Script ITC", 1, 48)); // NOI18N
        subtitleLabel.setForeground(new java.awt.Color(222, 170, 121));
        subtitleLabel.setText("Resep Masakan");

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Choose.png"))); // NOI18N
        deleteButton.setText("Hapus");
        deleteButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        selectButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Choose.png"))); // NOI18N
        selectButton.setText("Pilih");
        selectButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Choose.png"))); // NOI18N
        addButton.setText("Tambah");
        addButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Choose.png"))); // NOI18N
        editButton.setText("Edit");
        editButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subtitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(titleLabel)))
                .addGap(251, 251, 251))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(recipeTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(selectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(subtitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recipeTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
     JTable table = recipeTablePanel.getTable();
    int selectedRow = table.getSelectedRow();

    if (selectedRow != -1) {
        // Ambil data dari baris yang dipilih
        String recipeName = (String) table.getValueAt(selectedRow, 0); // Nama Resep
        String difficulty = (String) table.getValueAt(selectedRow, 1); // Tingkat Kesulitan
        String cookingTime = (String) table.getValueAt(selectedRow, 2); // Waktu Memasak
        String rating = (String) table.getValueAt(selectedRow, 3); // Rating

        // Pastikan bahan dan langkah memasak diambil dari sumber data
        String mainIngredients = "Isi bahan utama"; // Ambil dari file atau database
        String cookingSteps = "Isi cara memasak"; // Ambil dari file atau database

        // Panggil panel detail dan kirim data
        ViewMasakanRumah detailPanel = new ViewMasakanRumah();
        detailPanel.setRecipeData(recipeName, mainIngredients, cookingSteps, difficulty, cookingTime, rating);

        // Pindah ke panel baru
        javax.swing.JPanel parentPanel = (javax.swing.JPanel) this.getParent();
        parentPanel.removeAll();
        parentPanel.add(detailPanel);
        parentPanel.revalidate();
        parentPanel.repaint();
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Pilih resep yang ingin dilihat!");
    }

    }//GEN-LAST:event_selectButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        openFormTambahResep(evt);
    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
    // Ambil referensi ke tabel dari CustomTablePanel
    JTable table = recipeTablePanel.getTable(); // Menggunakan getTable()

    // Pastikan ada baris yang dipilih
    int selectedRow = table.getSelectedRow();
    if (selectedRow != -1) {
    // Ambil data dari tabel
    String recipeName = (String) table.getValueAt(selectedRow, 0);
    String difficulty = (String) table.getValueAt(selectedRow, 1);
    String cookingTime = (String) table.getValueAt(selectedRow, 2);
    int rating = ((String) table.getValueAt(selectedRow, 3)).replace("★", "").length(); // Hitung jumlah bintang

    // Anda perlu menyediakan data untuk kolom berikut
    String mainIngredients = "Isi bahan utama"; // Ambil dari sumber data
    String additionalIngredients = "Isi bahan tambahan"; // Ambil dari sumber data
    String cookingSteps = "Isi cara memasak"; // Ambil dari sumber data

    // Pindah ke FormEditResep dengan membawa data
    javax.swing.JPanel parentPanel = (javax.swing.JPanel) this.getParent();
    parentPanel.removeAll();
    parentPanel.add(new FormEditResep(recipeName, difficulty, cookingTime, 0, rating, mainIngredients, additionalIngredients, cookingSteps));
    parentPanel.revalidate();
    parentPanel.repaint();
} else {
    javax.swing.JOptionPane.showMessageDialog(this, "Pilih resep yang ingin diedit!");
}

    
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
         JTable table = recipeTablePanel.getTable();
    int selectedRow = table.getSelectedRow();

    if (selectedRow != -1) {
        int confirm = javax.swing.JOptionPane.showConfirmDialog(this, 
            "Apakah Anda yakin ingin menghapus resep ini?", 
            "Konfirmasi Hapus", 
            javax.swing.JOptionPane.YES_NO_OPTION);

        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            String recipeName = (String) table.getValueAt(selectedRow, 0); // Ambil nama resep
            try {
                // Hapus file resep dari folder
                java.nio.file.Path filePath = java.nio.file.Paths.get("data/FmasakanRumahan/" + recipeName + ".txt");
                java.nio.file.Files.deleteIfExists(filePath);

                // Hapus baris dari tabel
                ((DefaultTableModel) table.getModel()).removeRow(selectedRow);

                javax.swing.JOptionPane.showMessageDialog(this, "Resep berhasil dihapus!");
            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Gagal menghapus resep: " + e.getMessage());
            }
        }
    } else {
        //javax.swing.JOptionPane.showMessageDialog(this, "Pilih resep yang ingin dihapus!");
    }
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JPanel mainPanel;
    private costom.CustomTablePanel recipeTablePanel;
    private javax.swing.JButton selectButton;
    private javax.swing.JLabel subtitleLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
