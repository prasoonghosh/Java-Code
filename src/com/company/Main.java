//WAP to add two numbers using command line arguments and scanner class.

package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print("The sum of 1st and 2nd number is: "+sum);
    }
}
