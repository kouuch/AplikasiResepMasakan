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
import view.MasakanRumahan.DaftarMasakan;
/**
 *
 * @author User
 */
public class MenuUtama extends javax.swing.JFrame {

    int xx,xy;
    public MenuUtama() {
         initComponents();
         setLocationRelativeTo(null);
// Panggil initComponents() terlebih dahulu
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
        btnMenuutama1 = new javax.swing.JLabel();
        btnMenuutama2 = new javax.swing.JLabel();
        pnMain1 = new javax.swing.JPanel();
        pnLine1 = new javax.swing.JPanel();
        btnMenuutama3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnMain2 = new javax.swing.JPanel();
        pnLine2 = new javax.swing.JPanel();
        btnMenuutama4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pnMain3 = new javax.swing.JPanel();
        pnLine3 = new javax.swing.JPanel();
        btnMenuutama5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pnkanan = new javax.swing.JPanel();
        pnDasar = new javax.swing.JPanel();
        pnUtama = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        gradientPanelHorizontal1 = new costum.GradientPanelHorizontal();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        pnkiri.setForeground(new java.awt.Color(30, 32, 30));
        pnkiri.setColor1(new java.awt.Color(139, 69, 19));
        pnkiri.setColor2(new java.awt.Color(139, 69, 19));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Resep Masakan");

        pnMain.setBackground(new java.awt.Color(139, 69, 19));

        pnLine.setBackground(new java.awt.Color(139, 69, 19));
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
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Dashboard Layout.png"))); // NOI18N

        javax.swing.GroupLayout pnMainLayout = new javax.swing.GroupLayout(pnMain);
        pnMain.setLayout(pnMainLayout);
        pnMainLayout.setHorizontalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMenuutama, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnMainLayout.setVerticalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnLine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
            .addGroup(pnMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(btnMenuutama))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnMenuutama1.setBackground(new java.awt.Color(204, 204, 204));
        btnMenuutama1.setForeground(new java.awt.Color(204, 204, 204));
        btnMenuutama1.setText("Master Data");
        btnMenuutama1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuutama1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuutama1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuutama1MouseExited(evt);
            }
        });

        btnMenuutama2.setBackground(new java.awt.Color(204, 204, 204));
        btnMenuutama2.setForeground(new java.awt.Color(204, 204, 204));
        btnMenuutama2.setText("Resep");
        btnMenuutama2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuutama2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuutama2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuutama2MouseExited(evt);
            }
        });

        pnMain1.setBackground(new java.awt.Color(139, 69, 19));

        pnLine1.setBackground(new java.awt.Color(139, 69, 19));
        pnLine1.setPreferredSize(new java.awt.Dimension(5, 35));

        javax.swing.GroupLayout pnLine1Layout = new javax.swing.GroupLayout(pnLine1);
        pnLine1.setLayout(pnLine1Layout);
        pnLine1Layout.setHorizontalGroup(
            pnLine1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pnLine1Layout.setVerticalGroup(
            pnLine1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnMenuutama3.setBackground(new java.awt.Color(204, 204, 204));
        btnMenuutama3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMenuutama3.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuutama3.setText("Masakan Rumahan");
        btnMenuutama3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuutama3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuutama3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuutama3MouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Home.png"))); // NOI18N

        javax.swing.GroupLayout pnMain1Layout = new javax.swing.GroupLayout(pnMain1);
        pnMain1.setLayout(pnMain1Layout);
        pnMain1Layout.setHorizontalGroup(
            pnMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMain1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMenuutama3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnMain1Layout.setVerticalGroup(
            pnMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnLine1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
            .addGroup(pnMain1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(btnMenuutama3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnMain2.setBackground(new java.awt.Color(139, 69, 19));

        pnLine2.setBackground(new java.awt.Color(0, 0, 0));
        pnLine2.setPreferredSize(new java.awt.Dimension(5, 35));

        javax.swing.GroupLayout pnLine2Layout = new javax.swing.GroupLayout(pnLine2);
        pnLine2.setLayout(pnLine2Layout);
        pnLine2Layout.setHorizontalGroup(
            pnLine2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pnLine2Layout.setVerticalGroup(
            pnLine2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnMenuutama4.setBackground(new java.awt.Color(204, 204, 204));
        btnMenuutama4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMenuutama4.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuutama4.setText("Sayuran");
        btnMenuutama4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuutama4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuutama4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuutama4MouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Vegan Food.png"))); // NOI18N

        javax.swing.GroupLayout pnMain2Layout = new javax.swing.GroupLayout(pnMain2);
        pnMain2.setLayout(pnMain2Layout);
        pnMain2Layout.setHorizontalGroup(
            pnMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMain2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMenuutama4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnMain2Layout.setVerticalGroup(
            pnMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnLine2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
            .addGroup(pnMain2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(btnMenuutama4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnMain3.setBackground(new java.awt.Color(139, 69, 19));

        pnLine3.setBackground(new java.awt.Color(0, 0, 0));
        pnLine3.setPreferredSize(new java.awt.Dimension(5, 35));

        javax.swing.GroupLayout pnLine3Layout = new javax.swing.GroupLayout(pnLine3);
        pnLine3.setLayout(pnLine3Layout);
        pnLine3Layout.setHorizontalGroup(
            pnLine3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pnLine3Layout.setVerticalGroup(
            pnLine3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnMenuutama5.setBackground(new java.awt.Color(204, 204, 204));
        btnMenuutama5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMenuutama5.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuutama5.setText("Kue");
        btnMenuutama5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuutama5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuutama5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuutama5MouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cake.png"))); // NOI18N

        javax.swing.GroupLayout pnMain3Layout = new javax.swing.GroupLayout(pnMain3);
        pnMain3.setLayout(pnMain3Layout);
        pnMain3Layout.setHorizontalGroup(
            pnMain3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMain3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnLine3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMenuutama5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnMain3Layout.setVerticalGroup(
            pnMain3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnLine3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
            .addGroup(pnMain3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnMain3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(btnMenuutama5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnkiriLayout = new javax.swing.GroupLayout(pnkiri);
        pnkiri.setLayout(pnkiriLayout);
        pnkiriLayout.setHorizontalGroup(
            pnkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnkiriLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMenuutama1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMenuutama2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnMain1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(pnMain2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(pnMain3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pnkiriLayout.setVerticalGroup(
            pnkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnkiriLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenuutama1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnMenuutama2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnMain1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnMain2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnMain3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(331, Short.MAX_VALUE))
        );

        getContentPane().add(pnkiri, java.awt.BorderLayout.LINE_START);

        pnkanan.setBackground(new java.awt.Color(255, 255, 255));
        pnkanan.setLayout(new java.awt.BorderLayout());

        pnDasar.setBackground(new java.awt.Color(250, 250, 250));

        pnUtama.setBackground(new java.awt.Color(255, 255, 255));
        pnUtama.setLayout(new java.awt.BorderLayout());
        pnUtama.add(jLabel2, java.awt.BorderLayout.CENTER);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/intro.png"))); // NOI18N
        pnUtama.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        gradientPanelHorizontal1.setColor1(new java.awt.Color(139, 69, 19));
        gradientPanelHorizontal1.setColor2(new java.awt.Color(245, 222, 179));

        javax.swing.GroupLayout gradientPanelHorizontal1Layout = new javax.swing.GroupLayout(gradientPanelHorizontal1);
        gradientPanelHorizontal1.setLayout(gradientPanelHorizontal1Layout);
        gradientPanelHorizontal1Layout.setHorizontalGroup(
            gradientPanelHorizontal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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
        pnLine.setBackground(Color.decode("#8B4513"));
    }//GEN-LAST:event_btnMenuutamaMouseExited
        
    private void btnMenuutamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuutamaMouseClicked
        pnMain.setBackground(Color.decode("#FDDBBB"));
        pnLine.setBackground(Color.decode("#FFF5E1"));
        
        pnUtama.removeAll();
        pnUtama.add(new FromMenuutama());
        pnUtama.repaint();
        pnUtama.revalidate();
    }//GEN-LAST:event_btnMenuutamaMouseClicked

    private void btnMenuutama1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuutama1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuutama1MouseClicked

    private void btnMenuutama1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuutama1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuutama1MouseEntered

    private void btnMenuutama1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuutama1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuutama1MouseExited

    private void btnMenuutama2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuutama2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuutama2MouseClicked

    private void btnMenuutama2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuutama2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuutama2MouseEntered

    private void btnMenuutama2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuutama2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuutama2MouseExited

    private void btnMenuutama3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuutama3MouseClicked
       pnMain1.setBackground(Color.decode("#FDDBBB"));
        pnLine1.setBackground(Color.decode("#FFF5E1"));

        pnUtama.removeAll();
        pnUtama.add(new DaftarMasakan()); // Arahkan ke panel Daftarmasakan
        pnUtama.repaint();
        pnUtama.revalidate(); 
    }//GEN-LAST:event_btnMenuutama3MouseClicked

    private void btnMenuutama3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuutama3MouseEntered
        pnMain1.setBackground(Color.decode("#D2B48C"));
        pnLine1.setBackground(Color.decode("#FFF5E1"));
    }//GEN-LAST:event_btnMenuutama3MouseEntered

    private void btnMenuutama3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuutama3MouseExited
        pnMain1.setBackground(Color.decode("#8B4513"));
        pnLine1.setBackground(Color.decode("#8B4513"));
    }//GEN-LAST:event_btnMenuutama3MouseExited

    private void btnMenuutama4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuutama4MouseClicked
        pnMain2.setBackground(Color.decode("#FDDBBB"));
        pnLine2.setBackground(Color.decode("#FFF5E1"));
        
        pnUtama.removeAll();
        //pnUtama.add(new FromMenuutama());
        pnUtama.repaint();
        pnUtama.revalidate();
    }//GEN-LAST:event_btnMenuutama4MouseClicked

    private void btnMenuutama4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuutama4MouseEntered
        pnMain2.setBackground(Color.decode("#D2B48C"));
        pnLine2.setBackground(Color.decode("#FFF5E1"));
    }//GEN-LAST:event_btnMenuutama4MouseEntered

    private void btnMenuutama4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuutama4MouseExited
        pnMain2.setBackground(Color.decode("#8B4513"));
        pnLine2.setBackground(Color.decode("#8B4513"));
    }//GEN-LAST:event_btnMenuutama4MouseExited

    private void btnMenuutama5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuutama5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuutama5MouseClicked

    private void btnMenuutama5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuutama5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuutama5MouseEntered

    private void btnMenuutama5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuutama5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuutama5MouseExited

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xy = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
       int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
       this.setLocation(x - xx, y - xy);
    
    }//GEN-LAST:event_formMouseDragged

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
    private javax.swing.JLabel btnMenuutama1;
    private javax.swing.JLabel btnMenuutama2;
    private javax.swing.JLabel btnMenuutama3;
    private javax.swing.JLabel btnMenuutama4;
    private javax.swing.JLabel btnMenuutama5;
    private costum.GradientPanelHorizontal gradientPanelHorizontal1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pnDasar;
    private javax.swing.JPanel pnLine;
    private javax.swing.JPanel pnLine1;
    private javax.swing.JPanel pnLine2;
    private javax.swing.JPanel pnLine3;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnMain1;
    private javax.swing.JPanel pnMain2;
    private javax.swing.JPanel pnMain3;
    private javax.swing.JPanel pnUtama;
    private javax.swing.JPanel pnkanan;
    private costum.GradientPanel pnkiri;
    // End of variables declaration//GEN-END:variables
}
