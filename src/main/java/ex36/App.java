/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jack Nelson
 */

package ex36;
import java.util.*;


public class App
{
    public static void output(List<Integer> list, int elements)
    {
        System.out.println(Arrays.toString(list.toArray()));
        int total;
        for(int i=0;i<elements;i++)
        {

        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        String str="a";
        int elements = 0;
        while(!str.equals("done"))
        {
            System.out.print("Enter a number: ");
            str=sc.nextLine();
            if(!str.equals("done"))
            {
                int number = Integer.parseInt(str);
                list.add(number);
                elements++;
            }
        }
        output(list,elements);
    }
}