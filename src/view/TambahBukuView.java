/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import controller.BukuController;


/**
 *
 * @author Tamcin
 */
public class TambahBukuView extends javax.swing.JFrame {
    private static BukuController controller;
    /**
     * Creates new form TambahBukuView
     */
    public TambahBukuView() {
        initComponents();
        controller = new BukuController(this);
        controller.tampilData();
    }

    public JTable getTableBuku() {
        return tableBuku;
    }

    public void setTableBuku(JTable tableBuku) {
        this.tableBuku = tableBuku;
    }

    public JTextField getTxtIdBuku() {
        return txtIdBuku;
    }

    public void setTxtIdBuku(JTextField txtIdBuku) {
        this.txtIdBuku = txtIdBuku;
    }

    public JTextField getTxtNamaBuku() {
        return txtNamaBuku;
    }

    public void setTxtNamaBuku(JTextField txtNamaBuku) {
        this.txtNamaBuku = txtNamaBuku;
    }

    public JTextField getTxtPenerbitBuku() {
        return txtPenerbitBuku;
    }

    public void setTxtPenerbitBuku(JTextField txtPenerbitBuku) {
        this.txtPenerbitBuku = txtPenerbitBuku;
    }

    public JTextField getTxtPenulisBuku() {
        return txtPenulisBuku;
    }

    public void setTxtPenulisBuku(JTextField txtPenulisBuku) {
        this.txtPenulisBuku = txtPenulisBuku;
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
        btnTambahBukuKeluar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtIdBuku = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNamaBuku = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPenulisBuku = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBuku = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtPenerbitBuku = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TAMBAH BUKU");

        btnTambahBukuKeluar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTambahBukuKeluar.setText("Kembali");
        btnTambahBukuKeluar.setBorder(new javax.swing.border.LineBorder(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"), 1, true));
        btnTambahBukuKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahBukuKeluarActionPerformed(evt);
            }
        });

        jLabel2.setText("ID Buku");

        jLabel3.setText("Nama Buku");

        jLabel4.setText("Penulis");

        tableBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBuku);

        jLabel5.setText("Penerbit");

        btnSimpan.setText("SIMPAN");
        btnSimpan.setBorder(new javax.swing.border.LineBorder(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"), 1, true));
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUbah.setText("UBAH");
        btnUbah.setBorder(new javax.swing.border.LineBorder(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"), 1, true));
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("HAPUS");
        btnHapus.setBorder(new javax.swing.border.LineBorder(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"), 1, true));
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPenerbitBuku, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                            .addComponent(txtPenulisBuku, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamaBuku, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTambahBukuKeluar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdBuku, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUbah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimpan))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUbah))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPenulisBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPenerbitBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTambahBukuKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahBukuKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahBukuKeluarActionPerformed
        dispose();
        new AppView().setVisible(true);
    }//GEN-LAST:event_btnTambahBukuKeluarActionPerformed

    private void tableBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBukuMouseClicked
        // TODO add your handling code here:
        controller.show();
    }//GEN-LAST:event_tableBukuMouseClicked

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        controller.saveBuku();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        controller.updateBuku();
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        controller.hapusBuku();
    }//GEN-LAST:event_btnHapusActionPerformed

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
            java.util.logging.Logger.getLogger(TambahBukuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahBukuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahBukuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahBukuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahBukuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambahBukuKeluar;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableBuku;
    private javax.swing.JTextField txtIdBuku;
    private javax.swing.JTextField txtNamaBuku;
    private javax.swing.JTextField txtPenerbitBuku;
    private javax.swing.JTextField txtPenulisBuku;
    // End of variables declaration//GEN-END:variables
}
