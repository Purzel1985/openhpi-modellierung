/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openhpi__exkurs_modellierung;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author christian
 */
public class HidingPlace {
    public HidingPlace() {
        int secretCode = new SecretCode().getCode();
        //System.out.println(secretCode);
        Scanner scanner = new Scanner(System.in);
        String secretInputCode;
        String roomInputNumber;
        System.out.print("Bitte gib den Zugangscode ein, damit Du mein Versteck betreten kannst: ");
        secretInputCode = scanner.nextLine();
        if(!secretInputCode.isEmpty() && secretInputCode.matches("[0-9]+")) {
            if(Integer.parseInt(secretInputCode) == secretCode) {
                System.out.println("System offen, Du darfst passieren!");
                Room livingRoom = new Room("LivingRoom", "im Wohnzimmer.");
                Room kitchen = new Room("Kitchen", "in der Küche.");
                ArrayList<Room> rooms = new ArrayList<>();
                rooms.add(livingRoom);
                rooms.add(kitchen);

                System.out.println("In welchen Raum möchtest Du gehen? Da kannst Du hingehen: ");
                for(Room room : rooms) {
                    String roomName = (room).getRoom();
                    System.out.println(rooms.indexOf(room) + " -> " + roomName);
                }
                roomInputNumber = scanner.nextLine();
                System.out.println("EINGABE: " + roomInputNumber);
                System.out.print("Du bist jetzt ");
                if(roomInputNumber.equals("0")) {
                    System.out.println(livingRoom.getOutput());
                } else {
                    System.out.println(kitchen.getOutput());
                }
                
            } else {
                System.out.println("System bleibt verschlossen, falsche Zutritts-Kennung! Tut mir leid! *grins*");
            }
        } else {
            System.out.println("FEHLER");
        }
        
        //System.out.println("Ich gehe jetzt in den Raum " + new LivingRoom().getRoom() + "!");
        //System.out.println("Ich gehe danach in den Raum " + new SleepingRoom().getRoom() + "!");
    }
}
