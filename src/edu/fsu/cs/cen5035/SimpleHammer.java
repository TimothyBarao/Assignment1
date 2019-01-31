package edu.fsu.cs.cen5035;

/**
 * @author Timothy
 */

public class SimpleHammer extends BasicWeapon implements Weapon {

    public SimpleHammer() {
        super(35);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        if (armor < 30) {
            return DAMAGE;
        }
        if(DAMAGE - armor < 0) {
            return 0;
        }
        return (DAMAGE - armor);
    }
}
