package RaysMusicExchange.Instruments;
import RaysMusicExchange.Shop.Stock;

public class Instrument extends Stock{

    public String colour;
    public String type;

    public Instrument(String colour, String type, String item, int buyPrice, int sellPrice){
        super(item, buyPrice, sellPrice);

        this.colour = colour;
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }


}




