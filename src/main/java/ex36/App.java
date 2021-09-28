/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jack Nelson
 */

package ex36;
import java.util.*;


public class App
{
    public static float std(List<Integer> list,float average, int elements)
    {
        System.out.println(Arrays.toString(list.toArray()));
        Integer[] numbers = new Integer[list.size()];
        numbers=list.toArray(numbers);
        float std=0;
        for(int i=0;i<elements;i++)
        {
            std= (float) (std+Math.pow(average-numbers[i],2));
        }
        std=std/(elements);
        std=(float)Math.sqrt(std);
        return std;
    }
    public static int max(List<Integer> list)
    {
        Integer[] numbers = new Integer[list.size()];
        numbers=list.toArray(numbers);
        int max=numbers[0];
        for(int i=1;i<list.size();i++)
        {
            if(max<numbers[i])
            {
                max=numbers[i];
            }
        }
        return max;
    }
    public static int min(List<Integer> list)
    {
        Integer[] numbers = new Integer[list.size()];
        numbers=list.toArray(numbers);
        int min=numbers[0];
        for(int i=1;i<list.size();i++)
        {
            if(min>numbers[i])
            {
                min=numbers[i];
            }
        }
        return min;
    }
    public static float average(List<Integer> list, int elements)
    {
        System.out.println(Arrays.toString(list.toArray()));
        Integer[] numbers = new Integer[list.size()];
        numbers=list.toArray(numbers);
        float total=0;
        for(int i=0;i<elements;i++)
        {
            total=total+numbers[i];
        }
        float average = total/elements;
        return average;
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
            if(!str.matches("[0-9]+"))
            {
                System.out.println("Invald input");
            }
            if(!str.equals("done")&&str.matches("[0-9]+"))
            {
                int number = Integer.parseInt(str);
                list.add(number);
                elements++;
            }
        }
        float average = average(list,elements);
        System.out.printf("The average is %.1f\n",average);
        int min = min(list);
        System.out.printf("The minimum is %d\n",min);
        int max = max(list);
        System.out.printf("The maximum is %d\n",max);
        float std = std(list,average,elements);
        System.out.printf("The standard deviation is %.2f\n",std);
    }
}
