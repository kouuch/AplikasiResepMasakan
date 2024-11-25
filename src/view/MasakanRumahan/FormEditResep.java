/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.MasakanRumahan;

import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author User
 */
public class FormEditResep extends javax.swing.JPanel {
    private DefaultTableModel tableModel;
    private boolean isEditMode = false;
    private int selectedRow = -1;
    private String originalRecipeName; // Variabel untuk menyimpan nama resep asli

    public FormEditResep(DefaultTableModel model, String recipeName, String difficulty, 
                     String cookingTime, int servings, int rating, String mainIngredients, 
                     String additionalIngredients, String cookingSteps, int selectedRow) {
    this.tableModel = model;
    this.selectedRow = selectedRow;
    System.out.printf("Memuat data ke FormEditResep:%nNama Resep: %s%nBahan Utama: %s%nBahan Tambahan: %s%nCara Memasak: %s%n",
    recipeName, mainIngredients, additionalIngredients, cookingSteps);

    initComponents();

    // Atur nilai slider rating
    ratingSlider.setMinimum(0);
    ratingSlider.setMaximum(5);
    ratingSlider.setMajorTickSpacing(1);
    ratingSlider.setPaintTicks(true);
    ratingSlider.setPaintLabels(true);

    // Set data berdasarkan input
    recipeNameField.setText(recipeName != null ? recipeName : "");
    difficultyComboBox.setSelectedItem(difficulty != null ? difficulty : "Mudah");

    try {
        cookingTimeSpinner.setValue(Integer.parseInt(cookingTime.replace("m", "").trim()));
    } catch (NumberFormatException e) {
        cookingTimeSpinner.setValue(0); // Set nilai default jika parsing gagal
    }

    servingsSpinner.setValue(servings);
    ratingSlider.setValue((rating >= 0 && rating <= 5) ? rating : 3);
    mainIngredientArea.setText(mainIngredients != null && !mainIngredients.isEmpty() ? mainIngredients : "Data tidak tersedia");
    additionalIngredientArea.setText(additionalIngredients != null && !additionalIngredients.isEmpty() ? additionalIngredients : "Data tidak tersedia");
    cookingStepsArea.setText(cookingSteps != null && !cookingSteps.isEmpty() ? cookingSteps : "Data tidak tersedia");
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        cookingStepsArea = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        servingsSpinner = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainIngredientArea = new javax.swing.JTextArea();
        difficultyComboBox = new javax.swing.JComboBox<>();
        ratingLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        recipeNameField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ratingSlider = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        cookingTimeSpinner = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        additionalIngredientArea = new javax.swing.JTextArea();
        saveEditButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cookingStepsArea.setColumns(20);
        cookingStepsArea.setRows(5);
        jScrollPane3.setViewportView(cookingStepsArea);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Cara Memasak");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("porsi");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Nama Resep");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Tingkat Kesulitan");

        mainIngredientArea.setColumns(20);
        mainIngredientArea.setRows(5);
        jScrollPane1.setViewportView(mainIngredientArea);

        difficultyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ratingLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ratingLabel.setText("Rating");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("logo");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Waktu Memasak");

        jLabel2.setFont(new java.awt.Font("Edwardian Script ITC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(222, 170, 121));
        jLabel2.setText("Edit Resep Masakan Rumahan");

        ratingSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ratingSliderStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Bahan Utama");

        cookingTimeSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cookingTimeSpinnerStateChanged(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Choose.png"))); // NOI18N
        jButton1.setText("Batal");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        additionalIngredientArea.setColumns(20);
        additionalIngredientArea.setRows(5);
        jScrollPane2.setViewportView(additionalIngredientArea);

        saveEditButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Choose.png"))); // NOI18N
        saveEditButton.setText("Simpan");
        saveEditButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        saveEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveEditButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Bahan Tambahan\t");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(saveEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(difficultyComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(93, 93, 93)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(cookingTimeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(90, 90, 90)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(servingsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(65, 65, 65)
                                    .addComponent(ratingSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ratingLabel)
                                    .addGap(107, 107, 107))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(recipeNameField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recipeNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(ratingSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(ratingLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(difficultyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(servingsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cookingTimeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // Kembali ke form Daftarmasakan
    javax.swing.JPanel parentPanel = (javax.swing.JPanel) this.getParent();
    parentPanel.removeAll();
    parentPanel.add(new DaftarMasakan());
    parentPanel.revalidate();
    parentPanel.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void saveEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveEditButtonActionPerformed
    System.out.println("Tombol Simpan ditekan."); // Log saat tombol ditekan

    if (selectedRow != -1) {
        String recipeName = recipeNameField.getText().trim();
        String mainIngredient = mainIngredientArea.getText().trim();
        String additionalIngredient = additionalIngredientArea.getText().trim();
        String instructions = cookingStepsArea.getText().trim();
        String difficulty = (String) difficultyComboBox.getSelectedItem();
        int cookingTime = (int) cookingTimeSpinner.getValue();
        int rating = ratingSlider.getValue();

        // Validasi input
        if (recipeName.isEmpty() || mainIngredient.isEmpty() || instructions.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field wajib diisi!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            System.out.println("Gagal menyimpan: Field wajib kosong."); // Log jika validasi gagal
            return;
        }

        try {
            // Lokasi folder
            Path folderPath = Paths.get("data/FmasakanRumahan");
            if (!Files.exists(folderPath)) {
                Files.createDirectories(folderPath);
                System.out.println("Folder berhasil dibuat: " + folderPath.toAbsolutePath());
            }

            // Tentukan nama file
            String fileName = originalRecipeName.equals(recipeName) 
                ? originalRecipeName + ".txt" // Nama file tetap jika nama tidak diubah
                : recipeName + ".txt"; // Nama file baru jika nama diubah

            Path oldFilePath = folderPath.resolve(originalRecipeName + ".txt"); // File lama
            Path newFilePath = folderPath.resolve(fileName); // File baru

            // Jika nama resep diubah, hapus file lama
            if (!originalRecipeName.equals(recipeName)) {
                Files.deleteIfExists(oldFilePath); // Hapus file lama
                System.out.println("File lama dihapus: " + oldFilePath);
            }

            // Tulis file baru
            List<String> lines = new ArrayList<>();
            lines.add("Nama Resep: " + recipeName);
            lines.add("Tingkat Kesulitan: " + difficulty);
            lines.add("Waktu Memasak: " + cookingTime + "m");
            lines.add("Rating: " + rating + "★");
            lines.add("Bahan Utama: " + mainIngredient);
            lines.add("Bahan Tambahan: " + additionalIngredient);
            lines.add("Cara Memasak: " + instructions);

            Files.write(newFilePath, lines);
            System.out.println("Data berhasil disimpan ke file: " + newFilePath.toAbsolutePath());

            // Perbarui baris di tabel
            tableModel.setValueAt(recipeName, selectedRow, 0);
            tableModel.setValueAt(difficulty, selectedRow, 1);
            tableModel.setValueAt(cookingTime + "m", selectedRow, 2);
            tableModel.setValueAt(rating + "★", selectedRow, 3);
            tableModel.setValueAt(mainIngredient, selectedRow, 4);
            tableModel.setValueAt(additionalIngredient, selectedRow, 5);
            tableModel.setValueAt(instructions, selectedRow, 6);

            JOptionPane.showMessageDialog(this, "Resep berhasil diperbarui dan disimpan ke file!", "Sukses", JOptionPane.INFORMATION_MESSAGE);

            // Log setelah semua berhasil
            System.out.println("Resep berhasil diperbarui di tabel dan file.");

            // Kembali ke daftar masakan
            JPanel parentPanel = (JPanel) this.getParent();
            parentPanel.removeAll();
            parentPanel.add(new DaftarMasakan());
            parentPanel.revalidate();
            parentPanel.repaint();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan perubahan ke file: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
            System.out.println("Gagal menyimpan file: " + e.getMessage());
            e.printStackTrace();
        }
    } else {
        JOptionPane.showMessageDialog(this, "Tidak ada baris yang dipilih!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        System.out.println("Gagal menyimpan: Tidak ada baris yang dipilih."); // Log jika tidak ada baris dipilih
    }
    }//GEN-LAST:event_saveEditButtonActionPerformed

    private void ratingSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ratingSliderStateChanged
        int rating = ratingSlider.getValue(); // Ambil nilai slider
        String stars = "★".repeat(rating) + "☆".repeat(5 - rating); // Format bintang
        ratingLabel.setText("Rating: " + stars); // Perbarui label
    }//GEN-LAST:event_ratingSliderStateChanged

    private void cookingTimeSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cookingTimeSpinnerStateChanged
     // Ambil nilai saat spinner berubah
    int time = (int) cookingTimeSpinner.getValue();
    jLabel7.setText("Waktu Memasak: " + time + "m");
    }//GEN-LAST:event_cookingTimeSpinnerStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea additionalIngredientArea;
    private javax.swing.JTextArea cookingStepsArea;
    private javax.swing.JSpinner cookingTimeSpinner;
    private javax.swing.JComboBox<String> difficultyComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea mainIngredientArea;
    private javax.swing.JLabel ratingLabel;
    private javax.swing.JSlider ratingSlider;
    private javax.swing.JTextField recipeNameField;
    private javax.swing.JButton saveEditButton;
    private javax.swing.JSpinner servingsSpinner;
    // End of variables declaration//GEN-END:variables
}
