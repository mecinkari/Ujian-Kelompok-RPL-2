/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package configuration;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Peminjaman;
/**
 *
 * @author Tamcin
 */
public class PeminjamanTableModel extends AbstractTableModel {
    private List<Peminjaman> peminjamans = new ArrayList<>();
    private final String HEADER[] = {"ID Peminjaman", "Nama Peminjam", "Buku", "Tanggal Pinjam", "Tanggal Kembali"};

    public PeminjamanTableModel(List<Peminjaman> peminjamans) {
        this.peminjamans = peminjamans;
    }
    
    @Override
    public int getRowCount() {
        return peminjamans.size();
    }

    @Override
    public int getColumnCount() {
        return HEADER.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Peminjaman peminjaman = peminjamans.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return peminjaman.getIdPeminjaman();
            case 1:
                return peminjaman.getNamaAnggota();
            case 2:
                return peminjaman.getNamaBuku();
            case 3:
                return peminjaman.getTanggalPeminjaman();
            case 4:
                return peminjaman.getTanggalKembali();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return HEADER[column];
    }
}
