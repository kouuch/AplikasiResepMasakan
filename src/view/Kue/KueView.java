
package view.Kue;

import costum.LabelGambar;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class KueView extends javax.swing.JPanel {

    /**
     * Creates new form KueView
     */
    public KueView() {
   initComponents();
        
        // Menggunakan layout null untuk kontrol manual
        this.setLayout(null);  // Tidak ada layout manager, kontrol posisi manual
        
        // Membuat LabelGambar dan menambahkan ke panel
        // Menggunakan path relatif untuk gambar yang ada di dalam folder img
        LabelGambar labelGambar = new LabelGambar("/img/kue.png");  // Path gambar sesuai dengan tempat Anda menyimpan gambar
        
        // Menentukan posisi dan ukuran gambar
        labelGambar.setBounds(0, 0, 794, 526);  // Tentukan posisi dan ukuran gambar sesuai dengan kebutuhan
        
        // Menambahkan LabelGambar ke panel
        this.add(labelGambar);  // Menambahkan label gambar ke panel
        
        // Menentukan ukuran panel
        this.setPreferredSize(new java.awt.Dimension(794, 526));  // Ukuran panel sesuai dengan gambar
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
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kue.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
