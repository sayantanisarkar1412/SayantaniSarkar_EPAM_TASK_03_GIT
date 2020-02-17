package application;
import java.io.*;
import java.util.*;
import java.lang.*;
public class Interest
{
	void calc_interest() throws IOException
    {
        double si,ci;
        double principle,rate;
        int time,choice;
        Scanner sc = new Scanner(System.in);
        System.out.write("Enter the principle amount : \n".getBytes());
        principle=sc.nextDouble();
        System.out.write("Enter the rate of interest : \n".getBytes());
        rate=sc.nextDouble();
        System.out.write("Enter the time duration :  \n".getBytes());
        time=sc.nextInt();
        System.out.write("enter your choice : 1 for simple interest or 2 for compound interest : \n".getBytes());
        choice=sc.nextInt();
        if(choice==1)
        {
            si=(principle*rate*time)/100;
            System.out.printf("Simple Interest is : %f \n",si);
        }
        else if(choice == 2)
        {
            ci=principle*Math.pow((1+(rate/100)),time);
            System.out.printf("Compound Interest is : %f \n",ci);
        }
        else
            System.out.write("invalid input : \n".getBytes());
    }

}
