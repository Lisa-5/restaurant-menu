package restaurant;

import java.util.Date;
import java.util.HashMap;

public class MenuItem {

    //getters
    public String getItemName(){
        return itemName;
    }
    public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public String getCategory() {
        return category;
    }
    public boolean isNewItem() {
        return newItem;
    }
    public Date getDateCreated() {
        return dateCreated;
    }

    //setters
    public void setItemName(String aItemName) {
        itemName = aItemName;
    }
    public void setPrice(double aPrice) {
        this.price = aPrice;
    }
    public void setDescription(String aDescription) {
        this.description = aDescription;
    }
    public void setCategory(String aCategory) {
        this.category = aCategory;
    }
    public void setNewItem(boolean aNewItem) {
        this.newItem = aNewItem;
    }
    public void setDateCreated(Date dateCreated) {this.dateCreated = dateCreated;}

    //fields
    private String itemName;
    private double price;
    private String description;
    private String category;
    private boolean newItem;
    private Date dateCreated;
    private Date currentDate = new Date();

    //constructor
    public MenuItem(String itemName, double price, String description, String category, boolean newItem){
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
        this.dateCreated = new Date();
    }


}
