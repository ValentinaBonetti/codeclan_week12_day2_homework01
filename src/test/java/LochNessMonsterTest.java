import kaijus.GiantIguana;
import kaijus.LochNessMonster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LochNessMonsterTest {

    LochNessMonster nessie;
    GiantIguana dimetrodon;

    @Before
    public void setUp(){
        nessie = new LochNessMonster("Nessie",10,2);
        dimetrodon = new GiantIguana("Dimetrodon",100,6);
    }

    @Test
    public void lochNessMonsterCanRoar(){
        assertEquals("Ssssshhhhhhhhhhhhh",nessie.roar());
    }

    @Test
    public void canRevealHealthValue(){
        assertEquals(10,nessie.revealHealthValue());
    }

    @Test
    public void lochNessMonsterCanBeDamaged(){
        dimetrodon.attack(nessie);
        assertEquals(4,nessie.revealHealthValue());
    }

    @Test
    public void lochNessMonsterCanAttack(){
        nessie.attack(dimetrodon);
        assertEquals(98,dimetrodon.revealHealthValue());
    }

    @Test
    public void canFly(){
        assertEquals("flap flap flap",nessie.fly());
    }

}
