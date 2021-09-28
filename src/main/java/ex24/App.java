
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jack Nelson
 */

package ex24;
import java.util.Arrays;
import java.util.Scanner;
public class App
{
    static boolean isAnagram(char[] str1, char[] str2)
    {
        Arrays.sort(str1);
        Arrays.sort(str2);
        int n = str1.length;
        int i;
        for(i=0;i<n;i++)
        {
            if(str1[i]!=str2[i])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        int l1 = str1.length();
        int l2 = str2.length();
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        boolean a=false;
        if(l1==l2)
        {
            a=isAnagram(c1,c2);
        }
        if(a)
        {
            System.out.printf("\"%s\" and \"%s\" are anagrams.",str1,str2);
        }
        if(!a)
        {
            System.out.printf("\"%s\" and \"%s\" are not anagrams.",str1,str2);
        }
    }
}
