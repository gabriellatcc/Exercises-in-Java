package main;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner e=new Scanner (System.in);
        System.out.println("Enter any integer number: ");
        int num=e.nextInt();
        Prime1toN test01=new Prime1toN(num);
        System.out.println("Your prime numbers between 1 and "+num+" are: "+test01.printPrimes());
    }  
}