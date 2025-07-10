package org.example;

import java.util.HashMap;
import java.util.Map;

public class MenuItem {

    private int id;
    private String name;
    private double price;

    public MenuItem(int ID, String NAME, int Price) {
        this.id = ID;
        this.name = NAME;
        this.price = Price;
    }

    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return "ID: " + id + "name" + name + "Price: " + price;
    }

}
