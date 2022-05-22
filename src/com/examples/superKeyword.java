package com.examples;

class Animal{
    String color = "White";
}
class Dog extends Animal{
    //super is used to refer immediate parent class instance variable.
    String color= "Black";

    void print()
    {
        System.out.println("Color = "+ color);
        System.out.println("Color = "+ super.color);
    }

}



public class superKeyword {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.print();

    }
}
