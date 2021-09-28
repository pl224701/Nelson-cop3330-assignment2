/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jack Nelson
 */

package ex27;
import java.util.*;
import java.util.regex.Pattern;

public class App
{
    public static void validateInput(String str1, String str2, String str3, String str4)
    {
        int length1=str1.length();
        int length2=str2.length();
        int errors = 0;
        if(length1==0)
        {
            System.out.println("The first name must be filled in");
            errors++;
        }
        if(length1<2)
        {
            System.out.println("The first name must be at least 2 characters long.");
            errors++;
        }
        if(length2==0)
        {
            System.out.println("The last name must be filled in");
            errors++;
        }
        if(length2<2)
        {
            System.out.println("The last name must be at least 2 characters long.");
            errors++;
        }
        boolean format = str4.matches("[a-zA-Z]{2}-\\d{4}");
        if(!format)
        {
            System.out.println("The employee ID must be in the format of AA-1234.");
            errors++;
        }
        boolean numbers = str3.matches("[0-9]+");
        if(!numbers)
        {
            System.out.println("The zipcode must be a 5 digit number");
            errors++;
        }
        if(errors==0)
        {
            System.out.print("There were no errors found");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the last name: ");
        String str2 = sc.nextLine();
        System.out.print("Enter the ZIP code: ");
        String str3 = sc.nextLine();
        System.out.print("Enter the employee ID: ");
        String str4 = sc.nextLine();
        validateInput(str1,str2,str3,str4);
    }
}
