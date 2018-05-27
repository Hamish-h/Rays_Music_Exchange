import RaysMusicExchange.Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Black", "Upright", "Piano", 500, 750);
    }

    @Test
    public void hasColour(){
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("Upright", piano.getType());
    }

    @Test
    public void hasItem(){
        assertEquals("Piano", piano.getItem());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(500, piano.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(750, piano.getSellPrice());
    }

}

