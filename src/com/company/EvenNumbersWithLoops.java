//Print all even numbers till n.
package com.company;

import java.util.Scanner;
public class EvenNumbersWithLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        for(int i = 0; i <=n; i=i+2){
            System.out.println(i);
        }


    }
}