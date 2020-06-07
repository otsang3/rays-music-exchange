package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp(){
        piano = new Piano("Yamaha", "GC 1 M PE", "Grand Piano", 88, 11000.00, 14888.00);
    }

    @Test
    public void canGetBrand(){
        assertEquals("Yamaha", piano.getBrand());
    }

    @Test
    public void canGetModel(){
        assertEquals("GC 1 M PE", piano.getModel());
    }

    @Test
    public void canGetType(){
        assertEquals("Grand Piano", piano.getType());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(11000.00, piano.getBuyPrice(), 0.001);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(14888.00, piano.getSellPrice(), 0.001);
    }
}
