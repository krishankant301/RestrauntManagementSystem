package org.example;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<OrderItem> items = new ArrayList<>();

    public void addItem(MenuItem itemName, int quantity){

        for (OrderItem orderItem : items){
            if (orderItem.getMenuItem() == itemName) {
                orderItem.setQuantity((quantity));
                System.out.println(quantity + " " + orderItem.getMenuItem().getName() + " added");
                return;
            }
        }
        items.add(new OrderItem(itemName, quantity));
        System.out.println(quantity + " " + itemName.getName() + " added");
    }

    public void removeItem(int itemId){

        items.removeIf(item -> item.getMenuItem().getID() == itemId);
    }

    public List<OrderItem> getItem() {
        return items;
    }

    public double getSubTotal(){
        double subTotal = 0;
        for(OrderItem orderItem : items) {
            subTotal += orderItem.getItemTotal();
        }
        return subTotal;
    }

    public void clearOrder() {
        items.clear();
    }



}
