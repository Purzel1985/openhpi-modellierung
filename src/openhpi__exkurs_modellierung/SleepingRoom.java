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
public class SleepingRoom extends Room {
    private String room = "Sleeping Room";

    public SleepingRoom(String room, String output) {
        super(room, output);
    }
    
    public void setRoom() {
        
    }
    
    @Override
    public String getRoom() {
        
        return room;
    }

    /**
     * @param room the room to set
     */
    public void setRoom(String room, String output) {
        this.room = room;
    }
}
