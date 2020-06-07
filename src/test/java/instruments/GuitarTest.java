package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar("Fender", "Kurt Cobain Signature Jaguar NOS", "Electric",1000.00, 1229.00);
    }

    @Test
    public void canGetBrand(){
        assertEquals("Fender", guitar.getBrand());
    }

    @Test
    public void canGetModel(){
        assertEquals("Kurt Cobain Signature Jaguar NOS", guitar.getModel());
    }

    @Test
    public void canGetType(){
        assertEquals("Electric", guitar.getType());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(1000.00, guitar.getBuyPrice(), 0.001);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(1229.00, guitar.getSellPrice(), 0.001);
    }
}
