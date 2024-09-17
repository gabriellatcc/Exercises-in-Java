package main;
import java.util.Scanner;
public class Main
{
    private int num1,num2,sum;
    private Scanner e;
        public Main()
        {
            num1=num2=0;
            e=new Scanner(System.in);
        }
        public void readValues()
        {
            System.out.println("Enter num1: ");
            num1=e.nextInt();
            System.out.println("Enter num2: ");
            num2=e.nextInt();
        }
        public void sumCalculation()
        {
            sum=num1+num2;
        }
        public void printSum()
        {
            System.out.println("Sum of num1 and num2: "+sum);
        }
    public static void main(String[] args)
    {
        Main test01=new Main();
        test01.readValues();
        test01.sumCalculation();
        test01.printSum();
    }  
}
