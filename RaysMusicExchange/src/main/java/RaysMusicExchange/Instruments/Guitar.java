package RaysMusicExchange.Instruments;

public class Guitar extends Instrument {

    public Guitar(String colour, String type){
        super(colour, type);
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }
}
