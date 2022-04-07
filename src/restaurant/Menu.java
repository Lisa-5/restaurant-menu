package restaurant;

import java.util.ArrayList;
import java.util.Date;


public class Menu {



    private Date lastUpdated = new Date();
    private ArrayList<MenuItem> menu = new ArrayList();

    public void addMenuItem(String itemName, double price, String description, String category, Boolean newItem){
        this.menu.add(new MenuItem(itemName, price, description, category, newItem));
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }



    public void removeMenuItem(String itemName){
        if(menu.contains(itemName)){
            this.menu.remove(itemName);
        }
    }

    public void printMenu() {
        System.out.println();
        System.out.println(lastUpdated);

        for (int i = 0; i < menu.size(); i++) {
            MenuItem eachItem = menu.get(i);

            System.out.println("--------");
            if(eachItem.isNewItem()) {
                System.out.println("*** NEW ITEM ***");
            }

            System.out.println(eachItem.getItemName());
            System.out.println(eachItem.getDescription());
            System.out.println(eachItem.getPrice());
            System.out.println();
        }

        public void printItem(String itemName){
            if (menu.contains(itemName)) {

            }

        }
   }

}
