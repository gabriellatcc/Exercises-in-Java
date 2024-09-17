package main;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner e=new Scanner(System.in);
        System.out.println("Enter any integer number to see the avrerage of even and odd numbers between 1 and the number:");
        int num= e.nextInt();
        AverageEObetween1toN test01=new AverageEObetween1toN(num);
        System.out.println("The averages are: \n"+"Average of odd numbers: "+test01.judgeSumOdd()+".\n"+"Average of even numbers:: "+test01.judgeSumEven()+".\n");
    }
}