package RaysMusicExchange.Shop;

import RaysMusicExchange.Behaviours.ISell;

import java.util.ArrayList;

public class Stock {

    public String item;
    public int buyPrice;
    public int sellPrice;
    private ArrayList<ISell> stock;

    public Stock(String item, int buyPrice, int sellPrice){
        this.stock = new ArrayList<>();
        this.item = item;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
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
