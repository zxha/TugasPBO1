/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        Agent cobaagent = new Agent ();
        
        Agent cobaagent1 = new Agent("Budi",10) ;
        
        Player cobaplayer = new Player ();
        
        Player cobaplayer1 = new Player (10,10);
        
        cobaagent.info();
        cobaagent1.info();
        
        cobaplayer.InfoPlayer();
        cobaplayer1.InfoPlayer();
    }
    
    
    
}
