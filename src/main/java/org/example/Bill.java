package org.example;

public class Bill {
    private Order order;
    private double tax =  0.10d;
    private double taxAmount;

    public Bill(Order order){
        this.order = order;
    }

    //public void calculate()


    public double getSubtotal(){
        return order.getSubTotal();
    }

    public double getTaxAmount(){
        return (order.getSubTotal()*tax);
    }

    public double getTotal(){
        return (getSubtotal()+getTaxAmount());
    }

    public String generateBillDetails(){
        StringBuilder bill = new StringBuilder();
        bill.append("===========Customer Bill=============\n");
        bill.append(String.format("%-20s %-10s %-12s %-12s\n", "Item", "Qty", "Price", "Total"));
        bill.append("=====================================\n");
        for (OrderItem item : order.getItem()){
            String name = item.getMenuItem().getName();
            int quantity = item.getQuantity();
            double price = item.getMenuItem().getPrice();
            double total = item.getItemTotal();

            bill.append(String.format("%-20s %-10s %-11.2f %-11.2f\n", name, quantity, price, total));
        }
        bill.append(String.format("%-40s %-12.2f\n","SubTotal", getSubtotal()));
        bill.append(String.format("%-40s %-12.2f\n","Tax Amount", getTaxAmount()));
        bill.append(String.format("%40s %-12.2f\n","Total Amount", getTotal()));
        bill.append("=====THANK YOU, VISIT AGAIN====");

        return bill.toString();
    }

    //public String toString()
}
