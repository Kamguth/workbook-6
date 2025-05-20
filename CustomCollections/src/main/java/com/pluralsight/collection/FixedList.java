package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private int maxSize;
    private List<T> items;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }
    public void add(T item) {
        if (items.size() >= maxSize) {
            System.out.println("Cannot add item, max size: " + maxSize);
            return;
        }
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}
