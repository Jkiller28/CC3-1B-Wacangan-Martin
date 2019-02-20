/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

/**
 *
 * @author m304user
 */
public class Wizard extends Character {
      int maxMagic, currentMagic;
        public Dice die = new Dice();
    
    public Wizard(String n, int s, int d, int i, int maxMC){
       
        super(n, s, d, i, maxMC);
        this.maxMagic = maxMC;
        this.currentMagic = maxMC;
    }
    public int castLightningBolt(){
          int dmg = 0;
        if(currentMagic >= 5){
            currentMagic -=5;
            dmg = die.roll() + super.getIntelligence();
        }else{
            System.out.println(super.getName()+" had no mana left for Lightning bolt!");
            dmg = 0;
        }
        return dmg;
    }
    public int castHeal(){
        int heal = (dice.roll() + super.getIntelligence());
        if(currentMagic >= 8 && super.currentLife < super.maxLife){
            if(heal+super.getCurrentLife() > super.getMaxLife()){
                heal = super.getMaxLife()-super.getCurrentLife();
                System.out.println(super.getName()+" healed for "+heal);
                currentMagic-=8;
            }else{
                System.out.println(super.getName()+" healed for "+heal);
                currentMagic-=8;
                //Return heal as normal
            }   
        }else{
            System.out.println(super.getName()+" had no magic left to cast heal!");
            heal = 0;
        }
        return heal;
    }
    
    public void setMaxMagic(){
        
    }
    
    public int getMaxMagic(){
        return maxMagic;
    }
    
    public void setCurrentMagic(){
        
    }
    
    public int getCurrentMagic(){
        return currentMagic;
    }
}
