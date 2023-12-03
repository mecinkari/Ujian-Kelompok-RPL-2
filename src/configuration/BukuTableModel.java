/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package configuration;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Buku;
/**
 *
 * @author Tamcin
 */
public class BukuTableModel extends AbstractTableModel {
    private List<Buku> bukus = new ArrayList<>();
    private final String HEADER[] = {"ID Buku", "Nama Buku", "Penulis", "Penerbit"};

    public BukuTableModel(List<Buku> bukus) {
        this.bukus = bukus;
    }
    
    @Override
    public int getRowCount() {
        return bukus.size();
    }

    @Override
    public int getColumnCount() {
        return HEADER.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Buku buku = bukus.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return buku.getIdBuku();
            case 1:
                return buku.getNamaBuku();
            case 2:
                return buku.getPenulisBuku();
            case 3:
                return buku.getPenerbitBuku();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return HEADER[column];
    }
}
