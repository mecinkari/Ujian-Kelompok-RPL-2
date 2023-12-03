/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package configuration;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Anggota;
/**
 *
 * @author Tamcin
 */
public class AnggotaTableModel extends AbstractTableModel {
    private List<Anggota> anggotas = new ArrayList<>();
    private final String HEADER[] = {"ID Anggota", "Nama Anggota", "Email", "No. Telp", "Alamat"};

    public AnggotaTableModel(List<Anggota> anggotas) {
        this.anggotas = anggotas;
    }
    
    @Override
    public int getRowCount() {
        return anggotas.size();
    }

    @Override
    public int getColumnCount() {
        return HEADER.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Anggota anggota = anggotas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return anggota.getIdAnggota();
            case 1:
                return anggota.getNamaAnggota();
            case 2:
                return anggota.getEmail();
            case 3:
                return anggota.getNoTelp();
            case 4:
                return anggota.getAlamat();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return HEADER[column];
    }
}
