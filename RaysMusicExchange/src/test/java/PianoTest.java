import RaysMusicExchange.Instruments.Piano;
        import org.junit.Before;
        import org.junit.Test;

        import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Black", "Upright" );
    }

    @Test
    public void hasColour(){
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("Upright", piano.getType());
    }
}
