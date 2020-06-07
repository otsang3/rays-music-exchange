package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;

    @Before
    public void setUp(){
        drums = new Drums("Millenium", "MX222BX Standard Set BK", "Acoustic Drums", 200.00, 218.00);
    }

    @Test
    public void canGetBrand(){
        assertEquals("Millenium", drums.getBrand());
    }

    @Test
    public void canGetModel(){
        assertEquals("MX222BX Standard Set BK", drums.getModel());
    }

    @Test
    public void canGetType(){
        assertEquals("Acoustic Drums", drums.getType());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(200.00, drums.getBuyPrice(), 0.001);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(218.00, drums.getSellPrice(), 0.001);
    }
}
