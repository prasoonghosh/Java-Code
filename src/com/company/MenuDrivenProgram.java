/*Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100).
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well” */
package com.company;

import java.util.*;
public class MenuDrivenProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input(1 or 0):");
        int n = sc.nextInt();

        do{
            System.out.println("Enter your marks: ");
            int i = sc.nextInt();
            if(i >= 90){
                System.out.println("This is good");
            }
            else if(i <=89 && i >= 60){
                System.out.println("This is also good");
            }
            else if(i <= 59 && i >= 0){
                System.out.println("This is good as well");
            }
            else{
                System.out.println("Invalid Input");
            }
        }while(n==1);
    }
}
