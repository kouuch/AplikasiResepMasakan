/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.MasakanRumahan;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Daftarmasakan extends javax.swing.JPanel {

    /**
     * Creates new form Daftarmasakan
     */
    public Daftarmasakan() {
        initComponents();
        
         // Set header tabel
        recipeTablePanel.setTableHeaders(new String[]{"Nama Resep", "Tingkat Kesulitan", "Waktu Memasak", "Rating"});

        // Muat data ke tabel
        loadTableData();
    }
    
    private void loadTableData() {
        try {
            java.nio.file.Path folderPath = java.nio.file.Paths.get("data/FmasakanRumahan");

            if (!java.nio.file.Files.exists(folderPath)) {
                System.out.println("Folder tidak ditemukan: " + folderPath);
                return;
            }

            // Reset tabel sebelum memuat data baru
            recipeTablePanel.clearTableData();

            // Iterasi file di folder
            java.nio.file.DirectoryStream<java.nio.file.Path> files = java.nio.file.Files.newDirectoryStream(folderPath);
            for (java.nio.file.Path file : files) {
                java.util.List<String> lines = java.nio.file.Files.readAllLines(file);

                // Ekstrak nilai-nilai dari file
                String recipeName = extractValue(lines, "Nama Resep");
                String difficulty = extractValue(lines, "Tingkat Kesulitan");
                String cookingTime = extractValue(lines, "Waktu Memasak");
                int rating = Integer.parseInt(extractValue(lines, "Rating"));

                // Ubah rating menjadi bintang
                String stars = "★".repeat(rating) + "☆".repeat(5 - rating);

                // Tambahkan data ke tabel
                recipeTablePanel.addRow(new Object[]{recipeName, difficulty, cookingTime, stars});
            }
        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Gagal memuat data: " + e.getMessage());
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
        // TODO add your handling code here:
    }//GEN-LAST:event_selectButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        openFormTambahResep(evt);
    }//GEN-LAST:event_addButtonActionPerformed


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
