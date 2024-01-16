/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playergame;

/**
 *
 * @author SMK TELKOM 21
 */
public class player {
  
    //atribut
     //atribut
    String name;
    int speed,healthPoin,damage,armor;
    
    //method
    void run(){
        System.out.println(name+" is Running....");
        System.out.println("Speed" + speed);
    }
    
    void attack(){
        System.out.println(name+" is Attacking...");
        System.out.println("Attack" + damage );
    }
    
    void defend(){
        System.out.println(name+" is Defending....");
        System.out.println("Defend" + armor);
    }
    
    boolean isDead(){
        if (healthPoin<=0) return true;
            return false;
        }
}
