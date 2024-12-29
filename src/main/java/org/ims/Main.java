package org.ims;

import org.ims.core.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();

       /* items.add(new Book( "B1","Java Programming",99,5,"James Gosling"));
        items.add(new Electronics( "E1","Apple Mac Book",59000.0,12,15));
        items.add(new Clothing("C1","T shirt", 230, 7, "XL"));
        System.out.println(items.get(0).compareTo(items.get(1)));

        Collections.sort(items);
        System.out.println("Checking comparable sorting..");
        for (Item item : items) {
            System.out.println(item.getItemName());
        }

        // Inventory
        // different items
        // Inventory of electronics

        Inventory<Electronics> electronicsInventory = new Inventory<>();
        Inventory<Clothing> clothing = new Inventory<>();
        Inventory<Book> book = new Inventory<>();
        // it should not allow to create other type <T extends Item>
       // Inventory<Object> it = new Inventory<Object>();

        electronicsInventory.addItem(new Electronics("E2","Electric Fan",1400,3, 15));
        electronicsInventory.addItem(new Electronics("E3","TV", 12000,12,15));
        Electronics el1 = new  Electronics("E4","Mobile", 26000,4,15);
        electronicsInventory.addItem(el1);
      // Not allowing to create it cloth type
        //  electronicsInventory.addItem(new Clothing("Tshirt", 230, 7, "XL"));

        System.out.println(electronicsInventory.getAllItems());
        System.out.println(electronicsInventory.size());
        System.out.println(electronicsInventory.getItem(el1));
        electronicsInventory.removeItem(el1);
        System.out.println(electronicsInventory.getAllItems());

//        electronicsInventory.getItem()

        Inventory<Item> itemInventory = new Inventory<>();
        itemInventory.addItem(new Clothing("C2","Tshirt", 230, 7, "XL"));
        itemInventory.addItem(new Electronics("E5","TV", 12000,12,15));
        itemInventory.addItem(new Book("E6","Java Programming",99,5,"James Gosling"));

        System.out.println(itemInventory.getAllItems());*/

        RecentlyViewedItems recentlyViewedItems = new RecentlyViewedItems();
        recentlyViewedItems.addRecentlyViewedItem(new Book("B1","Java Programming",99,5,"James Gosling"));
        recentlyViewedItems.addRecentlyViewedItem(new Clothing("C1","Tshirt", 230, 7, "XL"));
        recentlyViewedItems.addRecentlyViewedItem(new Electronics("E1","Apple Mac Book",59000.0,12,15));
        recentlyViewedItems.addRecentlyViewedItem(new Electronics("E2","Charger", 1200,8,15));
        recentlyViewedItems.addRecentlyViewedItem(new Electronics("E3","TV", 12000,12,15));

        recentlyViewedItems.getAllRecentlyViewedItems();
        System.out.println("------------------------------------------------------");
        System.out.println(recentlyViewedItems.getRecentlyViewedItems(new Book("B1","Java Programming",99,5,"James Gosling")));

        // ExpressOrder  = true
        // RegularOrder  = false
        Order order1 = new Order("01",false,10);
        Order order2 = new Order("02",true, 60);
        Order order3 = new Order("03",false, 30);
        Order order4 = new Order("04",true, 40);

        OrderProcessor op = new OrderProcessor();
        op.addOrder(order1);
        op.addOrder(order2);
        op.addOrder(order3);
        op.addOrder(order4);
    // printing Express Order first
        op.printOrders();

        op.processOrder();
        System.out.println("------------------------------------");
        // Highest Priority Express Order is delivered
        op.printOrders();

        op.setComparator(new OrderTotalAmountComparator());
        System.out.println("-----------------ss-------------------");
       // op.processOrder();

        OrderProcessor op2 = new OrderProcessor();

        Order o1 = new Order("01",false,10);
        Order o2 = new Order("02",true, 60);
        Order o3 = new Order("03",false, 30);
        Order o4 = new Order("04",true, 40);
        op2.addOrder(o1);
        op2.addOrder(o2);
        op2.addOrder(o3);
        op2.addOrder(o4);
        while (op2.size()>0){
            Order order =op2.processOrder();
            System.out.println(order.getOrderID()+" "+order.getTotalAmount());
        }


    }
}