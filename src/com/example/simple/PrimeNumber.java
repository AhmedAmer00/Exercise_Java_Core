package com.example.simple;

public class PrimeNumber {
    public static void main(String[] args) {
        int n =3, i , m =0, flag =0;
        m = n/2;
        if(n ==0 || n ==1)
        {
            System.out.println(n+ ": is Not Prime");
        }
        else
        {
         for(i=2; i<=m;i++)
            {
                if(n%i ==0){
                    System.out.println(n + " :Not A Prime");
                    flag =1;
                    break;
                }
            }
         if(flag ==0){ System.out.println(n +" :Is A Prime ");}
        }

    }
}
