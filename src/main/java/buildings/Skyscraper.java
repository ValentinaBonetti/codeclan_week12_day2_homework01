package buildings;

import behaviours.IDamage;

public class Skyscraper extends Building implements IDamage {

    private Double height;

    public Skyscraper(Integer healthValue, String postcode, Double height) {
        super(healthValue, postcode);
        this.height = height;
    }

    public int revealHealthValue() {
        return this.healthValue;
    }

    public void takeDamage(int damage) {
        this.healthValue -= damage;
    }

    public double revealHeight() {
        return this.height;
    }

}
