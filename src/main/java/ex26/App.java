/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jack Nelson
 */

package ex26;
import java.util.*;

public class App
{
    public static double calculateMonthsUntilPaidOff(float balance, float APR, float payment)
    {
        double n = (-1.0/30.0) * (Math.log(1 + ((balance/payment)) * ( 1 - (Math.pow((1 + APR), 30)))))
                /Math.log(1 + APR);
        return n;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your balance? ");
        float balance = sc.nextInt();
        System.out.print("What is the APR on the card (as a percent)? ");
        float APR = sc.nextInt();
        System.out.print("What is the monthly payment you can make? ");
        float payment = sc.nextInt();
        double months = calculateMonthsUntilPaidOff(balance, APR, payment);
        System.out.printf("It will take you %.0f months to pay off this card",months);
    }
}

