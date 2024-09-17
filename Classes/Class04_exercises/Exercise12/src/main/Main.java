package main;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner e=new Scanner(System.in);
        System.out.println("a) Enter the first grade: ");
        int num1=e.nextInt();
        System.out.println("b) Enter the second grade: ");
        int num2=e.nextInt();        
        StudentAR test01=new StudentAR(num1,num2);
        System.out.println("Status: "+test01.evaluateStudent());
    }
}