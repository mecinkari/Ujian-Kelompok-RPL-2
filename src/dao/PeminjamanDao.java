/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import model.Peminjaman;

/**
 *
 * @author Tamcin
 */
public interface PeminjamanDao {
    public void save(Peminjaman anggota);
    public void update(Peminjaman anggota);
    public void delete(Peminjaman anggota);
    public Peminjaman getPeminjaman(String idPeminjaman);
    public List<Peminjaman> getPeminjamans();
}
