package RaysMusicExchange.Instruments;

public class Piano extends Instrument {

    public Piano(String colour, String type, String item, int buyPrice, int sellPrice) {
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

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }
}
