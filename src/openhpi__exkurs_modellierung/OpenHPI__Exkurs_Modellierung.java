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
public class OpenHPI__Exkurs_Modellierung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int secretCode = new SecretCode().getCode();
        //System.out.println(secretCode);
        Scanner scanner = new Scanner(System.in);
        String secretInputCode;
        System.out.println("Bitte gib den Zugangscode ein, damit Du mein Versteck betreten kannst:");
        secretInputCode = scanner.nextLine();
        if(!secretInputCode.isEmpty() && secretInputCode.matches("[0-9]+")) {
            if(Integer.parseInt(secretInputCode) == secretCode) {
                System.out.println("System offen, Du darfst passieren!");
                Room livingRoom = new Room("LivingRoom");
                Room kitchen = new Room("Kitchen");
                ArrayList<Room> rooms = new ArrayList<>();
                rooms.add(livingRoom);
                rooms.add(kitchen);

                rooms.stream().map((room) -> (room).getRoom()).forEachOrdered((roomName) -> {
                    System.out.println(roomName);
                });
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
