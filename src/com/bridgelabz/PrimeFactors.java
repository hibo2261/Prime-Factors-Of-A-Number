package com.bridgelabz;

import java.util.Scanner;

public class PrimeFactors {


    public static void  main (String[] args) {
        System.out.println("********************************************");
        System.out.println(" Welcome to Prime Factors Of Number....");   //Printing Welcome Meassage
        System.out.println("********************************************");


        System.out.println("Please Enter A Number = ");// taking input from user
        Scanner sc = new Scanner(System.in);  // creating a scanner object
        int n = sc.nextInt();

        for (int d = 2; d < n; d ++) {
            while (n % d == 0) // checking if remainder is 0
            {
                n = n / d;
                System.out.println("___");
                System.out.println(d);

            }
        }

                    if (n > 1) //printing a given no. itself
                        {
                            System.out.println("___");
                       System.out.print(n);

                          }

    }
}



