import java.util.*;
public class Arrays{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your array: ");
        int size = sc.nextInt();
        String [] name = new String[size];

        for(int i = 0; i<size;i++ ){
            System.out.print("Enter the name: ");
            name[i] = sc.next();

        }
        for(int i = 0; i<name.length; i++){
            System.out.println("name" +(i+1)+" is: "+name[i]);
        }
    }
}