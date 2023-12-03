/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import model.Peminjaman;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
/**
 *
 * @author Tamcin
 */
public class PeminjamanDaoImpl implements PeminjamanDao{
    private final SessionFactory sessionFactory;

    public PeminjamanDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    @SuppressWarnings("ConvertToTryWithResources")
    public void save(Peminjaman peminjaman) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.save(peminjaman);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Override
    @SuppressWarnings("ConvertToTryWithResources")
    public void update(Peminjaman peminjaman) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.update(peminjaman);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Override
    @SuppressWarnings("ConvertToTryWithResources")
    public void delete(Peminjaman peminjaman) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.delete(peminjaman);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Override
    @SuppressWarnings("ConvertToTryWithResources")
    public Peminjaman getPeminjaman(String idPeminjaman) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            Peminjaman peminjaman = (Peminjaman) session.get(Peminjaman.class, idPeminjaman);
            session.getTransaction().commit();
            return peminjaman;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }

    @Override
    @SuppressWarnings("ConvertToTryWithResources")
    public List<Peminjaman> getPeminjamans() {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            List<Peminjaman> peminjamans = session.createCriteria(Peminjaman.class).list();
            session.getTransaction().commit();
            return peminjamans;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }
}
