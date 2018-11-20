import kaijus.GiantIguana;
import kaijus.LochNessMonster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiantIguanaTest {

    GiantIguana dimetrodon;
    LochNessMonster nessie;

    @Before
    public void setUp(){
        dimetrodon = new GiantIguana("Dimetrodon",100,6);
        nessie = new LochNessMonster("Nessie",10,2);
    }

    @Test
    public void giantIguanaCanRoar(){
        assertEquals("mhhh",dimetrodon.roar());
    }

    @Test
    public void canRevealHealthValue(){
        assertEquals(100,dimetrodon.revealHealthValue());
    }

    @Test
    public void canBeDamaged(){
        nessie.attack(dimetrodon);
        assertEquals(98,dimetrodon.revealHealthValue());
    }

    @Test
    public void lochNessMonsterCanAttack(){
        dimetrodon.attack(nessie);
        assertEquals(4,nessie.revealHealthValue());
    }

    @Test
    public void canFly(){
        assertEquals("yuhuuuuuu",dimetrodon.fly());
    }

}
