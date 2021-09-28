/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jack Nelson
 */

package ex33;
import java.util.Random;
import java.util.Scanner;


public class App
{
    public static void winner(String[] str)
    {
        Random rand = new Random();
        int r_number = rand.nextInt(4);
        System.out.printf("\n%s",str[r_number]);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str1="Yes";
        String str2="No";
        String str3="Maybe";
        String str4="Ask again later";
        String[] str = {str1,str2,str3,str4};
        System.out.print("What's your question?\n> ");
        String input = sc.nextLine();
        winner(str);
    }
}
