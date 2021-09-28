/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jack Nelson
 */

package ex37;
import java.util.*;
import java.util.Random;

public class App
{
    public static void passwordCreator(int min_length, int s_char, int n_char)
    {
        List<String> characters = new ArrayList<String>(3);
        characters.add("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
        characters.add("0123456789");
        characters.add("\"~`!@#$%^&*()-_=+[{]}\\\\|;:\\'\\\",<.>/?\";");
        String[] itemsArray = new String[characters.size()];
        itemsArray = characters.toArray(itemsArray);
        List<Character> password = new ArrayList<Character>();
        Random rand = new Random();
        for(int i = 0;i<s_char;i++)
        {
            int random = rand.nextInt(33);
            password.add(itemsArray[2].charAt(random));
        }
        for(int i = n_char;i<n_char+s_char;i++)
        {
            int random = rand.nextInt(10);
            password.add(itemsArray[1].charAt(random));
        }
        for(int i = n_char+s_char;i<min_length;i++)
        {
            int random = rand.nextInt(52);
            password.add(itemsArray[0].charAt(random));
        }
        Collections.shuffle(password);
        StringBuilder sb = new StringBuilder(password.size());
        for(Character ch: password)
        {
            sb.append(ch);
        }
        String Password = sb.toString();
        System.out.print(Password);
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
                System.out.print("Need at least as many letters as special characters and numbers\n");
            }
        }
        passwordCreator(n1,n2,n3);
    }
}
