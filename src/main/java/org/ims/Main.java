package org.ims;

import org.ims.core.Book;
import org.ims.core.Clothing;
import org.ims.core.Electronics;
import org.ims.core.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();

        items.add(new Book("Java Programming",99,5,"James Gosling"));
        items.add(new Electronics("Apple Mac Book",59000.0,12,15));
        items.add(new Clothing("Tshirt", 230, 7, "XL"));
        System.out.println(items.get(0).compareTo(items.get(1)));

        Collections.sort(items);
        System.out.println("Checking comparable sorting..");
        for (Item item : items) {
            System.out.println(item.getItemName());
        }

    }
}