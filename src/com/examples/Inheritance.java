package com.examples;

class Employee{
    float salary = 10000;
}
class Programmer extends Employee{
    int id = 12345;
}
class Job extends Programmer{
    String position = "Java Full Stack";
}

public class Inheritance {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println(p.id + " " + p.salary);
        Job j = new Job();
        System.out.println(j.id + " " + j.salary+ " "+ j.position);


    }
}
/*
* Note:
* multiple inheritance is not supported in java
* */