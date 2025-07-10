package org.example;

import java.util.Scanner;

public class InputHandler {
    public int readQuantity(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the quantity: ");
        int quantity = scn.nextInt();
        return quantity;
    }

    public String readName(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Item Name: ");
        String item = scn.nextLine();
        return item;
    }
}
