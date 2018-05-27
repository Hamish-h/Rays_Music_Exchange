import RaysMusicExchange.Instruments.Flute;
import RaysMusicExchange.Instruments.Instrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void before(){
        flute = new Flute("Silver", "Treble", "Flute",50, 750);
    }

    @Test
    public void hasColour(){
        assertEquals("Silver", flute.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("Treble", flute.getType());
    }
    


}
