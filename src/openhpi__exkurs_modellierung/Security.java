/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openhpi__exkurs_modellierung;

/**
 *
 * @author christian
 */
public class Security {
    private int code;
    private boolean camActive;
    
    public int getCode() {
        return code;
    }
    
    public  boolean getCamActive() {
        return camActive;
    }
    
    public void setCamActive(boolean camActive) {
        this.camActive = camActive;
    }
}
