/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.MasakanRumahan;


import java.awt.*;
import javax.swing.*;

public class ViewMasakanRumah extends JPanel {

    private JLabel nameLabel;
    private JTextArea ingredientsTextArea;
    private JTextArea additionalIngredientsTextArea;
    private JTextArea stepsTextArea;
    private JLabel difficultyLabel;
    private JLabel cookingTimeLabel;
    private JLabel ratingLabel;

    public ViewMasakanRumah() {
        // Menggunakan BoxLayout untuk tata letak vertikal
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20)); // Menambahkan jarak luar panel

        // Judul: Nama Resep
        nameLabel = new JLabel("Nama Resep Tidak Tersedia");
        nameLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // Judul rata tengah
        add(nameLabel);

        // Memberi jarak antar elemen
        add(Box.createVerticalStrut(10)); 

        // Bahan Utama
        JLabel ingredientsLabel = new JLabel("Bahan Utama:");
        ingredientsLabel.setAlignmentX(Component.LEFT_ALIGNMENT); // Label rata kiri
        add(ingredientsLabel);

        ingredientsTextArea = new JTextArea(5, 20);
        ingredientsTextArea.setEditable(false);
        ingredientsTextArea.setLineWrap(true);
        ingredientsTextArea.setWrapStyleWord(true);
        JScrollPane ingredientsScroll = new JScrollPane(ingredientsTextArea);
        add(ingredientsScroll);

        // Bahan Tambahan
        add(Box.createVerticalStrut(10)); // Memberi jarak
        JLabel additionalIngredientsLabel = new JLabel("Bahan Tambahan:");
        additionalIngredientsLabel.setAlignmentX(Component.LEFT_ALIGNMENT); // Label rata kiri
        add(additionalIngredientsLabel);

        additionalIngredientsTextArea = new JTextArea(5, 20);
        additionalIngredientsTextArea.setEditable(false);
        additionalIngredientsTextArea.setLineWrap(true);
        additionalIngredientsTextArea.setWrapStyleWord(true);
        JScrollPane additionalIngredientsScroll = new JScrollPane(additionalIngredientsTextArea);
        add(additionalIngredientsScroll);

        // Langkah Memasak
        add(Box.createVerticalStrut(10)); // Memberi jarak
        JLabel stepsLabel = new JLabel("Langkah Memasak:");
        stepsLabel.setAlignmentX(Component.LEFT_ALIGNMENT); // Label rata kiri
        add(stepsLabel);

        stepsTextArea = new JTextArea(5, 20);
        stepsTextArea.setEditable(false);
        stepsTextArea.setLineWrap(true);
        stepsTextArea.setWrapStyleWord(true);
        JScrollPane stepsScroll = new JScrollPane(stepsTextArea);
        add(stepsScroll);

        // Tingkat Kesulitan
        add(Box.createVerticalStrut(10)); // Memberi jarak
        JLabel difficultyTextLabel = new JLabel("Tingkat Kesulitan:");
        difficultyTextLabel.setAlignmentX(Component.LEFT_ALIGNMENT); // Label rata kiri
        add(difficultyTextLabel);

        difficultyLabel = new JLabel("Tingkat Kesulitan Tidak Tersedia");
        difficultyLabel.setAlignmentX(Component.LEFT_ALIGNMENT); // Rata kiri
        add(difficultyLabel);

        // Waktu Memasak
        add(Box.createVerticalStrut(10)); // Memberi jarak
        JLabel cookingTimeTextLabel = new JLabel("Waktu Memasak:");
        cookingTimeTextLabel.setAlignmentX(Component.LEFT_ALIGNMENT); // Label rata kiri
        add(cookingTimeTextLabel);

        cookingTimeLabel = new JLabel("Waktu Memasak Tidak Tersedia");
        cookingTimeLabel.setAlignmentX(Component.LEFT_ALIGNMENT); // Rata kiri
        add(cookingTimeLabel);

        // Rating
        add(Box.createVerticalStrut(10)); // Memberi jarak
        JLabel ratingTextLabel = new JLabel("Rating:");
        ratingTextLabel.setAlignmentX(Component.LEFT_ALIGNMENT); // Label rata kiri
        add(ratingTextLabel);

        ratingLabel = new JLabel("Rating Tidak Tersedia");
        ratingLabel.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
        ratingLabel.setAlignmentX(Component.LEFT_ALIGNMENT); // Rata kiri
        add(ratingLabel);
    }

    public void setRecipeData(String recipeName, String mainIngredients, String additionalIngredients,
                           String cookingSteps, String difficulty, String cookingTime, String rating) {
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
