package kaijus;

import behaviours.IAttack;
import behaviours.IDamage;

public class GiantIguana extends Kaiju implements IAttack, IDamage {

    public GiantIguana(String name, Integer healthValue, Integer attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar() {
        return "mhhh";
    }

    public String fly() {
        return "yuhuuuuuu";
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
