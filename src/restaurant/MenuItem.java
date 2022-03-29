package restaurant;

import java.util.Date;

public class MenuItem {

    private String itemName;
    private double price;
    private String description;
    private String category;
    private boolean newItem;
    private Date createdAt;

    public MenuItem(String itemName, double price, String description, String category, boolean newItem){
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
        this.createdAt = new Date();
    }

    public String getItemName(){
        return itemName;
    }

    public void setItemName(String aItemName) {
        itemName = aItemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double aPrice) {
        this.price = aPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String aCategory) {
        this.category = aCategory;
    }

    public boolean isNewItem() {
        return newItem;
    }

    public void setNewItem(boolean aNewItem) {
        this.newItem = aNewItem;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date aCreatedAt) {
        this.createdAt = aCreatedAt;
    }

}
