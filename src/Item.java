public class Item {
    private String name;
    private int moneyRequired;
    private int userQuantity;

    public Item(String name, int moneyRequired) {
        this.name = name;
        this.moneyRequired = moneyRequired;
        this.userQuantity = 0;
    }

    // getter methods

    public String getName() {
        return this.name;
    }

    public int getMoneyRequired() {
        return this.moneyRequired;
    }

    public int getUserQuantity() {
        return this.userQuantity;
    }

    // setter methods

    public void setName(String newName) {
        this.name = newName;
    }

    public void setMoneyRequired(int newMoneyRequired) {
        if (newMoneyRequired >= 0) {
            this.moneyRequired = newMoneyRequired;
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
