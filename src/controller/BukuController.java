/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import configuration.BukuTableModel;
import configuration.BukuHibernateUtil;
import dao.BukuDao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Buku;
import view.TambahBukuView;
/**
 *
 * @author Tamcin
 */
public class BukuController {
    private final TambahBukuView tambahBukuView;
    private BukuTableModel bukuTableModel;
    private List<Buku> bukus;
    private final BukuDao bukuDao = BukuHibernateUtil.getBukuDao();

    public BukuController(TambahBukuView tambahBukuView) {
        this.tambahBukuView = tambahBukuView;
    }
    
    public void tampilData() {
        bukus = bukuDao.getBukus();
        bukuTableModel = new BukuTableModel(bukus);
        this.tambahBukuView.getTableBuku().setModel(bukuTableModel);
    }
    
    public void show() {
        int index = this.tambahBukuView.getTableBuku().getSelectedRow();
        
        this.tambahBukuView.getTxtIdBuku().setText(String.valueOf(this.tambahBukuView.getTableBuku().getValueAt(index, 0)));
        this.tambahBukuView.getTxtNamaBuku().setText(String.valueOf(this.tambahBukuView.getTableBuku().getValueAt(index, 1)));
        this.tambahBukuView.getTxtPenulisBuku().setText(String.valueOf(this.tambahBukuView.getTableBuku().getValueAt(index, 2)));
        this.tambahBukuView.getTxtPenerbitBuku().setText(String.valueOf(this.tambahBukuView.getTableBuku().getValueAt(index, 3)));
    }
    
    public void clear() {
        this.tambahBukuView.getTxtIdBuku().setText("");
        this.tambahBukuView.getTxtNamaBuku().setText("");
        this.tambahBukuView.getTxtPenulisBuku().setText("");
        this.tambahBukuView.getTxtPenerbitBuku().setText("");
    }
    
    public void saveBuku() {
        Buku buku = new Buku();
        buku.setNamaBuku(this.tambahBukuView.getTxtNamaBuku().getText());
        buku.setPenerbitBuku(this.tambahBukuView.getTxtPenerbitBuku().getText());
        buku.setPenulisBuku(this.tambahBukuView.getTxtPenulisBuku().getText());
        
        bukuDao.save(buku);
        JOptionPane.showMessageDialog(null, "Data berhasil di Simpan", "info", JOptionPane.INFORMATION_MESSAGE);
        clear();
        tampilData();
    }
    
    public void updateBuku() {
        Buku buku = new Buku();
        buku.setIdBuku(this.tambahBukuView.getTxtIdBuku().getText());
        buku.setNamaBuku(this.tambahBukuView.getTxtNamaBuku().getText());
        buku.setPenerbitBuku(this.tambahBukuView.getTxtPenerbitBuku().getText());
        buku.setPenulisBuku(this.tambahBukuView.getTxtPenulisBuku().getText());
        
        bukuDao.update(buku);
        JOptionPane.showMessageDialog(null, "Data Berhasil di Edit", "info", JOptionPane.INFORMATION_MESSAGE);
        clear();
        tampilData();
    }
    
    public void hapusBuku() {
        if (this.tambahBukuView.getTxtIdBuku().getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Buku Belum Dipilih", "error", JOptionPane.ERROR_MESSAGE);
        } else {
            Buku buku = new Buku();
            buku.setIdBuku(this.tambahBukuView.getTxtIdBuku().getText());
            int pilih = JOptionPane.showConfirmDialog(null, "Apakah anda ingin menghapus data ini?", 
                    "warning", JOptionPane.YES_NO_OPTION);
            if (pilih == JOptionPane.YES_OPTION) {
                bukuDao.delete(buku);
                JOptionPane.showMessageDialog(null, "Data Berhasil di hapus", "info", JOptionPane.INFORMATION_MESSAGE);
                clear();
                tampilData();
            }
        }
    }
}
