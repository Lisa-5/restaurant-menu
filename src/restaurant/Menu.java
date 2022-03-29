package restaurant;

import java.util.ArrayList;

public class Menu {

    public static void main(String[] args) {

        ArrayList<MenuItem> menu = new ArrayList();
        menu.add(new MenuItem("Mozzarella Sticks", 9.00, "fried cheese", "appetizer", true));
        menu.add(new MenuItem("Mac & Cheese", 7.99, "pasta and cheesy sauce", "main course", true));
        menu.add(new MenuItem("Cheesecake", 12.50, "Cream Cheese delight", "dessert", true));

    }




}
