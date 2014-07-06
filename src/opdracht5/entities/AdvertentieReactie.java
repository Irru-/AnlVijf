/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdracht5.entities;

import java.util.Date;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Nick
 */
@Entity
public class AdvertentieReactie {

    @Id
    @GeneratedValue
    private Long id;

    private String tekst;
    private Date datum;

    @ManyToOne
    private Advertentie advertentie;

    @ManyToOne
    private Gebruiker gebruiker;

    public AdvertentieReactie() {
    }

    public AdvertentieReactie(String tekst, Date datum) {
        this();
        this.tekst = tekst;
        this.datum = datum;
    }

    /**
     * @return the tekst
     */
    public String getTekst() {
        return tekst;
    }

    /**
     * @param tekst the tekst to set
     */
    public void setTekst(String tekst) {
        this.tekst = tekst;
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

}
