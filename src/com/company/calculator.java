package com.company;

import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();
        Scanner op = new Scanner(System.in);
        System.out.println("Enter the operator:");
        String operator = op.next();

        switch(operator){
            case "+":
                System.out.println("The sum of the numbers are: "+(num1+num2));
                break;
            case "-":
                System.out.println("The difference of the numbers are: "+(num2 - num1));
                break;
            case "*":
                System.out.println("The product of the numbers are: "+(num1*num2));
                break;
            case "/":
                System.out.println("The division of the numbers are: "+(num1/num2));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
