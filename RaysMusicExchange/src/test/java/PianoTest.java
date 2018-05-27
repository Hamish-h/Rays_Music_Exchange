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
    public void canDeleteColour(){
        piano.setColour(null);
        assertEquals(null, piano.getColour());
    }

    @Test
    public void canChangeColour(){
        piano.setColour("White");
        assertEquals("White", piano.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("Upright", piano.getType());
    }

    @Test
    public void canChangeType(){
        piano.setType("Grand");
        assertEquals("Grand", piano.getType());
    }

    @Test
    public void hasItem(){
        assertEquals("Piano", piano.getItem());
    }

    @Test
    public void canChangeItem(){
        piano.setItem("Piano Frame");
        assertEquals("Piano Frame", piano.getItem());
    }


    @Test
    public void hasBuyPrice(){
        assertEquals(500, piano.getBuyPrice());
    }

    @Test
    public void canChangeBuyPrice(){
        piano.setBuyPrice(600);
        assertEquals(600, piano.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(750, piano.getSellPrice());
    }

    @Test
    public void canChangeSellPrice(){
        piano.setSellPrice(800);
        assertEquals(800, piano.getSellPrice());
    }
}

