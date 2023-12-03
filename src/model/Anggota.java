/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
/**
 *
 * @author Tamcin
 */
@Entity
@Table(name = "tb_annggota")
public class Anggota implements Serializable{
    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id_anggota", length = 200)
    private String idAnggota;
    
    @Column(name = "nama_anggota", length = 100)
    private String namaAnggota;
    
    @Column(name = "email", length = 100)
    private String email;
    
    @Column(name = "no_telp", length = 100)
    private String noTelp;
    
    @Column(name = "alamat", length = 200)
    private String alamat;

    public String getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getNamaAnggota() {
        return namaAnggota;
    }

    public void setNamaAnggota(String namaAnggota) {
        this.namaAnggota = namaAnggota;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
}
