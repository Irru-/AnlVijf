/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdracht5.entities;

/**
 *
 * @author Nick
 */
public class CreditCard extends BetalingsGegevens {

    private String bankNaam;

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
}
