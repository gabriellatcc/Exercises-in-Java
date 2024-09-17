package main;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any integer number to see the multiblication table from 1 to the number: ");
        int num=s.nextInt();
        MultiplicationTable1toN test01= new MultiplicationTable1toN(num);
        System.out.println("Multiplicacion table from 1 to "+num+": \n"+test01.doMultiplicationTable());
    }
}