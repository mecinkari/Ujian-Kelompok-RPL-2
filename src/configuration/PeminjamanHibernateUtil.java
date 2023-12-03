/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Hibernate/HibernateUtil.java to edit this template
 */
package configuration;

import dao.PeminjamanDao;
import dao.PeminjamanDaoImpl;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Tamcin
 */
public class PeminjamanHibernateUtil {

    private static final SessionFactory sessionFactory;
    private static final PeminjamanDao PEMINJAMAN_DAO;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
            PEMINJAMAN_DAO = new PeminjamanDaoImpl(sessionFactory);
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
    
    public static PeminjamanDao getPeminjamanDao() {
        return PEMINJAMAN_DAO;
    }
}
