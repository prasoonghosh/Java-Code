package com.company;

import java.util.Scanner;
public class greeting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number(1 OR 2 OR 3): ");
        int a = sc.nextInt();
        /*if(a == 1){
            System.out.println("Hello");
        }
        else if(a == 2){
            System.out.println("Namaste");
        }
        else if(a == 3){
            System.out.println("Bonjour");
        }
        else{
            System.out.println("Invalid Number");
        }*/
        switch (a){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid Button");
        }
    }
}
