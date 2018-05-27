import RaysMusicExchange.Accessories.Accessory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Accessory accessory;

    @Before
    public void before(){
        accessory = new Accessory("Guitar String", 5,10);
    }

    @Test
    public void hasItem(){
        assertEquals("Guitar String", accessory.getItem());
    }

    @Test
    public void canChangeItem(){
        accessory.setItem("Guitar String Pack (6)");
        assertEquals("Guitar String Pack (6)", accessory.getItem());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(5, accessory.getBuyPrice());
    }

    @Test
    public void canChangeBuyPrice(){
        accessory.setBuyPrice(6);
        assertEquals(6, accessory.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(10, accessory.getSellPrice());
    }

    @Test
    public void canChangeSellPrice(){
        accessory.setSellPrice(12);
        assertEquals(12, accessory.getSellPrice());
    }


}
