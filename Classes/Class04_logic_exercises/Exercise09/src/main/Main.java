package main;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner e=new Scanner(System.in);
        int num=e.nextInt();
        System.out.println("Enter any integer number between 1 to 10: ");
        Odd1toN test01=new Odd1toN(num);
        System.out.println("The odd numbers betweern 1 to "+num+" are: "+test01.judgeOdd());
    }
}
