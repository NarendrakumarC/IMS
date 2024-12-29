package org.ims.core;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class RecentlyViewedItems {
    LinkedList<Item> recentlyViewedItems = new LinkedList<Item>();
    static int MAX_SIZE=3;
    public RecentlyViewedItems(){
        recentlyViewedItems = new LinkedList<>();
    }

    // Home work improve TC by using LinkedHashmap
    public LinkedList<Item> getRecentlyViewedItems(Item item){
        recentlyViewedItems.remove(item);
        recentlyViewedItems.addFirst(item);
        if(recentlyViewedItems.size()>MAX_SIZE){
            recentlyViewedItems.removeLast();
        }
        return recentlyViewedItems;
    }

    public void addRecentlyViewedItem(Item item){
        recentlyViewedItems.addFirst(item);
    }

    public void getAllRecentlyViewedItems() {
        for (Item item : recentlyViewedItems) {
            System.out.println(item.toString());
        }
    }
}
