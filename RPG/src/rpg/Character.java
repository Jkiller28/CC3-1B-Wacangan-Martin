/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

/**
 *
 * @author CC4-30
 */
public class Character {
        static Dice dice = new Dice();
    
    String name;
    int strength;
    int dexterity;
    int intelligence;
    int maxLife;
    int currentLife;
    
    public Character(String n, int s, int d, int i, int maxLife){
        this.name = n;
        this.strength = s;
        this.dexterity = d;
        this.intelligence = i;
        this.maxLife = maxLife;
        this.currentLife = maxLife;
    }
    
    public int attack(){
        return dice.roll() * strength;
    }
    
    public void wound(int damage) {
        currentLife = currentLife - damage;
            if (currentLife < 0) {
                currentLife = 0;
            }
    }
    
    
    
    public void heal(int heal) {
        heal = dice.roll();
        currentLife = currentLife + (heal + intelligence);
        if (currentLife > maxLife){
            currentLife = maxLife;
        }
    }
    
    public String getName(){
        return name;
    }
    
    public int getStrength(){
        return strength;
    }
    
    public int getDexterity(){
        return dexterity;
    }
    
    public int getIntelligence(){
        return intelligence;
    }
    
    public int getCurrentLife(){
        return currentLife;
    }
    
    public int getMaxLife(){
        return maxLife;
    }

}
