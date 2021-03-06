package enemies;

import behaviours.IFight;
import compositions.Armour;
import compositions.PowerType;
import compositions.Weapon;
import parents.Enemy;
import parents.Person;

public class Ogre extends Enemy {
    protected Armour armour;
    protected Weapon weapon;


    //constructor
    public Ogre(String name, Armour armour, Weapon weapon) {
        super(name);
        this.armour = armour;
        this.weapon = weapon;
        this.health = 14;
        this.power = PowerType.SPELLRESISTANCE;
    }

    public Armour getArmour() {
        return this.armour;
    }

    public String getArmourName() {
        return this.armour.getName();
    }

    public int getArmourValue() {
        return this.armour.getValue();
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public String getWeaponName () {
        return this.weapon.getName();
    }

    public int getWeaponValue() {
        return this.weapon.getValue();
    }

    public void fight(Person person){
        person.reduceHealth(this.getWeaponValue());
    }


    public void reduceHealthSpell(int damage) {
        this.health -= (damage * this.power.getPowerModifier());
    }


}
