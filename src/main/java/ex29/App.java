/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jack Nelson
 */

package ex29;
import java.util.Scanner;


public class App
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String RoR="0";
        boolean numbers = RoR.matches("[0-9]+");
        while(RoR.equals("0") || !numbers)
        {
            System.out.print("What is the rate of return? ");
            RoR = sc.nextLine();
            numbers = RoR.matches("[0-9]+");
            if(RoR.equals("0") || !numbers)
                System.out.println("Sorry. That's not a valid input.");
        }
        int r_of_return = Integer.parseInt(RoR);
        int years = 72/r_of_return;
        System.out.printf("It will take %d years to double your initial investment",years);
    }
}