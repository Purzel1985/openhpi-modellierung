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
public class ScanModule extends Security {
    private boolean scanModule;
    
    public ScanModule() {
        
    }
    
    @Override
    public boolean getScanModule() {
        return scanModule;
    }
    
    @Override
    public void setScanModule(boolean scanModule) {
        this.scanModule = scanModule;
    }
}
