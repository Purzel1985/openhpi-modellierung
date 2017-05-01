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
    private boolean securityTest;
    private int code;
    private boolean camActive;
    private boolean scanModule;
    private int pacosCode;
    
    public boolean getSecurityTest() {
        return securityTest;
    }
    
    public void setSecurityTest(boolean securityTest) {
        this.securityTest = securityTest;
    }
    
    public int getCode() {
        return code;
    }
    
    public  boolean getCamActive() {
        return camActive;
    }
    
    public void setCamActive(boolean camActive) {
        this.camActive = camActive;
    }
    
    public boolean getScanModule() {
        return scanModule;
    }
    
    public void setScanModule(boolean scanModule) {
        this.scanModule = scanModule;
    }
    
    public int getPacosCode() {
        return pacosCode;
    }
}
