/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.MasakanRumahan;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class viewMasakanRumah extends javax.swing.JPanel {
    private JLabel nameLabel;
    private JTextArea ingredientsTextArea;
    private JTextArea stepsTextArea;
    private JLabel difficultyLabel;
    private JLabel cookingTimeLabel;
    private JLabel ratingLabel;

    public viewMasakanRumah() {
        initCustomComponents();
    }

    private void initCustomComponents() {
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(10, 10, 10, 10); // Margin antar elemen

    // Nama Resep
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.gridwidth = 2;
    gbc.anchor = GridBagConstraints.CENTER;
    nameLabel = new JLabel("Nama Resep Tidak Tersedia");
    nameLabel.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 24));
    add(nameLabel, gbc);

    // Bahan
    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.gridwidth = 1;
    gbc.anchor = GridBagConstraints.WEST;
    add(new JLabel("Bahan:"), gbc);

    gbc.gridx = 1;
    gbc.gridy = 1;
    ingredientsTextArea = new JTextArea(5, 20);
    ingredientsTextArea.setEditable(false);
    ingredientsTextArea.setLineWrap(true);
    ingredientsTextArea.setWrapStyleWord(true);
    add(new JScrollPane(ingredientsTextArea), gbc);

    // Langkah Memasak
    gbc.gridx = 0;
    gbc.gridy = 2;
    add(new JLabel("Langkah Memasak:"), gbc);

    gbc.gridx = 1;
    gbc.gridy = 2;
    stepsTextArea = new JTextArea(5, 20);
    stepsTextArea.setEditable(false);
    stepsTextArea.setLineWrap(true);
    stepsTextArea.setWrapStyleWord(true);
    add(new JScrollPane(stepsTextArea), gbc);

    // Tingkat Kesulitan
    gbc.gridx = 0;
    gbc.gridy = 3;
    add(new JLabel("Tingkat Kesulitan:"), gbc);

    gbc.gridx = 1;
    gbc.gridy = 3;
    difficultyLabel = new JLabel("Tingkat Kesulitan Tidak Tersedia");
    add(difficultyLabel, gbc);

    // Waktu Memasak
    gbc.gridx = 0;
    gbc.gridy = 4;
    add(new JLabel("Waktu Memasak:"), gbc);

    gbc.gridx = 1;
    gbc.gridy = 4;
    cookingTimeLabel = new JLabel("Waktu Memasak Tidak Tersedia");
    add(cookingTimeLabel, gbc);

    // Rating
    gbc.gridx = 0;
    gbc.gridy = 5;
    add(new JLabel("Rating:"), gbc);

    gbc.gridx = 1;
    gbc.gridy = 5;
    ratingLabel = new JLabel("Rating Tidak Tersedia");
    ratingLabel.setFont(new java.awt.Font("Segoe UI Symbol", java.awt.Font.PLAIN, 16));
    add(ratingLabel, gbc);
}


    public void setRecipeData(String recipeName, String mainIngredients, String cookingSteps,
                          String difficulty, String cookingTime, String rating) {
    nameLabel.setText(recipeName != null ? recipeName : "Nama Resep Tidak Tersedia");
    ingredientsTextArea.setText(mainIngredients != null ? mainIngredients : "Bahan Tidak Tersedia");
    stepsTextArea.setText(cookingSteps != null ? cookingSteps : "Langkah Memasak Tidak Tersedia");
    difficultyLabel.setText(difficulty != null ? difficulty : "Tingkat Kesulitan Tidak Tersedia");
    cookingTimeLabel.setText(cookingTime != null ? cookingTime : "Waktu Memasak Tidak Tersedia");
    ratingLabel.setText(rating != null ? "Rating: " + rating.replace("?", "★") : "Rating Tidak Tersedia");
}






  


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        recipeDetailPanel = new costum.DetailPanelPoppins();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        recipeDetailPanel.setBackground(new java.awt.Color(255, 255, 255));
        add(recipeDetailPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private costum.DetailPanelPoppins recipeDetailPanel;
    // End of variables declaration//GEN-END:variables
}
