package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String brand;
    private String model;
    private String type;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String brand, String model, String type, double buyPrice, double sellPrice) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public void setBuyPrice(double price) {
        this.buyPrice = price;
    }

    public void setSellPrice(double price) {
        this.sellPrice = price;
    }

    public double calculateMarkUp(){
        return this.sellPrice - this.buyPrice;
    }

}
