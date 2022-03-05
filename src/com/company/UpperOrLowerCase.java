//Check whether a character is uppercase or lowercase alphabet.
package com.company;

import java.util.Scanner;
public class UpperOrLowerCase {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet: ");
        char ch = sc.next().charAt(0);
        if(ch >= 'a' && ch <='z'){
            System.out.println("The alphabet is in lower case");
        }
        else{
            System.out.println("The alphabet is in upper case");
        }
    }
}
