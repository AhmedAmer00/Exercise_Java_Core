package com.example.simple;
import java.util.Scanner;

public class FactorialNumber {

    static  int factorial(int n)
    {
        if(n == 0)
            return 1;
        else
            return (n* factorial(n-1));
    }

    public static void main(String[] args) {

        int i , fact =1;
        int n=4;
        fact = factorial(n);
        System.out.println("Factorial of "+n+" is: "+fact);



       /* Scanner s = new Scanner(System.in);

        int i , fact =1;
        System.out.print("Enter a number : ");
        int n = s.nextInt();

        for(i =1; i<=n; i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial of "+n+" is: "+fact);*/
    }
}
