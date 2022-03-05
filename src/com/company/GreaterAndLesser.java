package com.company;

import java.util.Scanner;
public class GreaterAndLesser {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();
        if(num1 == num2){
            System.out.println("num1 and num2 are equal");
        }
        else if(num1>num2){
            System.out.println("num1 is greater than num2");
        }
        else{
            System.out.println("num1 is lesser than num2");
        }
    }
}
