package org.ims.core;

public class Clothing extends Item {
    private String size;

    public Clothing(String itemId, String itemName, double price, int quantity, String size) {
        super(itemId,itemName, price, quantity);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "Name='"+this.getItemName()+'\'' +
                "Price=" + this.getPrice() +
                "Quantity=" + this.getQuantity() +
                "size='" + size + '\'' +
                '}';
    }
}
