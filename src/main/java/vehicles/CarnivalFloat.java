package vehicles;

import behaviours.IDamage;

public class CarnivalFloat extends Vehicle {

    public CarnivalFloat(String type, Integer healthValue, Integer attackValue) {
        super(type, healthValue, attackValue);
    }

    public int revealHealthValue() {
        return this.healthValue;
    }


    public void attack(IDamage damageable) {
        damageable.takeDamage(this.attackValue);
    }

    public void takeDamage(int damage) {
        this.healthValue -= damage;
    }
}
