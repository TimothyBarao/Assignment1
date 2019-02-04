package edu.fsu.cs.cen5035;

import java.util.Random;

/**
 * @author Timothy
 * This weapon rolls a six sided die, the higher the role, the better it performs.
 */

public class  SwordOfFate extends BasicWeapon implements Weapon {

    public SwordOfFate(){
        super(0);
    }

    @Override
    public int hit() {
        Random damage = new Random();
        return (damage.nextInt(6)+1)*3;
    }

    @Override
    public int hit(int armor) {
        Random dam = new Random();
        int roll = dam.nextInt(6)+1;
        int damage = roll*3;
        int newDamage = 0;

        if(roll == 1) {
            newDamage = ((int)(damage/2) - (armor*2));
        }
        if(roll == 2) {
            newDamage = ((int)(damage/2) - (armor));
        }
        if(roll == 3) {
            newDamage = (damage - armor) * (-1);
        }
        if(roll == 4) {
            newDamage = (damage*damage) - (armor*armor);
        }
        if(roll == 5) {
            newDamage = ((damage*3) - armor);
        }
        if(roll == 6) {
            newDamage = ((damage*3) - (int)(armor/2));
        }

        if (newDamage < 0) {
            return 0;
        }
        return newDamage;
    }


}
