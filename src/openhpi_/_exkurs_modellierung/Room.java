/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openhpi_._exkurs_modellierung;

import java.util.ArrayList;

/**
 *
 * @author christian
 */
public class Room {
    public Room(String room) {
        setRoom(room);
    }
    
    private String room = "";
    
    public String getRoom() {
        return room;
    };

    public void setRoom(String room) {
        this.room = room;
    }
}
