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
public class SecretCode extends Security {
    public int code = 1234567890;
    
    @Override
    public int getCode() {
        return code;
    }
}
