/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Tamcin
 */
public class AppView extends javax.swing.JFrame {

    /**
     * Creates new form AppView
     */
    public AppView() {
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

        jLabel1 = new javax.swing.JLabel();
        btnTambahBuku = new javax.swing.JButton();
        btnTambahAnggota = new javax.swing.JButton();
        btnPinjamBuku = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistem Perpustakaan");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SISTEM PERPUSTAKAAN");

        btnTambahBuku.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTambahBuku.setText("TAMBAH BUKU");
        btnTambahBuku.setBorder(new javax.swing.border.LineBorder(javax.swing.UIManager.getDefaults().getColor("Button.borderColor"), 1, true));
        btnTambahBuku.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTambahBuku.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTambahBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahBukuActionPerformed(evt);
            }
        });

        btnTambahAnggota.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTambahAnggota.setText("TAMBAH ANGGOTA");
        btnTambahAnggota.setBorder(new javax.swing.border.LineBorder(javax.swing.UIManager.getDefaults().getColor("Button.borderColor"), 1, true));
        btnTambahAnggota.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTambahAnggota.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTambahAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahAnggotaActionPerformed(evt);
            }
        });

        btnPinjamBuku.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPinjamBuku.setText("PINJAM BUKU");
        btnPinjamBuku.setBorder(new javax.swing.border.LineBorder(javax.swing.UIManager.getDefaults().getColor("Button.borderColor"), 1, true));
        btnPinjamBuku.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPinjamBuku.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPinjamBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPinjamBukuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                    .addComponent(btnTambahBuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTambahAnggota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPinjamBuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnTambahBuku)
                .addGap(18, 18, 18)
                .addComponent(btnTambahAnggota)
                .addGap(18, 18, 18)
                .addComponent(btnPinjamBuku)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahBukuActionPerformed
        new TambahBukuView().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTambahBukuActionPerformed

    private void btnTambahAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahAnggotaActionPerformed
        new TambahAnggotaView().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTambahAnggotaActionPerformed

    private void btnPinjamBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPinjamBukuActionPerformed
        new TambahPeminjamanView().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPinjamBukuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPinjamBuku;
    private javax.swing.JButton btnTambahAnggota;
    private javax.swing.JButton btnTambahBuku;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
