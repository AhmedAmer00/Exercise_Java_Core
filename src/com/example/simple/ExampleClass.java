package com.example.simple;


class Student{
    int id; String name;
}


public class ExampleClass {
    public static void main(String[] args) {

        Student c = new Student(); // create an object from class
        //Initialization through reference
        c.id =22;
        c.name ="Ahmed";
        System.out.print(c.id + " ");
        System.out.println(c.name);


    }
}
