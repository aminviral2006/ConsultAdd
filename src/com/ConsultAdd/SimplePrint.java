package com.ConsultAdd;

import java.util.Scanner;

public class SimplePrint {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please write something");

        String s = scan.next();
        System.out.println(s);
    }
}
