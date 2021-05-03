import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class WaterBottleTest {

    WaterBottle bottle;

    @Before
    public void before() {
        bottle = new WaterBottle(100, 100);
    }

    @Test
    public void hasVolume() {
        assertEquals(100, bottle.getVolume(), 0.01);
    }

    @Test
    public void canReduceVolume() {
        bottle.drink(10);
        assertEquals(90, bottle.getVolume(), 0.01);
    }

    @Test
    public void canEmpty() {
        bottle.empty();
        assertEquals(0, bottle.getVolume(), 0.01);
    }

    @Test
    public void canRefill() {
        bottle.drink(20);
        bottle.refill();
        assertEquals(100, bottle.getVolume(), 0.01);
    }

}
