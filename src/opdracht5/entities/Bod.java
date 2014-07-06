/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdracht5.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Nick
 */
@Entity
public class Bod {

    @Id
    @GeneratedValue
    private Long id;

    private int prijs;
    private Date datum;

    @ManyToOne
    private Advertentie advertentie;
    
    @ManyToOne
    private Gebruiker gebruiker;

    public Bod() {
    }

    public Bod(int prijs, Date datum) {
        this();
        this.datum = datum;
        this.prijs = prijs;
    }

    /**
     * @return the prijs
     */
    public int getPrijs() {
        return prijs;
    }

    /**
     * @param prijs the prijs to set
     */
    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }

    /**
     * @return the datum
     */
    public Date getDatum() {
        return datum;
    }

    /**
     * @param datum the datum to set
     */
    public void setDatum(Date datum) {
        this.datum = datum;
    }

    /**
     * @return the advertentie
     */
    public Advertentie getAdvertentie() {
        return advertentie;
    }

    /**
     * @param advertentie the advertentie to set
     */
    public void setAdvertentie(Advertentie advertentie) {
        this.advertentie = advertentie;
    }

    /**
     * @return the gebruiker
     */
    public Gebruiker getGebruiker() {
        return gebruiker;
    }

    /**
     * @param gebruiker the gebruiker to set
     */
    public void setGebruiker(Gebruiker gebruiker) {
        this.gebruiker = gebruiker;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
}
