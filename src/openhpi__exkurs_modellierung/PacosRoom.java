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
public class PacosRoom extends Security {
    private final int pacosCode = 5577990;
    private boolean securityTest;
    
    public PacosRoom() {
        
    }
    
    @Override
    public int getPacosCode() {
        return pacosCode;
    }
    
    public void Paco() {
//        System.out.println(securityTest);
        if(securityTest == true) {
            System.out.println("Juhu, Paco ist wieder frei!");
        } else {
            new Trap().openTrap();
        }
    }
    
    @Override
    public boolean getSecurityTest() {
        return securityTest;
    }
    
    @Override
    public void setSecurityTest(boolean securityTest) {
        this.securityTest = securityTest;
    }
}
