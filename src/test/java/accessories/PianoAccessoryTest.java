package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoAccessoryTest {

    PianoAccessory pianoAccessory;

    @Before
    public void setUp(){
        pianoAccessory = new PianoAccessory("Yamaha Piano Bench", 45.00, 75.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Yamaha Piano Bench", pianoAccessory.getName());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(45.00, pianoAccessory.getBuyPrice(), 0.001);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(75.00, pianoAccessory.getSellPrice(), 0.001);
    }
}
