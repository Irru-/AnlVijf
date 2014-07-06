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
public class iDeal extends BetalingsGegevens {

    private int vervalMaand;
    private int vervalJaar;

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
}
