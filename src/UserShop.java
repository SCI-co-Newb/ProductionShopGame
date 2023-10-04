public class UserShop {
    private Item[] items;

    public UserShop() {
        this.items = new Item[Items.values().length];
        int i = 0;
        for (Items item : Items.values()) {
            this.items[i] = new Item(item.name(), item.getPrice());
            i++;
        }
    }

    public void displayItems() {
        System.out.println("\n---------\nUSER SHOP\n---------\n");
        for (Item item : items) {
            System.out.println(item.getName() + " " + item.getPrice());
        }
        System.out.println();
    }

    public void displayUserInventory() {
        System.out.println("\n--------------\nUSER INVENTORY\n--------------\n");
        for (Item item : items) {
            System.out.println(item.getName() + " " + item.getUserQuantity());
        }
        System.out.println();
    }
    
}
