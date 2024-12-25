package org.ims.core;

public class Book extends Item {
    private String author;

    public Book(String itemName, double price, int quantity, String author) {
        super(itemName, price, quantity);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Name='"+this.getItemName()+'\'' +
                "Price=" + this.getPrice() +
                "Quantity=" + this.getQuantity() +
                "author='" + author + '\'' +
                '}';
    }
}
