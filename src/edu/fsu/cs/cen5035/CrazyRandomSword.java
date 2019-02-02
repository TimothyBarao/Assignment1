package edu.fsu.cs.cen5035;

import java.util.Random;

/**
  * @author Timothy Barao
  */
public class CrazyRandomSword extends BasicWeapon implements Weapon {
    public CrazyRandomSword() {
        super(0);
    }

    @Override
    public int hit() {
        Random damage = new Random();
        return damage.nextInt(100);
    }

    @Override
    public int hit(int armor) {
        Random dam = new Random();
        Random arm = new Random();

        int damage = (dam.nextInt(96) + 4);
        int newArmor = armor - (arm.nextInt((int)((armor-3)/3)) + 3);

        if(damage - newArmor < 0) {
            return 0;
        }
        return(damage - newArmor);
    }

}
