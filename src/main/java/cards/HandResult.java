package cards;

public enum HandResult {
    ROYAL_FLUSH("royal flush"),
    QUAD("quad"),
    FLUSH("flush"),
    STRAIGHT("straight"),
    SET("set"),
    TWO_PAIRS("two pairs"),
    PAIR("pair"),
    HIGH_CARD("high card");

    private String name;

    HandResult(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
