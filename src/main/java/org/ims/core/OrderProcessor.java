package org.ims.core;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class OrderProcessor {
    PriorityQueue<Order> pq;
    public OrderProcessor() {
        pq = new PriorityQueue<>();
    }

    public void addOrder(Order order) {
        pq.offer(order);
    }

    public Order processOrder(){
        return pq.poll();
    }

    public int size(){
        return pq.size();
    }

    // Just for understanding not to implement here
    public void printOrders(){
         Iterator<Order> it = pq.iterator();
         while(it.hasNext()){
             Order order = it.next();
             System.out.println(order.toString());
         }
    }
    public void setComparator(Comparator<Order> comp){
        pq = new PriorityQueue<>(comp);
    }

}
