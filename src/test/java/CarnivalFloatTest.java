import kaijus.LochNessMonster;
import org.junit.Before;
import org.junit.Test;
import vehicles.CarnivalFloat;
import vehicles.Tank;

import static org.junit.Assert.assertEquals;

public class CarnivalFloatTest {

    CarnivalFloat carnivalFloat;
    LochNessMonster nessie;

    @Before
    public void setUp(){
        carnivalFloat = new CarnivalFloat("TrumpTrump",10000,1000);
        nessie = new LochNessMonster("Nessie",10,2);
    }

    @Test
    public void canRevealHealthValue(){
        assertEquals(10000,carnivalFloat.revealHealthValue());
    }

    @Test
    public void canBeDamaged(){
        nessie.attack(carnivalFloat);
        assertEquals(9998,carnivalFloat.revealHealthValue());
    }

    @Test
    public void canAttack(){
        carnivalFloat.attack(nessie);
        assertEquals(-990,nessie.revealHealthValue());
    }

}
