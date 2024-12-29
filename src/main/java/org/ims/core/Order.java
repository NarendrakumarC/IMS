package org.ims.core;

public class Order implements Comparable<Order>{
       private String orderID;
      private boolean isExpress; // normal order
        private int totalAmount;


       public Order(String orderID, boolean isExpress, int totalAmount) {
           this.orderID = orderID;
           this.isExpress = isExpress;
           this.totalAmount = totalAmount;
       }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }


    @Override
    public String toString() {
        return "Order{" +
                "orderID='" + orderID + '\'' +
                ", isExpress=" + isExpress +
                '}';
    }
    // We need to compare two orders
    // Order 1 Order 2
    // Order 1 should come first if it isExpress
    // if both are similar kind of orders then decide on the basis of orderId

    public int compareTo(Order other) {
           // this v/s other
        if(this.isExpress == other.isExpress){
            return this.orderID.compareTo(other.orderID);
        }else if(this.isExpress){
            return -1;
        }else {
            return 1;
        }
    }
}
