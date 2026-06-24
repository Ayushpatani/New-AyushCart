package com.springProject.LearningRestAPI.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springProject.LearningRestAPI.model.Item;

@Service
public class ItemService {

    public List<Item> getItems() {

        List<Item> items = new ArrayList<>();

        items.add(new Item("Laptop", 50000));
        items.add(new Item("Phone", 20000));
        items.add(new Item("Headphones", 3000));

        return items;
    }
}
