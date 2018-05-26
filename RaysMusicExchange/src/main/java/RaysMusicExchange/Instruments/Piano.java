package RaysMusicExchange.Instruments;

public class Piano extends Instrument {

    public String getColour;

    public Piano(String colour, String type){
        super(colour, type);
    }

    public String getType() {
        return type;
    }
}
