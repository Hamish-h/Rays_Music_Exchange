package RaysMusicExchange.Instruments;

import RaysMusicExchange.Behaviours.IPlay;

public class Flute extends Instrument {

    public Flute(String colour, String type, String item, int buyPrice, int sellPrice) {
        super(colour, type, item, buyPrice, sellPrice);
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public String getItem() {
        return item;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }


}
