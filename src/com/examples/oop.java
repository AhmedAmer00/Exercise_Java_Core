package com.examples;
//Object and Class Example: Initialization through method

class Student
{
    Student(int id, String Name)
    {
        this.id = id;
        this.Name= Name;
    }
    int id; String Name;

    void insertRecord(int r , String n)
    {
        id = r; Name =n;
    }
    void printMenu()
    {
        System.out.println(id + " "+ Name);
    }
}

public class oop {
    public static void main(String[] args) {

        Student s= new Student(23, "Ahmed");
        //s.insertRecord(22, "Ahmed");
        s.printMenu();

    }
}
