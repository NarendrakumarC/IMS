package org.ims.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory <T extends Item>{
    // it should be fast to access items using id
    HashMap<String,T> items;

    public Inventory(){
        items = new HashMap<>();
    }

    public void addItem(T item){
        items.put(item.getItemId(),item);
    }

    public void removeItem(T item){
        items.remove(item.getItemId());
    }

    public T getItem(T item){
        return items.get(item.getItemId());
    }

    public List<T> getAllItems(){
        return new ArrayList<>(items.values());
    }

    public int size(){
        return items.size();
    }

}
