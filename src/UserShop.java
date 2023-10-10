public class UserShop {
    private Item[] items;
    private int userMoney;

    public UserShop() {
        this.items = new Item[Items.values().length];
        int i = 0;
        for (Items item : Items.values()) {
            this.items[i] = new Item(item.name(), item.getPrice());
            i++;
        }
        this.userMoney = 4;
    }

    public void displayItems() {
        System.out.println("\n---------\nUSER SHOP\n---------");
        int i = 1;
        for (Item item : items) {
            System.out.println(i + " - " + item.getName() + " " + item.getPrice());
            i++;
        }
        System.out.println();
    }

    public void displayUserInventory() {
        System.out.println("\n--------------\nUSER INVENTORY\n--------------");
        for (Item item : items) {
            System.out.println(item.getName() + " " + item.getUserQuantity());
        }
        System.out.println();
    }

    public void displayItem(Item item) {
        System.out.println("\n-------------\nSELECTED ITEM\n-------------");
        System.out.println(item.getName() + " " + item.getUserQuantity());
        System.out.println();
    }

    public void displayUserMoney() {
        System.out.println("\n-----\nMONEY\n-----");
        System.out.println(this.userMoney);
        System.out.println();
    }

    // getter methods

    public Item[] getItems() {
        return this.items;
    }

    public int getUserMoney() {
        return this.userMoney;
    }

    // setter methods

    public void setUserMoney(int newUserMoney) {
        this.userMoney = newUserMoney;
    }
    
}
