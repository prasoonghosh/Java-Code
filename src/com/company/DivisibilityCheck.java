// Check whether the number entered is divisible by 5 and 11 or not
package com.company;

import java.util.Scanner;
public class DivisibilityCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if(num%5 == 0 && num%11 == 0){
            System.out.println(num+" is divisible by 5 and 11");
        }
        else{
            System.out.println(num+" is not divisible by 5 and 11");
        }
    }
}
