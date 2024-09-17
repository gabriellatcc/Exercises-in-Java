package main;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    { 
        Scanner e=new Scanner(System.in);
        System.out.println("Enter any integer number to find out if it is prime number or not: ");
        int num=e.nextInt();
        PrimeYN test01=new PrimeYN(num);
        System.out.println(test01.judgeNum());
    }   
}