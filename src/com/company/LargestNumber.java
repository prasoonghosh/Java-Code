// Find out the largest number among the three numbers entered by the user
package com.company;

import java.util.Scanner;
public class LargestNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1+" is the largest number");
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println(num2+" is the largest number");
        }
        else if(num3 > num1 && num3 > num2){
            System.out.println(num3+ " is the greatest number");
        }
        else{
            System.out.println("All the numbers are equal");
        }
    }
}
