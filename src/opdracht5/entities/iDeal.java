/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdracht5.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Nick
 */
@Entity
public class iDeal extends BetalingsGegevens {

    @Id
    @GeneratedValue
    private Long id;
    private int vervalMaand;
    private int vervalJaar;
    
    @ManyToOne
    private Gebruiker gebruiker;

    public iDeal() {
    }
    
    public iDeal(int vervalMaand, int vervalJaar){
        this();
        this.vervalJaar = vervalJaar;
        this.vervalMaand = vervalMaand;
    }

    /**
     * @return the vervalMaand
     */
    public int getVervalMaand() {
        return vervalMaand;
    }

    /**
     * @param vervalMaand the vervalMaand to set
     */
    public void setVervalMaand(int vervalMaand) {
        this.vervalMaand = vervalMaand;
    }

    /**
     * @return the vervalJaar
     */
    public int getVervalJaar() {
        return vervalJaar;
    }

    /**
     * @param vervalJaar the vervalJaar to set
     */
    public void setVervalJaar(int vervalJaar) {
        this.vervalJaar = vervalJaar;
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
