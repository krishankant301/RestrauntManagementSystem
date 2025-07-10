package org.example;

public class OrderItem {

    private MenuItem menuItem;
    private int quantity;

    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity += quantity;
    }

    public double getItemTotal(){
        return (menuItem.getPrice() * quantity);
    }

    @Override
    public String toString(){
        return menuItem.getName() + " X " + quantity + " = " + quantity* menuItem.getPrice();
    }

}
