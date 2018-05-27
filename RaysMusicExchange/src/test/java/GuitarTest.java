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
    public void canDeleteColour(){
        guitar.setColour(null);
        assertEquals(null, guitar.getColour());
    }

    @Test
    public void canChangeColour(){
        guitar.setColour("White");
        assertEquals("White", guitar.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("Gibson", guitar.getType());
    }

    @Test
    public void canChangeType(){
        guitar.setType("Folk");
        assertEquals("Folk", guitar.getType());
    }

    @Test
    public void hasItem(){
        assertEquals("Guitar", guitar.getItem());
    }

    @Test
    public void canChangeItem(){
        guitar.setItem("Electric Guitar");
        assertEquals("Electric Guitar", guitar.getItem());
    }


    @Test
    public void hasBuyPrice(){
        assertEquals(500, guitar.getBuyPrice());
    }

    @Test
    public void canChangeBuyPrice(){
        guitar.setBuyPrice(600);
        assertEquals(600, guitar.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(750, guitar.getSellPrice());
    }

    @Test
    public void canChangeSellPrice(){
        guitar.setSellPrice(800);
        assertEquals(800, guitar.getSellPrice());
    }
}
