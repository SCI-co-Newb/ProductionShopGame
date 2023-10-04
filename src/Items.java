public enum Items {
    DIRT(1),
    SAND(1),
    STONE(2),
    COAL(5),
    COPPER(10),
    SILVER(500),
    GOLD(10000),
    DIAMOND(100000),
    EMERALD(500000),
    PLATINUM(1000000);

    private int moneyRequired;

    private Items(int moneyRequired) {
        this.moneyRequired = moneyRequired;
    }

    public int getMoneyRequired() {
        return this.moneyRequired;
    }
}
