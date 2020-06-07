package instruments;

public class Piano extends Instrument {

    private int numberOfKeys;

    public Piano(String brand, String model, String type, int numberOfKeys, double buyPrice, double sellPrice) {
        super(brand, model, type, buyPrice, sellPrice);
        this.numberOfKeys = numberOfKeys;
    }
}
