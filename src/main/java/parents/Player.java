package parents;

import compositions.PowerType;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Player extends Person {
    //instance

    protected ArrayList<Tokens> backpack;

    //constructor
    public Player(String name) {
        super(name);
    }

    //method

    public ArrayList<Tokens> getBackpack() {
        return this.backpack;
    }

    public void increaseHealth(int healValue) {
        this.health += healValue;
    }

    //take damage
}
