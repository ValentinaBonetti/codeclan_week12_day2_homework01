package kaijus;

import behaviours.IDamage;

public class LochNessMonster extends Kaiju {

    public LochNessMonster(String name, Integer healthValue, Integer attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar() {
        return "Ssssshhhhhhhhhhhhh";
    }

    public String fly() {
        return "flap flap flap";
    }

    public void attack(IDamage damageable) {
        damageable.takeDamage(this.attackValue);
    }

    public void takeDamage(int damage) {
        this.healthValue -= damage;
    }

    public int revealHealthValue() {
        return this.healthValue;
    }
}
