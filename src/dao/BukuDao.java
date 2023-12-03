/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import model.Buku;

/**
 *
 * @author Tamcin
 */
public interface BukuDao {
    public void save(Buku buku);
    public void update(Buku buku);
    public void delete(Buku buku);
    public Buku getBuku(String idBuku);
    public List<Buku> getBukus();
}
