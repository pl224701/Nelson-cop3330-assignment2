/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jack Nelson
 */

package ex37;
import java.util.*;


public class App
{
    public static void passwordCreator(int min_length, int s_char, int n_char)
    {

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1=0,n2=0,n3=1;
        while(n1-n2-n3<n2+n3)
        {
            System.out.print("What's the minimum length? ");
            n1 = sc.nextInt();
            System.out.print("How many special characters? ");
            n2 = sc.nextInt();
            System.out.print("How many numbers? ");
            n3 = sc.nextInt();
            if(n1-n2-n3<n2+n3)
            {
                System.out.print("Need at least as many letters as special characters and numbers");
            }
        }
        passwordCreator(n1,n2,n3);
    }
}