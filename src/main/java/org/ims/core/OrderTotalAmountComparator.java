package org.ims.core;

import java.util.Comparator;

public class OrderTotalAmountComparator  implements Comparator<Order> {
    // If the Order value which has higher total amount, we want to process first

    public int compare(Order o1, Order o2) {
        // o1 to come first => return negative
        // o2 to come first => return positive
        if(o1.getTotalAmount() > o2.getTotalAmount()){
            return -1;
        }
        return 1;
    }
}
