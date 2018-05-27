import RaysMusicExchange.Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Red", "Gibson", "Guitar", 500, 750);
    }

    @Test
    public void hasColour(){
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("Gibson", guitar.getType());
    }

    @Test
    public void hasItem(){
        assertEquals("Guitar", guitar.getItem());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(500, guitar.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(750, guitar.getSellPrice());
    }
}
