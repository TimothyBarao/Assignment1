package edu.fsu.cs.cen5035;

/**
 *
 * @author Javier
 */
public class WeaponFactory {

    public static Weapon getWeapon(String type) {
        switch (type) {
            case "sword":
                return new Sword();
            case "spear":
            	return new Spear();
            case "simple hammer":
                return new SimpleHammer();
            case "crazy random sword":
                return new CrazyRandomSword();
            case "sword of fate":
                return new SwordOfFate();
            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }

}
