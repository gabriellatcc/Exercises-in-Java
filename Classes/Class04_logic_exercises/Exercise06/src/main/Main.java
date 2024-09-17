package main;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any integer number to see the factorial: ");
        int num=s.nextInt();
        Factorial test01= new Factorial(num);
        System.out.println("O resultado do fatorial e de = "+test01.calculateFactorial());
    }   
}