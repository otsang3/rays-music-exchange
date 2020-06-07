import accessories.PianoAccessory;
import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;
    private String name;

    public Shop(String name){
        this.stock = new ArrayList<ISell>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public void addItemToStock(ISell item){
        this.stock.add(item);
    }

    public void removeItemFromStock(ISell item) {
        this.stock.remove(item);
    }
}
