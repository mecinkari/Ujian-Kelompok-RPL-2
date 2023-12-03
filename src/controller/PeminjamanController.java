/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Statement;
import java.sql.ResultSet;
import configuration.PeminjamanTableModel;
import configuration.PeminjamanHibernateUtil;
import dao.PeminjamanDao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import javax.swing.JOptionPane;
import model.Peminjaman;
import view.TambahPeminjamanView;
import connection.Conn;
/**
 *
 * @author Tamcin
 */
public class PeminjamanController {
    private final TambahPeminjamanView tambahPeminjamanView;
    private PeminjamanTableModel peminjamanTableModel;
    private List<Peminjaman> peminjamans;
    private final PeminjamanDao peminjamanDao = PeminjamanHibernateUtil.getPeminjamanDao();
    
    private Connection c;

    public PeminjamanController(TambahPeminjamanView tambahPeminjamanView) {
        this.tambahPeminjamanView = tambahPeminjamanView;
        c = Conn.connection();
    }
    
    public void tampilData() {
        peminjamans = peminjamanDao.getPeminjamans();
        peminjamanTableModel = new PeminjamanTableModel(peminjamans);
        this.tambahPeminjamanView.getTable().setModel(peminjamanTableModel);
    }
    
    public void updateNama() {
        try {
            Statement stm = c.createStatement();
            ResultSet rs = stm.executeQuery("SELECT nama_anggota FROM tb_annggota");
            while (rs.next()){
                String nama_anggota = rs.getString("nama_anggota");
                this.tambahPeminjamanView.getComboNamaPeminjam().addItem(nama_anggota);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void updateBuku() {
        try {
            Statement stm = c.createStatement();
            ResultSet rs = stm.executeQuery("SELECT nama_buku FROM tb_buku");
            while (rs.next()){
                String nama_buku = rs.getString("nama_buku");
                this.tambahPeminjamanView.getComboBuku().addItem(nama_buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void show() {
        int index = this.tambahPeminjamanView.getTable().getSelectedRow();
        
        this.tambahPeminjamanView.getTxtIdPeminjaman().setText(String.valueOf(this.tambahPeminjamanView.getTable().getValueAt(index, 0)));
        this.tambahPeminjamanView.getComboNamaPeminjam().setSelectedItem(String.valueOf(this.tambahPeminjamanView.getTable().getValueAt(index, 1)));
        this.tambahPeminjamanView.getComboBuku().setSelectedItem(String.valueOf(this.tambahPeminjamanView.getTable().getValueAt(index, 2)));
        this.tambahPeminjamanView.getTxtTglPinjam().setText(String.valueOf(this.tambahPeminjamanView.getTable().getValueAt(index, 3)));
        this.tambahPeminjamanView.getTxtTglKembali().setText(String.valueOf(this.tambahPeminjamanView.getTable().getValueAt(index, 4)));
    }
    
    public void clear() {
        this.tambahPeminjamanView.getTxtIdPeminjaman().setText("");
        this.tambahPeminjamanView.getComboNamaPeminjam().setSelectedIndex(0);
        this.tambahPeminjamanView.getComboBuku().setSelectedIndex(0);
        this.tambahPeminjamanView.getTxtTglPinjam().setText("");
        this.tambahPeminjamanView.getTxtTglKembali().setText("");
    }
    
    public void savePeminjaman() {
        Peminjaman peminjaman = new Peminjaman();
        peminjaman.setNamaAnggota(this.tambahPeminjamanView.getComboNamaPeminjam().getSelectedItem().toString());
        peminjaman.setNamaBuku(this.tambahPeminjamanView.getComboBuku().getSelectedItem().toString());
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
        
        try {
            peminjaman.setTanggalPeminjaman(dateFormat.parse(this.tambahPeminjamanView.getTxtTglPinjam().getText()));
            peminjaman.setTanggalKembali(dateFormat.parse(this.tambahPeminjamanView.getTxtTglKembali().getText()));
        } catch (Exception e) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, e);
        }
        
        peminjamanDao.save(peminjaman);
        JOptionPane.showMessageDialog(null, "Data berhasil di Simpan", "info", JOptionPane.INFORMATION_MESSAGE);
        clear();
        tampilData();
    }
    
    public void updatePeminjaman() {
        Peminjaman peminjaman = new Peminjaman();
        peminjaman.setIdPeminjaman(this.tambahPeminjamanView.getTxtIdPeminjaman().getText());
        peminjaman.setNamaAnggota(this.tambahPeminjamanView.getComboNamaPeminjam().getSelectedItem().toString());
        peminjaman.setNamaBuku(this.tambahPeminjamanView.getComboBuku().getSelectedItem().toString());
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
        
        try {
            peminjaman.setTanggalPeminjaman(dateFormat.parse(this.tambahPeminjamanView.getTxtTglPinjam().getText()));
            peminjaman.setTanggalKembali(dateFormat.parse(this.tambahPeminjamanView.getTxtTglKembali().getText()));
        } catch (Exception e) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, e);
        }
        
        peminjamanDao.update(peminjaman);
        JOptionPane.showMessageDialog(null, "Data Berhasil di Edit", "info", JOptionPane.INFORMATION_MESSAGE);
        clear();
        tampilData();
    }
    
    public void hapusPeminjaman() {
        if (this.tambahPeminjamanView.getTxtIdPeminjaman().getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Peminjaman Belum Dipilih", "error", JOptionPane.ERROR_MESSAGE);
        } else {
            Peminjaman peminjaman = new Peminjaman();
            peminjaman.setIdPeminjaman(this.tambahPeminjamanView.getTxtIdPeminjaman().getText());
            int pilih = JOptionPane.showConfirmDialog(null, "Apakah anda ingin menghapus data ini?", 
                    "warning", JOptionPane.YES_NO_OPTION);
            if (pilih == JOptionPane.YES_OPTION) {
                peminjamanDao.delete(peminjaman);
                JOptionPane.showMessageDialog(null, "Data Berhasil di hapus", "info", JOptionPane.INFORMATION_MESSAGE);
                clear();
                tampilData();
            }
        }
    }
}
