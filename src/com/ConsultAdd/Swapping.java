package com.ConsultAdd;

import java.util.Scanner;

public class Swapping {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter First value: ");
        int a = scan.nextInt();
        System.out.println("Please enter Second value: ");
        int b = scan.nextInt();

        usingThirdVariable(a,b);
        noThirdVariable(a,b);

    }

    public static void usingThirdVariable (int a, int b){
        // Swapping using Third Variable
        System.out.println("Swapping using Third Variable.");
        System.out.println("Before Swap: /n int a = "+a+ " int b = "+b);
        int result;
        result = a;
        a=b;
        b=result;
        System.out.println("After Swap: /n int a = "+a+ " int b = "+b);

    }

    public static void noThirdVariable (int a, int b){
        // Swapping without using Third Variable.
        System.out.println("Swapping without using Third Variable.");
        System.out.println("Before Swap: /n int a = "+a+ " int b = "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap: /n int a = "+a+ " int b = "+b);
    }

}
