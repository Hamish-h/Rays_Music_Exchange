package RaysMusicExchange.Instruments;

import RaysMusicExchange.Behaviours.IPlay;

public class Flute extends Instrument {

    public Flute(String colour, String type){
        super(colour, type);
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }


}
