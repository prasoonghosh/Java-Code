//Check whether the entered value is an alphaber, charecter or a number
package com.company;

import java.util.Scanner;
import java.lang.String;
public class AlphabetCharacterOrNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value: ");
        char i = sc.next().charAt(0);
        if((i >= 'a' && i<= 'z')||(i >= 'A' && i <= 'Z')){
            System.out.println(i+" is an alphabet");
        }
        else if((i >0) || (i == 0) || (i < 0)) {
            System.out.println(i+" is a number");
        }
        else{
            System.out.println(i+" is a character");
        }
    }
}
