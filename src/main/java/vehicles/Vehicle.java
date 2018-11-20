package vehicles;

import behaviours.IAttack;
import behaviours.IDamage;

public abstract class Vehicle implements IAttack, IDamage {

    protected String type;
    protected Integer healthValue;
    protected Integer attackValue;

    public Vehicle(String type, Integer healthValue, Integer attackValue) {
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }


    public abstract int revealHealthValue();
}
