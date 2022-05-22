package com.example.simple;
import java.util.*;

public class SwitchExample {
    public static void main(String[] args) {
    //Nested Switch Statement

        char Branch = 'D';
        int cYear = 4;

        switch(cYear)
        {
            case 4:
                switch (Branch){
                    case 'C': System.out.println("Very Good Command");
                    break;
                }
                break;
            //default: System.out.println("out");
        }


    }
}
/*
*         Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Grade");
        int Grad= s.nextInt();

        switch (Grad)
        {
            case 50: System.out.println("Good");
            break;
            case 60: System.out.println("VeryGood");
            break;
            default: System.out.println("Not In range");
        }
*
* */