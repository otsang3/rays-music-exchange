import accessories.PianoAccessory;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    PianoAccessory pianoAccessory;
    Piano piano;
    Shop shop;

    @Before
    public void setUp(){
        shop = new Shop("My Music Shop");
        pianoAccessory = new PianoAccessory("Yamaha Piano Bench", 45.00, 75.00);
        piano = new Piano("Yamaha", "GC 1 M PE", "Grand Piano", 11000.00, 14888.00);
    }

    @Test
    public void canGetName(){
        assertEquals("My Music Shop", shop.getName());
    }

    @Test
    public void canAddAccessoryToStock(){
        shop.addItemToStock(pianoAccessory);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canAddInstrumentToStock(){
        shop.addItemToStock(piano);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveAccessoryFromStock(){
        shop.addItemToStock(pianoAccessory);
        shop.removeItemFromStock(pianoAccessory);
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canRemoveInstrumentFromStock(){
        shop.addItemToStock(piano);
        shop.removeItemFromStock(piano);
        assertEquals(0, shop.getStock().size());
    }


}
