package com.ConsultAdd;

import java.util.Scanner;

public class SimpleAdd {

    public static void main(String[] args) {
        int a = getValue();
        int b = getValue();
        int z = a+b;
        z += 30;
        System.out.println("Final Value: "+z);
    }

    public static int getValue(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any number between 1-10:");
        int value = scan.nextInt();
        if(value > 10 || value < 1) {
            System.out.println("Sorry your value is not between 1-10. Please try again!");
            getValue();
        }
        return value;
    }

}
