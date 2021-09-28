/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jack Nelson
 */

package ex34;

import java.util.Scanner;


public class App
{
    public static String[] stringRemover(String[] str,String name)
    {
        int element=0;
        while(!str[element].equals(name))
        {
            element++;
        }
        while(element<4)
        {
            str[element]=str[element+1];
            element++;
        }
        return str;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str1 = "John Smith";
        String str2 = "Jackie Jackson";
        String str3 = "Chris Jones";
        String str4 = "Amanda Cullen";
        String str5 = "Jeremy Goodwin";
        String[] str = {str1, str2, str3, str4, str5};
        System.out.println("There are 5 employees: ");
        for(int i = 0;i<5;i++)
        {
            System.out.printf("%s\n",str[i]);
        }
        System.out.print("\nEnter an employee name to remove: ");
        String name = sc.nextLine();
        System.out.println("");
        str=stringRemover(str,name);
        for(int i = 0;i<4;i++)
        {
            System.out.printf("%s\n",str[i]);
        }
    }
}