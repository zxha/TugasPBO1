/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Player {
    private int direction;
    private int id;
    private int strength;
    
    public Player(){
        
    }
    public Player(int id, int direction){
        this.id = id;
        this.direction = direction ;
        
        
    }
    public void AddStrength (int str){
        
    }
    public void InfoPlayer (){
        System.out.println("Player id" +id);
        System.out.println("direction" +direction);
    }
    
}
