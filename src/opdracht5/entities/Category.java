/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdracht5.entities;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Nick
 */
@Entity
public class Category {

    @Id
    @GeneratedValue
    private Long cat_id;

    @OneToOne
    private Category category;

    @ManyToMany(mappedBy = "categories")
    private Set<Advertentie> advertenties = new HashSet<Advertentie>();

    private String naam;

    public Category() {
    }

    public Category(String naam) {
        this();
        this.naam = naam;
    }

    /**
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
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
     * @return the advertenties
     */
    public Set<Advertentie> getAdvertenties() {
        return advertenties;
    }

    /**
     * @param advertenties the advertenties to set
     */
    public void setAdvertenties(Set<Advertentie> advertenties) {
        this.advertenties = advertenties;
    }

    /**
     * @return the cat_id
     */
    public Long getCat_id() {
        return cat_id;
    }

    /**
     * @param cat_id the cat_id to set
     */
    public void setCat_id(Long cat_id) {
        this.cat_id = cat_id;
    }

}
