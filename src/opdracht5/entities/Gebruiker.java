/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdracht5.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Nick
 */
@Entity
public class Gebruiker {

    
   
    private String voornaam;
    private String achternaam;
    
    @Id
    private String email;
    
    private String wachtwoord;

    public Gebruiker() {
    }

    public Gebruiker(String voornaam, String achternaam,
            String email, String wachtwoord) {
        this();
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.email = email;
        this.wachtwoord = wachtwoord;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

}
