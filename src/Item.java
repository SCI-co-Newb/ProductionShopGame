public class Item {
    private String name;
    private int price;
    private int userQuantity;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
        this.userQuantity = 0;
    }

    // getter methods

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getUserQuantity() {
        return this.userQuantity;
    }

    // setter methods

    public void setName(String newName) {
        this.name = newName;
    }

    public void setPrice(int newPrice) {
        if (newPrice >= 0) {
            this.price = newPrice;
        }
    }

    public void setUserQuantity(int newUserQuantity) {
        if (newUserQuantity >= 0) {
            this.userQuantity = newUserQuantity;
        }
    }

    // increment/decrement user quantity

    public void incUserQuantity() {
        this.userQuantity++;
    }

    public void decUserQuantity() {
        if (this.userQuantity > 0) {
            this.userQuantity--;
        }
    }
    
}
