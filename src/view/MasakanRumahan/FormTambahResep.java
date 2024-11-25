/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.MasakanRumahan;

import java.awt.Font;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import theme.FontManager;

/**
 *
 * @author User
 */
public class FormTambahResep extends javax.swing.JPanel {

  private DefaultTableModel tableModel;
     public FormTambahResep(DefaultTableModel model) {
    this.tableModel = model;
    initComponents();
    configureRatingSlider();
    configureCookingTimeSpinner();
    
}

    private void configureRatingSlider() {
        ratingSlider.setMinimum(0);
        ratingSlider.setMaximum(5);
        ratingSlider.setValue(3); // Nilai default
        ratingSlider.setMajorTickSpacing(1);
        ratingSlider.setPaintTicks(true);
        ratingSlider.setPaintLabels(true);

        ratingLabel.setFont(FontManager.getUnicodeCompatibleFont(Font.PLAIN, 14));
        updateRatingLabel();

        // Listener untuk slider rating
        ratingSlider.addChangeListener(e -> updateRatingLabel());
    }

    private void configureCookingTimeSpinner() {
        cookingTimeSpinner.setModel(new SpinnerNumberModel(0, 0, 180, 1)); // Maksimal 180 menit
        cookingTimeSpinner.addChangeListener(e -> updateCookingTimeLabel());
        updateCookingTimeLabel();
    }

    private void updateRatingLabel() {
        int rating = ratingSlider.getValue();
        String stars = "★".repeat(rating) + "☆".repeat(5 - rating);
        ratingLabel.setText("Rating: " + stars);
    }

    private void updateCookingTimeLabel() {
        int time = (int) cookingTimeSpinner.getValue();
        cookingTimeLabel.setText("Waktu Memasak: " + time + " menit");
    }

    private void saveRecipe() {
    try {
        // Jalur folder penyimpanan
        Path folderPath = Paths.get("data/FmasakanRumahan");
        if (!Files.exists(folderPath)) {
            Files.createDirectories(folderPath);
        }

        // Ambil data dari form
        String recipeName = recipeNameField.getText().trim();
        String mainIngredient = mainIngredientTextArea.getText().trim();
        String additionalIngredient = additionalIngredientTextArea.getText().trim();
        String instructions = instructionsTextArea.getText().trim();
        String difficulty = (String) difficultyLevelComboBox.getSelectedItem();
        int cookingTime = (int) cookingTimeSpinner.getValue();
        int servings = (int) servingsSpinner.getValue();
        int rating = ratingSlider.getValue();

        // Validasi input
        if (recipeName.isEmpty() || mainIngredient.isEmpty() || instructions.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field wajib diisi!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Jalur file
        Path filePath = folderPath.resolve(recipeName + ".txt");
        if (Files.exists(filePath)) {
            int response = JOptionPane.showConfirmDialog(this,
                    "Resep dengan nama yang sama sudah ada. Apakah Anda ingin menimpa?",
                    "Konfirmasi",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE);
            if (response != JOptionPane.YES_OPTION) {
                return;
            }
        }

        // Format data untuk disimpan
        String dataToSave = String.format(
                "Nama Resep: %s\nBahan Utama: %s\nBahan Tambahan: %s\nTingkat Kesulitan: %s\nWaktu Memasak: %dm\nPorsi: %d\nRating: %d\nCara Memasak: %s",
                recipeName, mainIngredient, additionalIngredient, difficulty, cookingTime, servings, rating, instructions);
        Files.write(filePath, dataToSave.getBytes());

        // Tambahkan data ke tabel
        tableModel.addRow(new Object[]{
                recipeName, difficulty, cookingTime + "m", rating + "★", mainIngredient, additionalIngredient, instructions
        });

        JOptionPane.showMessageDialog(this, "Resep berhasil ditambahkan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);

        // Bersihkan form
        clearFormFields();
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Gagal menyimpan resep: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
    }
}

    

    private void clearForm() {
        recipeNameField.setText("");
        mainIngredientTextArea.setText("");
        additionalIngredientTextArea.setText("");
        difficultyLevelComboBox.setSelectedIndex(0);
        cookingTimeSpinner.setValue(0);
        servingsSpinner.setValue(0);
        ratingSlider.setValue(3); // Reset ke nilai default
        instructionsTextArea.setText("");
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
        logoLabel = new javax.swing.JLabel();
        formTitleLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        addRecipeButton = new javax.swing.JButton();
        recipeNameLabel = new javax.swing.JLabel();
        mainIngredientScrollPane = new javax.swing.JScrollPane();
        mainIngredientTextArea = new javax.swing.JTextArea();
        recipeNameField = new javax.swing.JTextField();
        mainIngredientLabel = new javax.swing.JLabel();
        additionalIngredientScrollPane = new javax.swing.JScrollPane();
        additionalIngredientTextArea = new javax.swing.JTextArea();
        additionalIngredientLabel = new javax.swing.JLabel();
        difficultyLevelLabel = new javax.swing.JLabel();
        difficultyLevelComboBox = new javax.swing.JComboBox<>();
        cookingTimeLabel = new javax.swing.JLabel();
        servingsLabel = new javax.swing.JLabel();
        ratingLabel = new javax.swing.JLabel();
        ratingSlider = new javax.swing.JSlider();
        instructionsScrollPane = new javax.swing.JScrollPane();
        instructionsTextArea = new javax.swing.JTextArea();
        instructionsLabel = new javax.swing.JLabel();
        cookingTimeSpinner = new javax.swing.JSpinner();
        servingsSpinner = new javax.swing.JSpinner();

        setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setRequestFocusEnabled(false);

        logoLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        logoLabel.setText("logo");

        formTitleLabel.setFont(new java.awt.Font("Edwardian Script ITC", 1, 24)); // NOI18N
        formTitleLabel.setForeground(new java.awt.Color(222, 170, 121));
        formTitleLabel.setText("Tambah Resep Masakan Rumahan");

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Choose.png"))); // NOI18N
        backButton.setText("Kembali");
        backButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        addRecipeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Choose.png"))); // NOI18N
        addRecipeButton.setText("Tambah");
        addRecipeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addRecipeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecipeButtonActionPerformed(evt);
            }
        });

        recipeNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        recipeNameLabel.setText("Nama Resep");

        mainIngredientTextArea.setColumns(20);
        mainIngredientTextArea.setRows(5);
        mainIngredientScrollPane.setViewportView(mainIngredientTextArea);

        mainIngredientLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mainIngredientLabel.setText("Bahan Utama");

        additionalIngredientTextArea.setColumns(20);
        additionalIngredientTextArea.setRows(5);
        additionalIngredientScrollPane.setViewportView(additionalIngredientTextArea);

        additionalIngredientLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        additionalIngredientLabel.setText("Bahan Tambahan\t");

        difficultyLevelLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        difficultyLevelLabel.setText("Tingkat Kesulitan");

        difficultyLevelComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cookingTimeLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cookingTimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cookingTimeLabel.setText("Waktu Memasak");

        servingsLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        servingsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        servingsLabel.setText("porsi");

        ratingLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ratingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ratingLabel.setText("Rating");

        ratingSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ratingSliderStateChanged(evt);
            }
        });

        instructionsTextArea.setColumns(20);
        instructionsTextArea.setRows(5);
        instructionsScrollPane.setViewportView(instructionsTextArea);

        instructionsLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        instructionsLabel.setText("Cara Memasak");

        cookingTimeSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cookingTimeSpinnerStateChanged(evt);
            }
        });

        servingsSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                servingsSpinnerStateChanged(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(additionalIngredientScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(additionalIngredientLabel)
                    .addComponent(mainIngredientLabel)
                    .addComponent(recipeNameLabel)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(addRecipeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(logoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(recipeNameField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainIngredientScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(instructionsScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(cookingTimeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(89, 89, 89)
                                    .addComponent(servingsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(55, 55, 55))
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(difficultyLevelComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(difficultyLevelLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGap(70, 70, 70)
                                            .addComponent(cookingTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(60, 60, 60)
                                            .addComponent(servingsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(instructionsLabel))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ratingSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                .addComponent(ratingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(20, 20, 20))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addRecipeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(recipeNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recipeNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainIngredientLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainIngredientScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(additionalIngredientLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(additionalIngredientScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ratingLabel)
                            .addComponent(servingsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(servingsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ratingSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(difficultyLevelLabel)
                            .addComponent(cookingTimeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(difficultyLevelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cookingTimeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(instructionsLabel)))
                .addGap(18, 18, 18)
                .addComponent(instructionsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void ratingSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ratingSliderStateChanged
        int rating = ratingSlider.getValue(); // Ambil nilai slider
        String stars = "★".repeat(rating) + "☆".repeat(5 - rating); // Format bintang
        ratingLabel.setText("Rating: " + stars); // Perbarui label
    }//GEN-LAST:event_ratingSliderStateChanged

    private void cookingTimeSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cookingTimeSpinnerStateChanged
    // Ambil nilai saat spinner berubah
    int time = (int) cookingTimeSpinner.getValue();
    cookingTimeLabel.setText("Waktu Memasak: " + time + "m");
    }//GEN-LAST:event_cookingTimeSpinnerStateChanged

    private void servingsSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_servingsSpinnerStateChanged
        
    }//GEN-LAST:event_servingsSpinnerStateChanged

    private void addRecipeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecipeButtonActionPerformed
        try {
        // Jalur folder penyimpanan
        Path folderPath = Paths.get("data/FmasakanRumahan");
        if (!Files.exists(folderPath)) {
            Files.createDirectories(folderPath);
        }

        // Ambil data dari form
        String recipeName = recipeNameField.getText().trim();
        String mainIngredient = mainIngredientTextArea.getText().trim();
        String additionalIngredient = additionalIngredientTextArea.getText().trim();
        String difficulty = (String) difficultyLevelComboBox.getSelectedItem();
        int cookingTime = (int) cookingTimeSpinner.getValue();
        int servings = (int) servingsSpinner.getValue();
        int rating = ratingSlider.getValue();
        String instructions = instructionsTextArea.getText().trim();

        // Validasi input
        if (recipeName.isEmpty() || mainIngredient.isEmpty() || instructions.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field wajib diisi!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Cek apakah file sudah ada
        Path filePath = folderPath.resolve(recipeName + ".txt");
        if (Files.exists(filePath)) {
            int response = JOptionPane.showConfirmDialog(this,
                "Resep dengan nama yang sama sudah ada. Apakah Anda ingin menimpa?",
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
            if (response != JOptionPane.YES_OPTION) {
                return;
            }
        }

        // Tulis data ke file
        String dataToSave = String.format(
            "Nama Resep: %s\nBahan Utama: %s\nBahan Tambahan: %s\nTingkat Kesulitan: %s\nWaktu Memasak: %dm\nPorsi: %d\nRating: %d\nCara Memasak: %s",
            recipeName, mainIngredient, additionalIngredient, difficulty, cookingTime, servings, rating, instructions);
        Files.write(filePath, dataToSave.getBytes());

        // Tambahkan data ke tabel
        String[] rowData = {
            recipeName, difficulty, cookingTime + "m", String.valueOf(rating), mainIngredient, additionalIngredient, instructions
        };
        tableModel.addRow(rowData);

        JOptionPane.showMessageDialog(this, "Resep berhasil ditambahkan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);

        // Bersihkan form
        clearFormFields();
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Gagal menyimpan resep: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
    }
    }

                                                                                             

// Metode untuk mengosongkan semua input di form
private void clearFormFields() {
    recipeNameField.setText(""); // Kosongkan nama resep
    mainIngredientTextArea.setText(""); // Kosongkan bahan utama
    additionalIngredientTextArea.setText(""); // Kosongkan bahan tambahan
    difficultyLevelComboBox.setSelectedIndex(0); // Reset tingkat kesulitan ke indeks pertama
    cookingTimeSpinner.setValue(0); // Reset waktu memasak ke 0
    servingsSpinner.setValue(0); // Reset porsi ke 0
    ratingSlider.setValue(3); // Reset rating slider ke nilai default
    instructionsTextArea.setText(""); // Kosongkan cara memasak
    }//GEN-LAST:event_addRecipeButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
    javax.swing.JPanel parentPanel = (javax.swing.JPanel) this.getParent();
    parentPanel.removeAll();
    parentPanel.add(new DaftarMasakan());
    parentPanel.repaint();
    parentPanel.revalidate();
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRecipeButton;
    private javax.swing.JLabel additionalIngredientLabel;
    private javax.swing.JScrollPane additionalIngredientScrollPane;
    private javax.swing.JTextArea additionalIngredientTextArea;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel cookingTimeLabel;
    private javax.swing.JSpinner cookingTimeSpinner;
    private javax.swing.JComboBox<String> difficultyLevelComboBox;
    private javax.swing.JLabel difficultyLevelLabel;
    private javax.swing.JLabel formTitleLabel;
    private javax.swing.JLabel instructionsLabel;
    private javax.swing.JScrollPane instructionsScrollPane;
    private javax.swing.JTextArea instructionsTextArea;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel mainIngredientLabel;
    private javax.swing.JScrollPane mainIngredientScrollPane;
    private javax.swing.JTextArea mainIngredientTextArea;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel ratingLabel;
    private javax.swing.JSlider ratingSlider;
    private javax.swing.JTextField recipeNameField;
    private javax.swing.JLabel recipeNameLabel;
    private javax.swing.JLabel servingsLabel;
    private javax.swing.JSpinner servingsSpinner;
    // End of variables declaration//GEN-END:variables
}
