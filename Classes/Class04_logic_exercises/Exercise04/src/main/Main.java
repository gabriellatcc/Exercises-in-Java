package main;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int []nEntered=new int[5];
        Scanner e=new Scanner(System.in);
        System.out.println("Enter 5 integer values:");
        for(int i=0;i<5;i++)
        {
            System.out.println("Value "+(i+1)+": ");
            nEntered[i]=e.nextInt();
        }        
        FindSumOdd test01= new FindSumOdd(nEntered);
        int sumOdd=test01.sumOdd();
        System.out.println("The sum of the odd numbers is: "+sumOdd+".\n");
    }
}