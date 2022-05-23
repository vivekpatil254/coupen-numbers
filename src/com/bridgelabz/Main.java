package com.bridgelabz;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static int check(int numbers[],int coupen)
    {
        for (int i =0; i<numbers.length;i++)
        {
            if(numbers[i]==coupen)
                return 1;
        }
        return 0;
    }


    public static void main(String[] args) {
	    int size,i,count=0;
        System.out.println("Enter number of coupens to be genrated");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        Random randomNumber = new Random();
        int coupen;
        int flag;
        int numbers[] = new int[size];
        for (i=0;i<numbers.length;i++)
        {
            coupen = randomNumber.nextInt();
            System.out.println(coupen);
            flag = check(numbers,coupen);
            if(flag==0) {
                numbers[i] = coupen;
                count++;
            }
            else {
                count++;
                continue;
            }
        }
        for(i=0;i<numbers.length;i++) {
            System.out.println(numbers[i]);
       }
        System.out.println("The total "+count+" random numbers are needed to have "+size+" distinct numbers ");
    }
}
