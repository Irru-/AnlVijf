/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdracht5.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author Nick
 */
@Entity
public class Advertentie {

    @Id
    @GeneratedValue
    private Long ad_id;
    private String naam;
    private String beschrijving;
    private int startPrijs;
    private boolean actief;
    private Date startDatum;

    @ManyToOne
    private Gebruiker gebruiker;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "AD_CAT",
            joinColumns = {
                @JoinColumn(name = "ad_id")},
            inverseJoinColumns = {
                @JoinColumn(name = "cat_id")})
    private Set<Category> categories = new HashSet<Category>();

    public Advertentie() {
    }

    public Advertentie(String naam, String desc, int startPrijs,
            boolean actief, Date startDatum) {
        this();
        this.naam = naam;
        this.beschrijving = desc;
        this.startPrijs = startPrijs;
        this.actief = actief;
        this.startDatum = startDatum;
    }

    /**
     * @return the naam
     */
    public String getNaam() {
        return naam;
    }

    /**
     * @param naam the naam to set
     */
    public void setNaam(String naam) {
        this.naam = naam;
    }

    /**
     * @return the beschrijving
     */
    public String getBeschrijving() {
        return beschrijving;
    }

    /**
     * @param beschrijving the beschrijving to set
     */
    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    /**
     * @return the startPrijs
     */
    public int getStartPrijs() {
        return startPrijs;
    }

    /**
     * @param startPrijs the startPrijs to set
     */
    public void setStartPrijs(int startPrijs) {
        this.startPrijs = startPrijs;
    }

    /**
     * @return the actief
     */
    public boolean isActief() {
        return actief;
    }

    /**
     * @param actief the actief to set
     */
    public void setActief(boolean actief) {
        this.actief = actief;
    }

    /**
     * @return the startDatum
     */
    public Date getStartDatum() {
        return startDatum;
    }

    /**
     * @param startDatum the startDatum to set
     */
    public void setStartDatum(Date startDatum) {
        this.startDatum = startDatum;
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
     * @return the category
     */
    public Set<Category> getCategory() {
        return categories;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.categories = categories;
    }

    /**
     * @return the ad_id
     */
    public Long getAd_id() {
        return ad_id;
    }

    /**
     * @param ad_id the ad_id to set
     */
    public void setAd_id(Long ad_id) {
        this.ad_id = ad_id;
    }

}
