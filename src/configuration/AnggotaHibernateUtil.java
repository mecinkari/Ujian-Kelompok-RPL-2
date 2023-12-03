/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Hibernate/HibernateUtil.java to edit this template
 */
package configuration;

import dao.AnggotaDao;
import dao.AnggotaDaoImpl;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Tamcin
 */
public class AnggotaHibernateUtil {

    private static final SessionFactory sessionFactory;
    private static final AnggotaDao ANGGOTA_DAO;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
            ANGGOTA_DAO = new AnggotaDaoImpl(sessionFactory);
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed. " + ex);
            ex.printStackTrace();
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public static AnggotaDao getAnggotaDao() {
        return ANGGOTA_DAO;
    }
}
