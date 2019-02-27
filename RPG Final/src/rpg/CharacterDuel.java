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
class CharacterDuel {
    Killer armageddon = new Killer("Bakugo", 40, 150, 160, 1000,1500);
    Wizard albatross = new Wizard("Natsu", 40,150,160,1000,1500);
   Dice die = new Dice();
    
    public void battle(){
        System.out.println(armageddon.name+": "+armageddon.maxLife);
        System.out.println(albatross.name+": "+albatross.maxLife);
        System.out.println();
        int i = 1;
        do {
            System.out.println("Round "+ i);
            int nepAttack = armageddon.attack();
            int nepWeap = armageddon.castLightningBolt();
            int nepheal = armageddon.castHeal();
            int nowaAttack = albatross.attack();
            int nowMagi = albatross.castLightningBolt();
            int nowheal = albatross.castHeal();
            albatross.wound(nepAttack);
            System.out.println(armageddon.name+" attacked "+albatross.name+" for "+nepAttack+" damage");
            System.out.println(albatross.name+"'s health is now: "+albatross.currentLife);
            albatross.heal(nowheal);
            System.out.println(albatross.name+" casted healing circle. "+albatross.name+"'s health is now: "+albatross.currentLife);
            albatross.wound(nepWeap);
            System.out.println(armageddon.name+" used A.P. shot against "+albatross.name+" for "+nepWeap+" damage ");
            System.out.println(albatross.name+"'s health is now: "+albatross.currentLife);
            
            if (albatross.currentLife > 0) {
                armageddon.wound(nowaAttack);
                System.out.println(albatross.name+" attacked "+armageddon.name+" for "+nowaAttack+" damage");
                System.out.println(armageddon.name+"'s health is now: "+armageddon.currentLife);
                armageddon.heal(nepheal);
                System.out.println(armageddon.name+" used medkit. "+armageddon.name+" 's health is now: "+armageddon.currentLife);
                armageddon.wound(nowMagi);
                System.out.println(albatross.name+" casted roar of the fire dragon against "+armageddon.name+" for "+nowMagi+" damage ");
                System.out.println(armageddon.name+"'s health is now: "+armageddon.currentLife);
                if (armageddon.currentLife <= 0) {
                    System.out.println();
                    System.out.println(armageddon.name+" has died");
                    System.out.println(albatross.name+" wins!");
                }
            }
            if (albatross.currentLife <=0){
                System.out.println();
                System.out.println(albatross.name+" has died");
                System.out.println(armageddon.name+" wins!");
            }
            System.out.println();
            i++;
        } while (armageddon.currentLife > 0 & albatross.currentLife > 0);
    }
}
