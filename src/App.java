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
        int select;
        while(contin) {
            System.out.println("Hello, please enter the number of the item you want to purchase or sell, or 0 to stop.");
            input = myObj.nextInt();
            if (input == 0) {
                contin = false;
            } else if (input > shop.getItems().length) {
                System.out.println("\nPlease enter a valid number from the list.\n");
            } else {
                shop.displayItem(shop.getItems()[input-1]);
                shop.displayUserMoney();
                if (shop.getItems()[input-1].getUserQuantity() == 0 && shop.getUserMoney() < shop.getItems()[input-1].getPrice()) {
                    System.out.println("Unfortunately, you do not have enough money to buy or the quatity to sell.");
                    continue;
                } else if (shop.getItems()[input-1].getUserQuantity() == 0) {
                    System.out.println("You have no quantity to sell, do you want to buy the item? (1 to buy, any other number to exit)");
                    select = myObj.nextInt();
                    if (select != 1) {
                        continue;
                    }
                } else if (shop.getUserMoney() < shop.getItems()[input-1].getPrice()) {
                    System.out.println("You do not have enough money to buy the item, do you want to sell your quantity of the item? (2 to sell, any other number to exit)");
                    select = myObj.nextInt();
                    if (select != 2) {
                        continue;
                    }
                } else {
                    System.out.println("You can either buy or sell this item, 1 to buy, 2 to sell, anything else is to exit.");
                    select = myObj.nextInt();
                    if (select != 1 && select != 2) {
                        continue;
                    }
                }
                if (select == 1) {
                    shop.setUserMoney(shop.getUserMoney()-shop.getItems()[input-1].getPrice());
                    shop.getItems()[input-1].incUserQuantity();
                } else {
                    shop.setUserMoney(shop.getUserMoney()+shop.getItems()[input-1].getPrice());
                    shop.getItems()[input-1].decUserQuantity();
                }
                shop.displayItem(shop.getItems()[input-1]);
                shop.displayUserMoney();
            }
        }
        myObj.close();
    }
}
