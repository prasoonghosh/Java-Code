package com.company;

import java.util.Scanner;

public class Table {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        System.out.println("Your table is.");
        for(int i = 1; i<11;i++){
            System.out.println(n * i);
        }
    }
}
