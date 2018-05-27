import RaysMusicExchange.Instruments.Flute;
import RaysMusicExchange.Instruments.Instrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void before(){
        flute = new Flute("Silver", "Treble", "Flute",50, 75);
    }

    @Test
    public void hasColour(){
        assertEquals("Silver", flute.getColour());
    }

    @Test
    public void canChangeColour(){
        flute.setColour("White");
        assertEquals("White", flute.getColour());
    }

    @Test
    public void canDeleteColour(){
        flute.setColour(null);
        assertEquals(null, flute.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("Treble", flute.getType());
    }

    @Test
    public void canChangeType(){
        flute.setType("Octave");
        assertEquals("Octave", flute.getType());
    }

    @Test
    public void hasItem(){
        assertEquals("Flute", flute.getItem());
    }

    @Test
    public void canChangeItem(){
        flute.setItem("Whistle");
        assertEquals("Whistle", flute.getItem());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(50, flute.getBuyPrice());
    }

    @Test
    public void canChangeBuyPrice(){
        flute.setBuyPrice(60);
        assertEquals(60, flute.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(75, flute.getSellPrice());
    }

    @Test
    public void canChangeSellPrice(){
        flute.setSellPrice(80);
        assertEquals(80, flute.getSellPrice());
    }

}
