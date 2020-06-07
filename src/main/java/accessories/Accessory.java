package accessories;

import behaviours.ISell;

public abstract class Accessory implements ISell {

    private String name;
    private double buyPrice;
    private double sellPrice;

    public Accessory(String name, double buyPrice, double sellPrice) {
        this.name = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double calculateMarkUp(){
        return this.sellPrice - this.buyPrice;
    }
}
