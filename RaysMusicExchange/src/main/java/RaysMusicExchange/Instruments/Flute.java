package RaysMusicExchange.Instruments;

import RaysMusicExchange.Behaviours.IPlay;

public class Flute extends Instrument implements IPlay{

    public Flute(String colour, String type){
        super(colour, type);
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    @Override
    public String outPutData(String data) {
        return playSound(data);
    }

    private String playSound(String data) {
        return playSound(data);
    }
}
