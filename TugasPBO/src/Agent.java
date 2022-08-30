/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Agent {

    private int health;
    private String name;
    private int pos_x;
    private int pos_y;

    public Agent() {
    }

    public Agent(String name, int health) {
        this.name = name;
        this.health = health;
        
        
        
    }

    public void SetPos(int x, int y) {

    }

    public int GetPos() {

        return 0;

    }

    public void info() {
        System.out.println("nama :" +name);
        System.out.println("health" +health);
    }

}
