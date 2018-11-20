import buildings.Skyscraper;
import org.junit.Before;
import org.junit.Test;
import vehicles.Tank;

import static org.junit.Assert.assertEquals;

public class SkyscraperTest {

    Skyscraper hilton;
    Tank tank;

    @Before
    public void setUp() {
        hilton = new Skyscraper(10000,"G1 2RX", 95.04);
        tank = new Tank("Military tank",1000,100);
    }

    @Test
    public void canRevealHeight(){
        assertEquals(95.04,hilton.revealHeight(),0.01);
    }

    @Test
    public void canRevealHealthValue() {
        assertEquals(10000,hilton.revealHealthValue());
    }

    @Test
    public void canGetDamaged() {
        tank.attack(hilton);
        assertEquals(9900,hilton.revealHealthValue());
    }

}
