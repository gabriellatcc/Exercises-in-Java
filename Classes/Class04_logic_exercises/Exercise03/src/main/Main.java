package main;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int[] vInteger=new int[5];
        int sumEvenNumbers=0;
        System.out.println("Enter 5 integer numbers:");
        for(int i=0;i<5;i++)
        {
            System.out.println("Value "+(i+1)+": ");
            vInteger[i]= s.nextInt();
        }
            FindEvenSum test01=new FindEvenSum(vInteger);
            sumEvenNumbers=test01.sumEven();
            System.out.println("The sum of the even numbers entered is: "+sumEvenNumbers+".\n");                    
    }    
}
