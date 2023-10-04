public enum Items {
    DIRT(1),
    SAND(1),
    WOOD(2),
    STONE(2),
    COAL(5),
    COPPER(10),
    SILVER(500),
    GOLD(10000),
    DIAMOND(100000),
    EMERALD(500000),
    PLATINUM(1000000),
    ROPE(4),
    CLOCK(100),
    TOOTHPICK(3),
    FEATHER(5),
    TOWEL(20),
    TOMATO(3),
    MIRROR(50),
    DAGGER(300),
    BRUSH(15);

    private int price;

    private Items(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}
