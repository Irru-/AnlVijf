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
public class CreditCard extends BetalingsGegevens {

    @Id
    @GeneratedValue
    private Long id;
    private String bankNaam;
    
    @ManyToOne
    private Gebruiker gebruiker;

    public CreditCard() {
    }
    
    public CreditCard(String bankNaam){
        this.bankNaam = bankNaam;
    }

    /**
     * @return the bankNaam
     */
    public String getBankNaam() {
        return bankNaam;
    }

    /**
     * @param bankNaam the bankNaam to set
     */
    public void setBankNaam(String bankNaam) {
        this.bankNaam = bankNaam;
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
