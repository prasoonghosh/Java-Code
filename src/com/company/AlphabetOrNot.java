//Check whether the value entered is alphabet or not
package com.company;

import java.util.*;
public class AlphabetOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        char ch = sc.next().charAt(0);
        if((ch >= 'a'&& ch <= 'z') || (ch >= 'A' && ch <= 'Z' )){
            System.out.println("The value entered is an alphabet");
        }
        else{
            System.out.println("The value entered is not an alphabet");
        }
    }
}
