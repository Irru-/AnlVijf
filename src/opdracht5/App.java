/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdracht5;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import opdracht5.entities.Gebruiker;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author Nick
 */
public class App {

    protected static Statement stmt = null;
    protected static Statement stmt2 = null;
    protected static Connection conn = null;
    protected static ResultSet rs = null;
    protected static ResultSet rs2 = null;
    protected static boolean match;
    private static SessionFactory sessionFactory;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Configuration configuration = new Configuration().configure("opdracht5/hibernate.cfg.xml");
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.getCurrentSession();
        
        session.beginTransaction();
        
        saveGebruiker(session);
        
        session.getTransaction().commit();
        
        sessionFactory.close();       
    }
    
    private static void saveGebruiker(Session session){
        Gebruiker g = new Gebruiker ("Nick", "Gobee", "a@a.nl", "1234");
        session.save(g);
    }

}
