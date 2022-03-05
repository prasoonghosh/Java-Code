package com.company;

import java.util.Scanner;
public class PositiveOrNegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("The number entered is positive");
        }
        else if(num < 0){
            System.out.println("The number entered is negative");
        }
        else{
            System.out.println("The number entered is zero");
        }
    }
}
