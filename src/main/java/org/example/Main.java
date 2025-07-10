package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Restraunt restraunt = new Restraunt();
        Order order = new Order();
        InputHandler user = new InputHandler();
        restraunt.start(order);
        restraunt.generateAndPrintBill(order);

    }
}