package product;

public enum TartanType {

    MACDONALD ("blue, green"),
    MACKENZIE ("red, green");

    private final String colors;

    TartanType(String colors) {
        this.colors = colors;
    }

    public String getColors() {
        return colors;
    }
}
