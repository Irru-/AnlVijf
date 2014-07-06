/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdracht5;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import opdracht5.entities.*;
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

         Configuration configuration = new Configuration().configure("opdracht5/hibernate.cfg.xml");
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.getCurrentSession();
        
        session.beginTransaction();
        
        //casusEen(session);
        //casusTwee(session);
        casusDrie(session);
        //casusVier(session);
        
        session.getTransaction().commit();
        
        sessionFactory.close();       
    }
    
    private static void casusEen(Session session){   
        Date d = new Date();
        Advertentie a = new Advertentie ("Auto", "Leuke Auto", 4000, true, d);
        Gebruiker g = new Gebruiker ("Nick", "Gobee", "a@a.nl", "1234");
        
        a.setGebruiker(g);
        session.save(g);
        session.save(a);
    }
    
    private static void casusTwee(Session session){
        Date d = new Date();
        Advertentie a = new Advertentie ("XBone", "Hoef hem niet meer", 450,
                                            true, d);
        
        
        Gebruiker g0 = new Gebruiker ("Nick", "Gobee", "a@a.com", "0");
        Gebruiker g1 = new Gebruiker ("Jan", "Jansen", "b@b.com", "1");
        Gebruiker g2 = new Gebruiker ("Piet", "Jansen", "c@c.com", "2");
        Gebruiker g3 = new Gebruiker ("Tom", "Jansen", "d@d.com", "3");
        
        a.setGebruiker(g0);
        
        Bod b1 = new Bod(400, d);
        b1.setAdvertentie(a);
        b1.setGebruiker(g1);
        
        
        Bod b2 = new Bod(450, d);
        b2.setAdvertentie(a);
        b2.setGebruiker(g2);
        
        
        Bod b3 = new Bod(500, d);
        b3.setAdvertentie(a);
        b3.setGebruiker(g3);
        
        iDeal i = new iDeal(5, 2016);
        i.setEigenaarNaam(g3.getAchternaam());
        i.setNummer("35137451");
        i.setGebruiker(g3);
        
        a.setActief(false);
        
        session.save(b1);
        session.save(b2);
        session.save(b3);
        session.save(g0);
        session.save(g1);
        session.save(g2);
        session.save(g3);
        session.save(i);
        session.save(a);
        
    }
    
    private static void casusDrie(Session session){
        
        Date d = new Date();
        
        Advertentie a = new Advertentie ("Wii U", "Heb er geen tijd meer voor",
                                            250, true, d);
        
        Category c0 = new Category("Electronica");
        Category c1 = new Category("Consoles");
        Category c2 = new Category("Nintendo");
        Category c3 = new Category("Alle leeftijden");
        
        c2.setCategory(c1);
        c1.setCategory(c0);
        a.getCategory().add(c2);
        a.getCategory().add(c3);
        
        session.save(c0);
        session.save(c1);
        session.save(c2);
        session.save(c3);
        session.save(a);
        
    }
    
    private static void casusVier(Session session){
        Date d = new Date();
        Advertentie a = new Advertentie ("PS4", "PS4 in nieuwstaat", 350, true
                                            ,d);
        Gebruiker g1 = new Gebruiker ("Jan", "Jansen", "b@b.nl", "1");
        Gebruiker g2 = new Gebruiker ("Piet", "Jansen", "c@c.nl", "2");
        Gebruiker g3 = new Gebruiker ("Tom", "Jansen", "d@d.nl", "3");
        
        AdvertentieReactie ar1 = new AdvertentieReactie("Welke kleur?", d);
        AdvertentieReactie ar2 = new AdvertentieReactie("Hoe oud?", d);
        AdvertentieReactie ar3 = new AdvertentieReactie("Waar woon je?", d);
        
        ar1.setGebruiker(g1);
        ar1.setAdvertentie(a);
        
        ar2.setGebruiker(g2);
        ar2.setAdvertentie(a);
        
        ar3.setGebruiker(g3);
        ar3.setAdvertentie(a);
        
        session.save(a);
        session.save(g1);
        session.save(g2);
        session.save(g3);
        session.save(ar1);
        session.save(ar2);
        session.save(ar3);
        
    }

}
