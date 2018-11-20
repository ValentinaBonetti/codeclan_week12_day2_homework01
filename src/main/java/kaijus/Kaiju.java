package kaijus;

import behaviours.IAttack;
import behaviours.IDamage;

public abstract class Kaiju implements IDamage, IAttack {

// Parameters for each kaijus.Kaiju should include name, healthValue and attackValue.
// Give the kaijus.Kaiju a roar method which returns a string

    protected String name;
    protected Integer healthValue;
    protected Integer attackValue;

    public Kaiju(String name, Integer healthValue, Integer attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public abstract String roar();

    public abstract String fly();
}
