
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jack Nelson
 */

package ex25;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App
{
    static int passwordValidator(String str)
    {
        boolean numbers = str.matches("[0-9]+");
        boolean letters = str.matches("[a-zA-Z]+");
        int length = str.length();
        Pattern p = Pattern.compile("[^A-Za-z0-9 ]");
        Matcher m = p.matcher(str);
        boolean s_characters = m.find();
        if(numbers && length<8)
            return 0;
        if(letters && length<8)
            return 1;
        if(!s_characters && length>=8 && !letters && !numbers)
            return 2;
        if(s_characters && length>=8 && !letters && !numbers)
            return 3;
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Create a password: ");
        String str = sc.nextLine();
        int strength;
        strength=passwordValidator(str);
        if(strength==0)
        {
            System.out.printf("The password '%s' is a very weak password.",str);
        }
        if(strength==1)
        {
            System.out.printf("The password '%s' is a weak password.",str);
        }
        if(strength==2)
        {
            System.out.printf("The password '%s' is a strong password.",str);
        }
        if(strength==3)
        {
            System.out.printf("The password '%s' is a very strong password.",str);
        }
    }
}
