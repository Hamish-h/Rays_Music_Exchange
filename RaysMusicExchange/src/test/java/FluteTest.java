import RaysMusicExchange.Instruments.Flute;
import RaysMusicExchange.Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void before(){
        flute = new Flute("Silver", "Treble" );
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
