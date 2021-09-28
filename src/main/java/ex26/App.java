/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jack Nelson
 */

package ex26;
import java.util.*;

public class App
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your balance? ");
        float balance = sc.nextInt();
        System.out.print("What is the APR on the card (as a percent)? ");
        float APR = sc.nextInt();
        System.out.print("What is the monthly payment you can make? ");
        float payment = sc.nextInt();
        double months = PaymentCalculator.calculateMonthsUntilPaidOff(balance, APR, payment);
        System.out.printf("It will take you %.0f months to pay off this card",Math.ceil(months));
    }
}

