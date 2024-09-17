package main;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner e=new Scanner(System.in);
        int []num=new int [5];
        System.out.println("Enter any five integer numbers:");
        for(int i=0;i<5;i++)
        {
            System.out.println("Value "+(i+1)+": ");
            num[i]=e.nextInt();
        }
        LSnumber test01=new LSnumber(num);
        System.out.println(test01.checkHierarchy());
    }   
}