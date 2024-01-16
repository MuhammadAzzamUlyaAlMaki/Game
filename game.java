/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package playergame;

/**
 *
 * @author SMK TELKOM 21
 */
public class game {

    public static void main(String[] args) {
        //membuat objek
        player superpowers = new player();
        player enemy       = new player();
        
        superpowers.name = "man";
        superpowers.speed = 20;
        superpowers.healthPoin = 1000;
        superpowers.damage = 23;
        superpowers.armor = 30;
        
        enemy.name = "woman";
        enemy.speed = 20;
        enemy.healthPoin = 100;
        enemy.damage = 23;
        enemy.armor = 30;
        
        
        
        
        //menjalankan method
        superpowers.run();
        superpowers.attack();
        superpowers.defend();
        enemy.run();
        enemy.attack();
        enemy.defend();
        
        if (superpowers.isDead()) {
            System.out.println("WOMAN WIN ");
            
            if (enemy.isDead()) {
                System.out.println("MAN WIN");
                
            }
            
          
            
        }
        
    }
}