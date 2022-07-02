package com.company;

public class Main {

    public static void main(String[] args) {
        Employee  e1 = new Employee(); // object create
        e1.age = 15;
        e1.name = "ish";
        e1.ageFinder();
        //over ride
        e1.age =20;
        e1.ageFinder();

        //USING FINAL KEY IN eMPLOYEE CLASS
        System.out.println(e1.Department);

    }
}
