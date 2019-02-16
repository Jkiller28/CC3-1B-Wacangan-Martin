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
class TestCharacter {
        Character armageddon = new Character("Ballyrrion", 30, 100, 100, 1000);
    Character albatross = new Character("Killer118", 30,100,100,1000);
    
    public void battle(){
        System.out.println(armageddon.name+": "+armageddon.maxLife);
        System.out.println(albatross.name+": "+albatross.maxLife);
        System.out.println();
        int i = 1;
        do {
            System.out.println("Round "+ i);
            int nepAttack = armageddon.attack();
            int nowaAttack = albatross.attack();
            albatross.wound(nepAttack);
            System.out.println(armageddon.name+" attacked "+albatross.name+" for "+nepAttack+" damage");
            System.out.println(albatross.name+"'s health is now: "+albatross.currentLife);
            if (albatross.currentLife > 0) {
                armageddon.wound(nowaAttack);
                System.out.println(albatross.name+" attacked "+armageddon.name+" for "+nowaAttack+" damage");
                System.out.println(armageddon.name+"'s health is now: "+armageddon.currentLife);
                if (armageddon.currentLife <= 0) {
                    System.out.println();
                    System.out.println(armageddon.name+" has died");
                    System.out.println(albatross.name+" wins!");
                }
            }else{
                System.out.println();
                System.out.println(albatross.name+" has died");
                System.out.println(armageddon.name+" wins!");
            }
            System.out.println();
            i++;
        } while (armageddon.currentLife > 0 & albatross.currentLife > 0);
    }
}
