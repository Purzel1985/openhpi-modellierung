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
public class Cam extends Security {
    private boolean camActive;
    
    public Cam() {
        
    }
    
    public void test() {
        if(camActive == true) {
            System.out.println("Du wirst beobachtet!");
        } else {
            System.out.println("x");
        }
    }
    
    @Override
    public boolean getCamActive() {
        return camActive;
    }
    
    @Override
    public void setCamActive(boolean camActive) {
        this.camActive = camActive;
    }
}
