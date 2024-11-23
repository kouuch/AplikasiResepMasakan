/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import costum.CustomSVGLabel;
import costum.GradientPanel;
import costum.SVGUtils;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.batik.transcoder.TranscoderException;
import theme.FlatLafManager;
import view.FromMenuutama;
/**
 *
 * @author User
 */
public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
         initComponents(); // Panggil initComponents() terlebih dahulu
         //tambahkanKomponen(); // Buat metode terpisah untuk logika tambahan
    }
    


//private void tambahkanKomponen() {
   // CustomSVGLabel customSVGLabel = new CustomSVGLabel("img/logo.svg", 50, 50);
   // customSVGLabel.setBounds(20, 200, 150, 150);
   // pnkiri.add(customSVGLabel);

    //JButton btnPilihSVG = new JButton("Pilih File SVG");
  //  btnPilihSVG.setBounds(20, 300, 150, 30);
   // btnPilihSVG.addActionListener(e -> pilihFileSVG());
   // pnkiri.add(btnPilihSVG);
//}

//private void pilihFileSVG() {
   // JFileChooser fileChooser = new JFileChooser();
   // int result = fileChooser.showOpenDialog(this);
   // if (result == JFileChooser.APPROVE_OPTION) {
    //    File selectedFile = fileChooser.getSelectedFile();
      //  customSVGLabel1.setSvgPath(selectedFile.getAbsolutePath());
   // }
//}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnkiri = new costum.GradientPanel();
        jLabel1 = new javax.swing.JLabel();
        pnMain = new javax.swing.JPanel();
        pnLine = new javax.swing.JPanel();
        btnMenuutama = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnkanan = new javax.swing.JPanel();
        pnDasar = new javax.swing.JPanel();
        pnUtama = new javax.swing.JPanel();
        gradientPanelHorizontal1 = new costum.GradientPanelHorizontal();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnkiri.setForeground(new java.awt.Color(30, 32, 30));
        pnkiri.setColor1(new java.awt.Color(139, 69, 19));
        pnkiri.setColor2(new java.awt.Color(139, 69, 19));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Resep Masakan");

        pnMain.setBackground(new java.awt.Color(139, 69, 19));

        pnLine.setBackground(new java.awt.Color(0, 0, 0));
        pnLine.setPreferredSize(new java.awt.Dimension(5, 35));

        javax.swing.GroupLayout pnLineLayout = new javax.swing.GroupLayout(pnLine);
        pnLine.setLayout(pnLineLayout);
        pnLineLayout.setHorizontalGroup(
            pnLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pnLineLayout.setVerticalGroup(
            pnLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnMenuutama.setBackground(new java.awt.Color(204, 204, 204));
        btnMenuutama.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMenuutama.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuutama.setText("Menu Utama");
        btnMenuutama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuutamaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuutamaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuutamaMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Home.png"))); // NOI18N

        javax.swing.GroupLayout pnMainLayout = new javax.swing.GroupLayout(pnMain);
        pnMain.setLayout(pnMainLayout);
        pnMainLayout.setHorizontalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnMenuutama, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        pnMainLayout.setVerticalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnLine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
            .addGroup(pnMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMenuutama)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnkiriLayout = new javax.swing.GroupLayout(pnkiri);
        pnkiri.setLayout(pnkiriLayout);
        pnkiriLayout.setHorizontalGroup(
            pnkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnkiriLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnkiriLayout.setVerticalGroup(
            pnkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnkiriLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(518, Short.MAX_VALUE))
        );

        getContentPane().add(pnkiri, java.awt.BorderLayout.LINE_START);

        pnkanan.setBackground(new java.awt.Color(255, 255, 255));
        pnkanan.setLayout(new java.awt.BorderLayout());

        pnDasar.setBackground(new java.awt.Color(250, 250, 250));

        pnUtama.setBackground(new java.awt.Color(255, 255, 255));
        pnUtama.setLayout(new java.awt.BorderLayout());

        gradientPanelHorizontal1.setColor1(new java.awt.Color(139, 69, 19));
        gradientPanelHorizontal1.setColor2(new java.awt.Color(245, 222, 179));

        javax.swing.GroupLayout gradientPanelHorizontal1Layout = new javax.swing.GroupLayout(gradientPanelHorizontal1);
        gradientPanelHorizontal1.setLayout(gradientPanelHorizontal1Layout);
        gradientPanelHorizontal1Layout.setHorizontalGroup(
            gradientPanelHorizontal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 824, Short.MAX_VALUE)
        );
        gradientPanelHorizontal1Layout.setVerticalGroup(
            gradientPanelHorizontal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnDasarLayout = new javax.swing.GroupLayout(pnDasar);
        pnDasar.setLayout(pnDasarLayout);
        pnDasarLayout.setHorizontalGroup(
            pnDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanelHorizontal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnDasarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pnUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        pnDasarLayout.setVerticalGroup(
            pnDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDasarLayout.createSequentialGroup()
                .addComponent(gradientPanelHorizontal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(pnUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        pnkanan.add(pnDasar, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnkanan, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuutamaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuutamaMouseEntered
        pnMain.setBackground(Color.decode("#D2B48C"));
        pnLine.setBackground(Color.decode("#FFF5E1"));
    }//GEN-LAST:event_btnMenuutamaMouseEntered

    private void btnMenuutamaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuutamaMouseExited
        pnMain.setBackground(Color.decode("#8B4513"));
        pnLine.setBackground(Color.decode("#000000"));
    }//GEN-LAST:event_btnMenuutamaMouseExited
        
    private void btnMenuutamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuutamaMouseClicked
        pnMain.setBackground(Color.decode("#FDDBBB"));
        pnLine.setBackground(Color.decode("#FFF5E1"));
        
        pnUtama.removeAll();
        pnUtama.add(new FromMenuutama());
        pnUtama.repaint();
        pnUtama.revalidate();
    }//GEN-LAST:event_btnMenuutamaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
   // Terapkan tema FlatLaf
        FlatLafManager.applyFlatLaf();

        // Jalankan aplikasi
        SwingUtilities.invokeLater(() -> {
;
            new MenuUtama().setVisible(true);
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnMenuutama;
    private costum.GradientPanelHorizontal gradientPanelHorizontal1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel pnDasar;
    private javax.swing.JPanel pnLine;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnUtama;
    private javax.swing.JPanel pnkanan;
    private costum.GradientPanel pnkiri;
    // End of variables declaration//GEN-END:variables
}
