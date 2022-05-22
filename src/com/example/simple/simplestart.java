package com.example.simple;

public class simplestart {
    static int n1 = 0, n2 =1 , n3=0;

    static void printFibonacci(int count)
    {
        if(count > 0)
        {
            n3 = n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(" "+ n3);
            printFibonacci(count-1);
        }
    }

    public static void main(String[] args) {

        //Fibonacci Series in Java without using recursion
        /*int n1 = 0, n2 =1 , n3,i,count =10;

        System.out.println(n1+ " " + n2);

        for(i =2; i< count; ++i)
        {
            n3 = n1+n2;
            System.out.println(" " + n3);
            n1 = n2;
            n2=n3;


        }*/
        //Fibonacci Series in Java using recursion
        int count=10;
        //System.out.print(n1+" "+n2);//printing 0 and 1
        printFibonacci(count);

    }
}
