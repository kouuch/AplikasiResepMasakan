/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.MasakanRumahan;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
    private DefaultTableModel tableModel;
    public DaftarMasakan() {
        
        initComponents();
        

        // Define the table model with complete columns
        tableModel = new DefaultTableModel(new Object[]{
            "Nama Resep", "Tingkat Kesulitan", "Waktu Memasak", "Rating", "Bahan Utama", "Bahan Tambahan", "Cara Memasak"
        }, 0);

        recipeTablePanel.getTable().setModel(tableModel);

        // Load data into the table
        loadTableData();
        

        // Add listener for table selection
        recipeTablePanel.getTable().getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int selectedRow = recipeTablePanel.getTable().getSelectedRow();
                deleteButton.setEnabled(selectedRow != -1); // Enable delete button if a row is selected
            }
        });

        // Disable delete button by default
        deleteButton.setEnabled(false);

        // Add action for delete button
        deleteButton.addActionListener(evt -> {
            deleteSelectedRecipe();
        });
    }

    private void loadTableData() {
    try {
        Path folderPath = Paths.get("data/FmasakanRumahan");
        if (!Files.exists(folderPath)) {
            return; // Jika folder tidak ada, tidak perlu memuat apa pun
        }

        File[] files = folderPath.toFile().listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    List<String> lines = Files.readAllLines(file.toPath());
                    String recipeName = extractValue(lines, "Nama Resep");
                    String difficulty = extractValue(lines, "Tingkat Kesulitan");
                    String cookingTime = extractValue(lines, "Waktu Memasak");
                    String rating = extractValue(lines, "Rating");
                    String mainIngredient = extractValue(lines, "Bahan Utama");
                    String additionalIngredient = extractValue(lines, "Bahan Tambahan");
                    String instructions = extractValue(lines, "Cara Memasak");

                    tableModel.addRow(new Object[]{
                        recipeName, difficulty, cookingTime, rating, mainIngredient, additionalIngredient, instructions
                    });
                }
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Gagal memuat data: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
    }
}



    private String extractValue(List<String> lines, String key) {
        for (String line : lines) {
            if (line.startsWith(key + ":")) {
                return line.split(":", 2)[1].trim();
            }
        }
        return "";
    }

    private void deleteSelectedRecipe() {
        JTable table = recipeTablePanel.getTable();
        int selectedRow = table.getSelectedRow();

        if (selectedRow != -1) {
            int confirm = JOptionPane.showConfirmDialog(this,
                "Apakah Anda yakin ingin menghapus resep ini?",
                "Konfirmasi Hapus",
                JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                String recipeName = (String) table.getValueAt(selectedRow, 0); // Get recipe name
                try {
                    // Delete recipe file
                    java.nio.file.Path filePath = java.nio.file.Paths.get("data/FmasakanRumahan/" + recipeName + ".txt");
                    java.nio.file.Files.deleteIfExists(filePath);

                    // Remove row from table
                    tableModel.removeRow(selectedRow);

                    JOptionPane.showMessageDialog(this, "Resep berhasil dihapus!");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Gagal menghapus resep: " + e.getMessage());
                }
            }
        }
    }

    private void openFormTambahResep() {
    JPanel parentPanel = (JPanel) this.getParent();
    parentPanel.removeAll();
    parentPanel.add(new FormTambahResep(tableModel));
    parentPanel.revalidate();
    parentPanel.repaint();
}


    private void openFormEditResep() {
    JTable table = recipeTablePanel.getTable();
    int selectedRow = table.getSelectedRow();

    if (selectedRow != -1) {
        // Ambil data dari tabel berdasarkan kolom
        String recipeName = (String) table.getValueAt(selectedRow, 0);
        String difficulty = (String) table.getValueAt(selectedRow, 1);
        String cookingTime = (String) table.getValueAt(selectedRow, 2);
        int rating = Integer.parseInt(((String) table.getValueAt(selectedRow, 3)).replace("★", ""));
        String mainIngredients = (String) table.getValueAt(selectedRow, 4);
        String additionalIngredients = (String) table.getValueAt(selectedRow, 5);
        String cookingSteps = (String) table.getValueAt(selectedRow, 6);

        // Cetak data ke log
        System.out.printf("Memuat data ke FormEditResep:%nNama Resep: %s%nBahan Utama: %s%nBahan Tambahan: %s%nCara Memasak: %s%n",
            recipeName, mainIngredients, additionalIngredients, cookingSteps);

        // Pindah ke FormEditResep dengan membawa data
        JPanel parentPanel = (JPanel) this.getParent();
        parentPanel.removeAll();
        parentPanel.add(new FormEditResep(
            tableModel, recipeName, difficulty, cookingTime, 0, rating, mainIngredients, additionalIngredients, cookingSteps, selectedRow
        ));
        parentPanel.revalidate();
        parentPanel.repaint();
    } else {
        JOptionPane.showMessageDialog(this, "Pilih resep yang ingin diedit!");
    }
}






private void saveRecipe(String[] data) {
    // Validasi semua elemen data
    for (int i = 0; i < data.length; i++) {
        if (data[i].trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Kesalahan", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }

    try {
        // Simpan data ke file
        java.nio.file.Path folderPath = java.nio.file.Paths.get("data/FmasakanRumahan");
        if (!java.nio.file.Files.exists(folderPath)) {
            java.nio.file.Files.createDirectories(folderPath);
        }

        String recipeName = data[0];
        java.nio.file.Path filePath = folderPath.resolve(recipeName + ".txt");
        List<String> lines = new ArrayList<>();
        lines.add("Nama Resep: " + data[0]);  // Nama Resep
        lines.add("Tingkat Kesulitan: " + data[1]);  // Tingkat Kesulitan
        lines.add("Waktu Memasak: " + data[2]);  // Waktu Memasak
        lines.add("Rating: " + data[3]);  // Rating
        lines.add("Bahan Utama: " + data[4]);  // Bahan Utama
        lines.add("Bahan Tambahan: " + data[5]);  // Bahan Tambahan
        lines.add("Cara Memasak: " + data[6]);  // Cara Memasak

        java.nio.file.Files.write(filePath, lines);

        // Tambahkan data ke tabel
            tableModel.addRow(data);

        JOptionPane.showMessageDialog(this, "Resep berhasil disimpan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Gagal menyimpan data: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
    }
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
    JPanel parentPanel = (JPanel) this.getParent();
    parentPanel.removeAll();
    parentPanel.add(new FormTambahResep(tableModel));
    parentPanel.revalidate();
    parentPanel.repaint();
    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
                                          
    // Tambahkan debug log untuk memastikan tombol diklik
    System.out.println("Tombol Edit diklik.");

    // Ambil referensi ke tabel dari CustomTablePanel
    JTable table = recipeTablePanel.getTable(); // Pastikan Anda menggunakan objek JTable yang benar

    // Pastikan ada baris yang dipilih
    int selectedRow = table.getSelectedRow();
    if (selectedRow != -1) {
        // Ambil data dari tabel berdasarkan baris yang dipilih
        String recipeName = (String) table.getValueAt(selectedRow, 0);
        String difficulty = (String) table.getValueAt(selectedRow, 1);
        String cookingTime = (String) table.getValueAt(selectedRow, 2);
        int rating = ((String) table.getValueAt(selectedRow, 3)).replace("★", "").length(); // Hitung jumlah bintang
        String mainIngredients = (String) table.getValueAt(selectedRow, 4);
        String additionalIngredients = (String) table.getValueAt(selectedRow, 5);
        String cookingSteps = (String) table.getValueAt(selectedRow, 6);

        // Pindah ke FormEditResep dengan membawa data
        javax.swing.JPanel parentPanel = (javax.swing.JPanel) this.getParent();
        parentPanel.removeAll();
        parentPanel.add(new FormEditResep(
            tableModel, recipeName, difficulty, cookingTime, 0, rating, mainIngredients, additionalIngredients, cookingSteps, selectedRow
        ));
        parentPanel.revalidate();
        parentPanel.repaint();
    } else {
        JOptionPane.showMessageDialog(this, "Pilih resep yang ingin diedit!");
    }

    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
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
        //javax.swing.JOptionPane.showMessageDialog(this, "Pilih resep yang ingin dilihat!");
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
