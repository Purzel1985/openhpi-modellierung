/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openhpi__exkurs_modellierung;

import java.util.ArrayList;

/**
 *
 * @author christian
 */
public class Room {
    public Room(String room, String output) {
        setRoom(room, output);
    }
    
    private String room = "";
    private String output = "";
    
    public String getOutput() {
        return output;
    }
    
    public String getRoom() {
        return room;
    };
    
    public void setRoom(String room, String output) {
        this.room = room;
        this.output = output;
    }
}
