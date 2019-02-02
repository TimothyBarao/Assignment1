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
        Random damage = new Random();
        Random arm = new Random();
        return damage.nextInt(100) - arm.nextInt((int)(armor/3));
    }

}
