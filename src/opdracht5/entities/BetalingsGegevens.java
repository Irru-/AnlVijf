/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdracht5.entities;

import javax.persistence.MappedSuperclass;

/**
 *
 * @author Nick
 */
@MappedSuperclass
public abstract class BetalingsGegevens {

    private String eigenaarNaam;
    private String nummer;

    public BetalingsGegevens() {
    }

    public BetalingsGegevens(String naam, String nummer) {
        this();
        this.eigenaarNaam = naam;
        this.nummer = nummer;
    }

    /**
     * @return the eigenaarNaam
     */
    public String getEigenaarNaam() {
        return eigenaarNaam;
    }

    /**
     * @param eigenaarNaam the eigenaarNaam to set
     */
    public void setEigenaarNaam(String eigenaarNaam) {
        this.eigenaarNaam = eigenaarNaam;
    }

    /**
     * @return the nummer
     */
    public String getNummer() {
        return nummer;
    }

    /**
     * @param nummer the nummer to set
     */
    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

}
