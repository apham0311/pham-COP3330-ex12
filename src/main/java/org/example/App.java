package org.example;
import java.util.Scanner;


/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Anh Pham
 *
 */
public class App
{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("What is the principal amount? ");
        int principal = input.nextInt();


        System.out.print("What is the rate? ");
        double rate = input.nextDouble();


        System.out.print("What is the number of years? ");
        int year = input.nextInt();


        int worth = (int)Math.round(principal*(1+rate*year*0.01));
        

        System.out.println("After "+year+" years at "+rate+"%, the investment will be worth $"+worth+"" );

        input.close();
    }

}
