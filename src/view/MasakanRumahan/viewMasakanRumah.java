/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.MasakanRumahan;


import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ViewMasakanRumah extends JPanel {

    private JLabel nameLabel;
    private JTextArea ingredientsTextArea;
    private JTextArea additionalIngredientsTextArea;
    private JTextArea stepsTextArea;
    private JLabel difficultyLabel;
    private JLabel cookingTimeLabel;
    private JLabel ratingLabel;

    public ViewMasakanRumah() {
        initCustomComponents();
    }

    private void initCustomComponents() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;

        // Nama Resep
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        nameLabel = new JLabel("Nama Resep Tidak Tersedia");
        nameLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        add(nameLabel, gbc);

        // Bahan Utama
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(new JLabel("Bahan Utama:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        ingredientsTextArea = new JTextArea(5, 20);
        ingredientsTextArea.setEditable(false);
        ingredientsTextArea.setLineWrap(true);
        ingredientsTextArea.setWrapStyleWord(true);
        add(new JScrollPane(ingredientsTextArea), gbc);

        // Bahan Tambahan
        gbc.gridx = 0;
        gbc.gridy = 2;  // Pindahkan ke baris berikutnya
        add(new JLabel("Bahan Tambahan:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        additionalIngredientsTextArea = new JTextArea(5, 20);
        additionalIngredientsTextArea.setEditable(false);
        additionalIngredientsTextArea.setLineWrap(true);
        additionalIngredientsTextArea.setWrapStyleWord(true);
        add(new JScrollPane(additionalIngredientsTextArea), gbc);

        // Langkah Memasak
        gbc.gridx = 0;
        gbc.gridy = 3; // Pindahkan ke baris berikutnya
        add(new JLabel("Langkah Memasak:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        stepsTextArea = new JTextArea(5, 20);
        stepsTextArea.setEditable(false);
        stepsTextArea.setLineWrap(true);
        stepsTextArea.setWrapStyleWord(true);
        add(new JScrollPane(stepsTextArea), gbc);

        // Tingkat Kesulitan
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(new JLabel("Tingkat Kesulitan:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        difficultyLabel = new JLabel("Tingkat Kesulitan Tidak Tersedia");
        add(difficultyLabel, gbc);

        // Waktu Memasak
        gbc.gridx = 0;
        gbc.gridy = 5;
        add(new JLabel("Waktu Memasak:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        cookingTimeLabel = new JLabel("Waktu Memasak Tidak Tersedia");
        add(cookingTimeLabel, gbc);

        // Rating
        gbc.gridx = 0;
        gbc.gridy = 6;
        add(new JLabel("Rating:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        ratingLabel = new JLabel("Rating Tidak Tersedia");
        ratingLabel.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
        add(ratingLabel, gbc);
    }

    public void setRecipeData(String recipeName, String mainIngredients, String additionalIngredients, String cookingSteps,
                          String difficulty, String cookingTime, String rating) {
        System.out.println("DEBUG: Data yang diterima untuk setRecipeData:");
        System.out.println("Nama Resep: " + recipeName);
        System.out.println("Bahan Utama: " + mainIngredients);
        System.out.println("Bahan Tambahan: " + additionalIngredients);
        System.out.println("Langkah Memasak: " + cookingSteps);
        System.out.println("Tingkat Kesulitan: " + difficulty);
        System.out.println("Waktu Memasak: " + cookingTime);
        System.out.println("Rating: " + rating);

        nameLabel.setText(recipeName != null ? recipeName : "Nama Resep Tidak Tersedia");
        ingredientsTextArea.setText(mainIngredients != null ? mainIngredients : "Bahan Tidak Tersedia");
        additionalIngredientsTextArea.setText(additionalIngredients != null ? additionalIngredients : "Bahan Tambahan Tidak Tersedia");
        stepsTextArea.setText(cookingSteps != null ? cookingSteps : "Langkah Memasak Tidak Tersedia");
        difficultyLabel.setText(difficulty != null ? difficulty : "Tingkat Kesulitan Tidak Tersedia");
        cookingTimeLabel.setText(cookingTime != null ? cookingTime : "Waktu Memasak Tidak Tersedia");
        ratingLabel.setText(rating != null ? rating.replace("?", "★") : "Rating Tidak Tersedia");
    }












  


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detailPanelPoppins1 = new costum.DetailPanelPoppins();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());
        add(detailPanelPoppins1, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private costum.DetailPanelPoppins detailPanelPoppins1;
    // End of variables declaration//GEN-END:variables
}
