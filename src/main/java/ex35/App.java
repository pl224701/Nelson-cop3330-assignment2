/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jack Nelson
 */

package ex35;
import java.util.*;


public class App
{
    public static void random(List<String> str, int elements)
    {
        Random rand = new Random();
        int r_number = rand.nextInt(elements);
        System.out.printf("The winner is... %s",str.get(r_number));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<String> str= new ArrayList<String>();
        String entry="a";
        int elements=0;
        while(!Objects.equals(entry, ""))
        {
            System.out.print("Enter a name: ");
            entry=sc.nextLine();
            if(!Objects.equals(entry, ""))
            {
                str.add(entry);
                elements++;
            }
        }
        random(str,elements);
    }
}