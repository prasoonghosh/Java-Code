//Check wheter the number is prime number or not
package com.company;

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(num%1 == 0 && num%num == 0){
            System.out.println("The number entered is a prime number");
        }
        else{
            System.out.println("The number entered is not a prime number");
        }
    }
}
