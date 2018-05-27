package RaysMusicExchange.Instruments;

import RaysMusicExchange.Behaviours.IPlay;

public class Flute extends Instrument {


//    public Flute(String colour, String type){
//        super(colour, type);
//    }


    public Flute(String colour, String type, String item, int buyPrice, int sellPrice) {
        super(colour, type, item, buyPrice, sellPrice);
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }


}
