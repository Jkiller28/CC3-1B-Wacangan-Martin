/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import static rpg.Character.dice;

/**
 *
 * @author m304user
 */
public class Killer extends Character {
      int maxMagic, currentMagic;
        public Dice die = new Dice();

    public Killer(String n, int s, int d, int i, int maxLife,int maxMagic){
        super(n,s,d,i,maxLife);
        this.maxMagic = maxMagic;
        this.currentMagic = maxMagic;
    }
    public int castLightningBolt(){
        if (currentMagic >= 0) {
            currentMagic-=500;
            return dice.roll()* super.getIntelligence();
        }else
        return 0;
    }
    public int castHeal(){
        if (currentMagic >= 0) {
            currentMagic-=50;
            return dice.roll()*super.getIntelligence();
        }else
        return 0;
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
