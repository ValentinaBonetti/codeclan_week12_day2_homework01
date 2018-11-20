import kaijus.GiantIguana;
import kaijus.LochNessMonster;
import org.junit.Before;
import org.junit.Test;
import vehicles.Tank;

import static org.junit.Assert.assertEquals;

public class TankTest {

    Tank tank;
    LochNessMonster nessie;

    @Before
    public void setUp(){
        tank = new Tank("Military tank",1000,100);
        nessie = new LochNessMonster("Nessie",10,2);
    }

    @Test
    public void canRevealHealthValue(){
        assertEquals(1000,tank.revealHealthValue());
    }

    @Test
    public void canBeDamaged(){
        nessie.attack(tank);
        assertEquals(998,tank.revealHealthValue());
    }

    @Test
    public void canAttack(){
        tank.attack(nessie);
        assertEquals(-90,nessie.revealHealthValue());
    }

}
