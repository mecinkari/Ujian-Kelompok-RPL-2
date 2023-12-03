/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import model.Anggota;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
/**
 *
 * @author Tamcin
 */
public class AnggotaDaoImpl implements AnggotaDao{
    private final SessionFactory sessionFactory;

    public AnggotaDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    @SuppressWarnings("ConvertToTryWithResources")
    public void save(Anggota anggota) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.save(anggota);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Override
    @SuppressWarnings("ConvertToTryWithResources")
    public void update(Anggota anggota) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.update(anggota);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Override
    @SuppressWarnings("ConvertToTryWithResources")
    public void delete(Anggota anggota) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.delete(anggota);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Override
    @SuppressWarnings("ConvertToTryWithResources")
    public Anggota getAnggota(String idAnggota) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            Anggota anggota = (Anggota) session.get(Anggota.class, idAnggota);
            session.getTransaction().commit();
            return anggota;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }

    @Override
    @SuppressWarnings("ConvertToTryWithResources")
    public List<Anggota> getAnggotas() {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            List<Anggota> anggotas = session.createCriteria(Anggota.class).list();
            session.getTransaction().commit();
            return anggotas;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }
}
