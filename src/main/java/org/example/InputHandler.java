package org.example;

import java.util.Scanner;

public class InputHandler {
    public int readQuantity(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the quantity: ");
        int quantity = scn.nextInt();
        return quantity;
    }

    public int readId(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Item ID: ");
        int item = scn.nextInt();
        return item;
    }
}
