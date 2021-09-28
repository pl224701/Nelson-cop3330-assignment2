/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jack Nelson
 */

package ex38;
import java.util.*;


public class App
{
    public static void filterEvenNumbers(int[] array,int elements)
    {
        System.out.print("The even numbers are ");
        for(int i = 0;i<elements;i++)
        {
            if(array[i]%2==0)
                System.out.printf("%d ",array[i]);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String str = sc.nextLine();
        String[] numbers = str.split(" ");
        int elements = numbers.length;
        int i;
        int array[]=new int[elements];
        for(i=0;i<elements;i++)
            array[i]=Integer.parseInt(numbers[i]);
        filterEvenNumbers(array,elements);
    }
}