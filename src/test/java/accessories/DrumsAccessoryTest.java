package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsAccessoryTest {

    DrumsAccessory drumsAccessory;

    @Before
    public void setUp(){
        drumsAccessory = new DrumsAccessory("12 Guitar Picks", 4.99, 9.99);
    }

    @Test
    public void canGetName(){
        assertEquals("12 Guitar Picks", drumsAccessory.getName());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(4.99, drumsAccessory.getBuyPrice(), 0.001);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(9.99, drumsAccessory.getSellPrice(), 0.001);
    }

}
