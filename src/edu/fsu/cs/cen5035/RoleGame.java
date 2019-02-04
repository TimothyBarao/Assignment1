package edu.fsu.cs.cen5035;

/**
 *
 * @author Javier
 */
public class RoleGame {

    public static void main(String[] args) {

    	int armor = 29, highArmor = 55, medArmor = 32;

        Weapon weapon = WeaponFactory.getWeapon("sword");
        System.out.println("Sword has " + weapon.hit() + " of damage.");
        System.out.println("Swords was able to do " + weapon.hit(armor) + " of damage due to an armor with "+armor+ " points.");

        weapon = WeaponFactory.getWeapon("spear");
        System.out.println("Spear has " + weapon.hit() + " of damage.");
        System.out.println("Spear was able to do " + weapon.hit(armor) + " of damage due to an armor with "+armor+ " points.");

        weapon = WeaponFactory.getWeapon("simple hammer");
        System.out.println("Simple hammer has " + weapon.hit() + " of damage.");
        System.out.println("Simple hammer was able to do " + weapon.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        System.out.println("Simple hammer was able to do " + weapon.hit(medArmor) + " of damage due to an armor with "+medArmor+ " points.");
        System.out.println("Simple hammer was able to do " + weapon.hit(highArmor) + " of damage due to an armor with "+highArmor+ " points.");

        weapon = WeaponFactory.getWeapon("crazy random sword");
        System.out.println("Crazy random sword has " + weapon.hit() + " of damage.");
        System.out.println("Crazy random sword was able to do " + weapon.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        System.out.println("Crazy random sword was able to do " + weapon.hit(medArmor) + " of damage due to an armor with "+medArmor+ " points.");
        System.out.println("Crazy random sword was able to do " + weapon.hit(highArmor) + " of damage due to an armor with "+highArmor+ " points.");

        weapon = WeaponFactory.getWeapon("sword of fate");
        System.out.println("Sword of fate has " + weapon.hit() + " of damage.");

        System.out.println("Sword of fate was able to do " + weapon.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        System.out.println("Sword of fate was able to do " + weapon.hit(medArmor) + " of damage due to an armor with "+medArmor+ " points.");
        System.out.println("Sword of fate was able to do " + weapon.hit(highArmor) + " of damage due to an armor with "+highArmor+ " points.");

        //TODO: Add the remaining weapons here

    }
}
