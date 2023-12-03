/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import configuration.AnggotaTableModel;
import configuration.AnggotaHibernateUtil;
import dao.AnggotaDao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Anggota;
import view.TambahAnggotaView;
/**
 *
 * @author Tamcin
 */
public class AnggotaController {
    private final TambahAnggotaView tambahAnggotaView;
    private AnggotaTableModel anggotaTableModel;
    private List<Anggota> anggotas;
    private final AnggotaDao anggotaDao = AnggotaHibernateUtil.getAnggotaDao();

    public AnggotaController(TambahAnggotaView tambahAnggotaView) {
        this.tambahAnggotaView = tambahAnggotaView;
    }
    
    public void tampilData() {
        anggotas = anggotaDao.getAnggotas();
        anggotaTableModel = new AnggotaTableModel(anggotas);
        this.tambahAnggotaView.getTable().setModel(anggotaTableModel);
    }
    
    public void show() {
        int index = this.tambahAnggotaView.getTable().getSelectedRow();
        
        this.tambahAnggotaView.getTxtIdAnggota().setText(String.valueOf(this.tambahAnggotaView.getTable().getValueAt(index, 0)));
        this.tambahAnggotaView.getTxtNamaAnggota().setText(String.valueOf(this.tambahAnggotaView.getTable().getValueAt(index, 1)));
        this.tambahAnggotaView.getTxtEmail().setText(String.valueOf(this.tambahAnggotaView.getTable().getValueAt(index, 2)));
        this.tambahAnggotaView.getTxtNoTelp().setText(String.valueOf(this.tambahAnggotaView.getTable().getValueAt(index, 3)));
        this.tambahAnggotaView.getTxtAlamat().setText(String.valueOf(this.tambahAnggotaView.getTable().getValueAt(index, 4)));

    }
    
    public void clear() {
        this.tambahAnggotaView.getTxtIdAnggota().setText("");
        this.tambahAnggotaView.getTxtNamaAnggota().setText("");
        this.tambahAnggotaView.getTxtEmail().setText("");
        this.tambahAnggotaView.getTxtNoTelp().setText("");
        this.tambahAnggotaView.getTxtAlamat().setText("");
    }
    
    public void saveAnggota() {
        Anggota anggota = new Anggota();
        anggota.setNamaAnggota(this.tambahAnggotaView.getTxtNamaAnggota().getText());
        anggota.setEmail(this.tambahAnggotaView.getTxtEmail().getText());
        anggota.setNoTelp(this.tambahAnggotaView.getTxtNoTelp().getText());
        anggota.setAlamat(this.tambahAnggotaView.getTxtAlamat().getText());
        
        anggotaDao.save(anggota);
        JOptionPane.showMessageDialog(null, "Data berhasil di Simpan", "info", JOptionPane.INFORMATION_MESSAGE);
        clear();
        tampilData();
    }
    
    public void updateAnggota() {
        Anggota anggota = new Anggota();
        anggota.setIdAnggota(this.tambahAnggotaView.getTxtIdAnggota().getText());
        anggota.setNamaAnggota(this.tambahAnggotaView.getTxtNamaAnggota().getText());
        anggota.setEmail(this.tambahAnggotaView.getTxtEmail().getText());
        anggota.setNoTelp(this.tambahAnggotaView.getTxtNoTelp().getText());
        anggota.setAlamat(this.tambahAnggotaView.getTxtAlamat().getText());
        
        anggotaDao.update(anggota);
        JOptionPane.showMessageDialog(null, "Data Berhasil di Edit", "info", JOptionPane.INFORMATION_MESSAGE);
        clear();
        tampilData();
    }
    
    public void hapusAnggota() {
        if (this.tambahAnggotaView.getTxtIdAnggota().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Anggota Belum Dipilih", "error", JOptionPane.ERROR_MESSAGE);
        } else {
            Anggota anggota = new Anggota();
            anggota.setIdAnggota(this.tambahAnggotaView.getTxtIdAnggota().getText());
            int pilih = JOptionPane.showConfirmDialog(null, "Apakah anda ingin menghapus data ini?", 
                    "warning", JOptionPane.YES_NO_OPTION);
            if (pilih == JOptionPane.YES_OPTION) {
                anggotaDao.delete(anggota);
                JOptionPane.showMessageDialog(null, "Data Berhasil di hapus", "info", JOptionPane.INFORMATION_MESSAGE);
                clear();
                tampilData();
            }
        }
    }
}
