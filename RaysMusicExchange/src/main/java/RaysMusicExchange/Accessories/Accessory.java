package RaysMusicExchange.Accessories;

import RaysMusicExchange.Shop.Stock;

public class Accessory extends Stock {

    public Accessory(String item, int buyPrice, int sellPrice){
        super(item, buyPrice, sellPrice);
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
