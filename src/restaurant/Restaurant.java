package restaurant;

public class Restaurant {
    public static void main(String[] args) {

        Menu dessert = new Menu();
        Menu appetizer = new Menu();

        dessert.addMenuItem("Ice Cream", 5, "frozen cream", "dessert", false
        );
        dessert.addMenuItem("Souffle", 10, "decadent goodness", "dessert", true
        );

        dessert.printMenu();

    }
}
