package com.company;

public class Employee {
    String name;//instance variable
    int age;
    final String Department = "IT Department"; //can not assign value to final variable via object  instance
    public void ageFinder(){
        String a = "adult";//local variable
        String c = "child";

        if(age>18){
            System.out.println("Adult");
        }else{
            System.out.println("Child");
        }
    }
}
