package RaysMusicExchange.Instruments;

public class Piano extends Instrument {

//    public Piano(String colour, String type){
//        super(colour, type);
//    }

    public Piano(String colour, String type, String item, int buyPrice, int sellPrice) {
        super(colour, type, item, buyPrice, sellPrice);
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }
}
