package RaysMusicExchange.Instruments;

public class Piano extends Instrument {

    public Piano(String colour, String type){
        super(colour, type);
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }
}
