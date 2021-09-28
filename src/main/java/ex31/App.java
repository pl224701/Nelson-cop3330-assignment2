/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jack Nelson
 */

package ex31;
import java.util.Scanner;


public class App
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String r_pulse="a";
        String Age = "a";
        boolean pulse = r_pulse.matches("[0-9]+");
        boolean Age1 = r_pulse.matches("[0-9]+");
        while(!Age1 || !pulse)
        {
            System.out.print("Resting Pulse: ");
            r_pulse = sc.nextLine();
            pulse = r_pulse.matches("[0-9]+");
            System.out.print("Age: ");
            Age = sc.nextLine();
            Age1 = Age.matches("[0-9]+");
            if(!Age1 || !pulse)
                System.out.println("Sorry. One of your inputs is not valid.");
        }
        int resting_pulse = Integer.parseInt(r_pulse);
        int age = Integer.parseInt(Age);
        float TargetHeartRate;
        System.out.println("Intensity    | Rate");
        System.out.println("-------------|--------");
        for(float i=0;i<9;i++)
        {
            TargetHeartRate = (((220-age)-resting_pulse)*((55+5*i)/100)+resting_pulse);
            System.out.format("%2.0f%% %10s %.0f bpm\n",55+5*i,'|',TargetHeartRate);
        }
    }
}