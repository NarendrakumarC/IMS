package org.ims.core;

public class Item implements Comparable<Item> {
    private  int itemId =0;
    private String itemName;
    private double price;
    private int quantity;



    public Item(String itemName, double price, int quantity) {
        this.itemId = generateItemId();
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    private int generateItemId(){
        return this.itemId++;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }


    @Override
    public int compareTo(Item other) {
        return this.itemName.compareTo(other.itemName);
    }
}
