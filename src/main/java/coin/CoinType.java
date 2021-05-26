package coin;

public enum CoinType {

    PENNY (0.01),
    TWOP (0.02),
    FIVEP (0.05),
    TENP (0.1),
    TWENTYP (0.2),
    FIFTYP (0.5),
    ONEPOUND (1),
    TWOPOUNDS (2);

    private final double value;

    CoinType(double value) {
        this.value = value;
    }
    public double getValue() {
        return value;
    }
}
