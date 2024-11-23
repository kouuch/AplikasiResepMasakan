/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import costum.GradientPanel;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import theme.FlatLafManager;
/**
 *
 * @author User
 */
public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnkiri = new costum.GradientPanel();
        pnkanan = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnkiri.setForeground(new java.awt.Color(30, 32, 30));
        pnkiri.setColor1(new java.awt.Color(139, 69, 19));
        pnkiri.setColor2(new java.awt.Color(245, 222, 179));

        javax.swing.GroupLayout pnkiriLayout = new javax.swing.GroupLayout(pnkiri);
        pnkiri.setLayout(pnkiriLayout);
        pnkiriLayout.setHorizontalGroup(
            pnkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );
        pnkiriLayout.setVerticalGroup(
            pnkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
        );

        getContentPane().add(pnkiri, java.awt.BorderLayout.LINE_START);

        pnkanan.setBackground(new java.awt.Color(255, 255, 255));
        pnkanan.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(139, 69, 19));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 826, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );

        pnkanan.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(pnkanan, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
         // Terapkan tema FlatLaf
    FlatLafManager.applyFlatLaf();

    // Jalankan aplikasi
    SwingUtilities.invokeLater(() -> {
        new MenuUtama().setVisible(true);
    });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnkanan;
    private costum.GradientPanel pnkiri;
    // End of variables declaration//GEN-END:variables
}
