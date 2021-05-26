package product;

public class Kilt extends Product{

    private TartanType tartanType;

    public Kilt(String name, double price, TartanType tartanType) {
        super(name, price);
        this.tartanType = tartanType;
    }

    public TartanType getTartanType() {
        return tartanType;
    }
}
