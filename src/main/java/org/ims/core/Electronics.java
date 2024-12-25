package org.ims.core;

public class Electronics extends Item{
    private int warranty;

    public Electronics(String itemName, double price, int quantity, int warranty) {
        super(itemName, price, quantity);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "Name='"+this.getItemName()+'\'' +
                "Price=" + this.getPrice() +
                "Quantity=" + this.getQuantity() +
                "warranty=" + warranty +
                '}';
    }
}
