import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // shop.getItems()[Items.valueOf("DIRT").ordinal()].incUserQuantity(); [increases quantity of Dirt]
        Scanner myObj = new Scanner(System.in);
        UserShop shop = new UserShop();
        shop.displayItems();
        shop.displayUserInventory();
        shop.displayUserMoney();
        boolean contin = true;
        int input;
        while(contin) {
            System.out.println("Hello, please enter the number of the item you want to purchase, or 0 to stop.");
            input = myObj.nextInt();
            if (input == 0) {
                contin = false;
            } else if (input > shop.getItems().length) {
                System.out.println("\nPlease enter a valid number from the list.\n");
            } else {
                if (shop.getUserMoney() >= shop.getItems()[input-1].getPrice()) {
                    shop.setUserMoney(shop.getUserMoney()-shop.getItems()[input-1].getPrice());
                    shop.getItems()[input-1].incUserQuantity();
                    shop.displayUpdatedItem(shop.getItems()[input-1]);
                } else {
                    System.out.println("\nNot enough money");
                }
                shop.displayUserMoney();
            }
        }
        myObj.close();
    }
}
