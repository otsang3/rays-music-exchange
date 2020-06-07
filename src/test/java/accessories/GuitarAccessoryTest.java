package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarAccessoryTest {

    GuitarAccessory guitarAccessory;

    @Before
    public void setUp(){
        guitarAccessory = new GuitarAccessory("Drum Sticks 5A", 3.99, 5.99);
    }

    @Test
    public void canGetName(){
        assertEquals("Drum Sticks 5A", guitarAccessory.getName());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(3.99, guitarAccessory.getBuyPrice(), 0.001);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(5.99, guitarAccessory.getSellPrice(), 0.001);
    }
}
