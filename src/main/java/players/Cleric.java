package players;

import compositions.HealingTools;
import compositions.PowerType;
import compositions.Armour;
import compositions.Weapon;
import parents.Physical;

import java.util.ArrayList;

public class Cleric extends Physical {
    //instance
    ArrayList<HealingTools> healingTools;

    //constructor
    public Cleric(String name, Weapon weapon, Armour armour) {
        super(name, weapon, armour);
        this.health = 12;
        this.backpack = new ArrayList<>();
        this.healingTools = new ArrayList<>();
        this.power = PowerType.DULLWEAPON;
    }
    //method
       // healing power

    public ArrayList getHealingTools () {
        return this.healingTools;
    }

}
