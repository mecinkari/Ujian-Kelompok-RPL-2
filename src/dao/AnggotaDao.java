/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import model.Anggota;

/**
 *
 * @author Tamcin
 */
public interface AnggotaDao {
    public void save(Anggota anggota);
    public void update(Anggota anggota);
    public void delete(Anggota anggota);
    public Anggota getAnggota(String idAnggota);
    public List<Anggota> getAnggotas();
}
