import RaysMusicExchange.Shop.Stock;
import RaysMusicExchange.Instruments.Flute;
import RaysMusicExchange.Instruments.Guitar;
import RaysMusicExchange.Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StockTest {

    Stock stock;
    Flute flute;
    Guitar guitar;
    Piano piano;

    @Before
    public void before(){
        stock = new Stock("Piano", 200, 300);
    }

    @Test
    public void hasItem(){
        assertEquals("Piano", stock.getItem());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(200, stock.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(300, stock.getSellPrice());
    }

}
