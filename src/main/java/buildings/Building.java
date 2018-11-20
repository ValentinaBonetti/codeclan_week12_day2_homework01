package buildings;

import behaviours.IDamage;

public abstract class Building implements IDamage {

    protected Integer healthValue;
    protected String postcode;

    public Building(Integer healthValue, String postcode) {
        this.healthValue = healthValue;
        this.postcode = postcode;
    }
}
