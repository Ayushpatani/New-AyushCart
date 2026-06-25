package com.springProject.LearningRestAPI.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springProject.LearningRestAPI.model.Item;

@Service
public class ItemService {

    public List<Item> getItems() {

        List<Item> items = new ArrayList<>();

        // ✅ Correct order: price, quantity, name, desc
        items.add(new Item(50000, 1, "Laptop",     "Dell Laptop"));
        items.add(new Item(20000, 1, "Phone",      "A smartphone"));
        items.add(new Item(3000,  1, "Headphones", "Wired headphones"));

        return items;
    }
}