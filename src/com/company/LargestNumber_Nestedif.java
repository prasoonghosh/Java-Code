// We have 3 numbers. Find out the greatest number using nested if else.
package com.company;

public class LargestNumber_Nestedif {
  public static void main(String [] args){
// System.out.println("Enter 1st  number: ");
//        int a = sc.nextInt();
//        System.out.println("Enter 2nd number: ");
//        int b = sc.nextInt();
//        System.out.println("Enter 3rd number: ");
//        int c = sc.nextInt();
    int a = 5;
    int b = 6;
    int c = 7;
        if(a > b){
            if(a > c){
                System.out.println(a+" is the greatest number");
            }
            else if(b > c){
               // if(b > c){
                System.out.println(a+" is the greatest number");
                    System.out.println(b+" is the greatest number");
                }
                else{
                    System.out.println(c+" is the greatest number");
                }
            }
        }
    }

