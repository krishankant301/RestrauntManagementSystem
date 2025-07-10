package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Restraunt {
    private Map<Integer, MenuItem> menu = new HashMap<>();

    public void loadMenu(){
        menu.put(1,new MenuItem(11,"Burger", 100));
        menu.put(2,new MenuItem(12,"Pizza", 200));
        menu.put(3,new MenuItem(13,"Sandwich", 150));
        menu.put(4,new MenuItem(14,"Garlic Bread", 300));
        menu.put(5,new MenuItem(15,"Lime Soda", 60));
        menu.put(6,new MenuItem(16,"Pepsi", 50));
        menu.put(7,new MenuItem(17,"Limca", 50));
    }

    public void displayMenu(){
        System.out.println("-------Menu-------");
//        for (int i : menu.keySet()){
//            System.out.println(String.format("%-4d %-20s %-5.2f\n", i, menu.get(i).getName(), menu.get(i).getPrice()));
//        }
        for (Map.Entry<Integer, MenuItem> i : menu.entrySet()){
            int key = i.getKey();
            MenuItem item = menu.get(key);
            System.out.println(String.format("%-4d %-20s %-5.2f\n", key, item.getName(), item.getPrice()));
        }
    }

    public MenuItem getMenuItemById(int id){
        return menu.get(id);
    }

    public void takeOrder(Order order, int key, int quantity){
        Order localOrder = order;
        if (menu.containsKey(key)){
            order.addItem(menu.get(key), quantity);
        }
        else
            System.out.println("INVALID ITEM NAME\nPLEASE ENTER VALID ITEM");
    }
    //my own progress...
    public void generateAndPrintBill(Order order){
        Bill bill = new Bill(order);
        System.out.println(bill.generateBillDetails());
    }

    public void start(Order order){
        loadMenu();
        while (true) {
            displayMenu();
            InputHandler user = new InputHandler();
            int key=0;
            String itemName = user.readName();
            for (int i : menu.keySet()) {
//                if(Objects.equals(menu.get(i).getName(), itemName)){
//                    key = i;
//                }
                if(menu.get(i).getName().equals(itemName)){
                    key = i;
                }
            }

            if(key == 0){
                //System.out.println("BREAKING");
                break;
            }
            takeOrder(order, key, user.readQuantity());
        }
    }

}
