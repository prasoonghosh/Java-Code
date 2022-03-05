package com.company;

public class MethodOverCase1 {
    void show(int a){
        System.out.println("Integer method: "+a);
    }
    void show(String str){
    System.out.println("String Method: "+str);
    }
    public static void main(String [] args){
        MethodOverCase1 ob=new MethodOverCase1();
        ob.show( "Hello");
        ob.show(20);
        ob.show('A');
    }

}
