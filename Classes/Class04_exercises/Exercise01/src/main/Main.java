package main;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int currentSalary;
        Scanner e=new Scanner(System.in);
        System.out.println("Enter your current salary: ");
        currentSalary=e.nextInt();
        NewSalary test01=new NewSalary(currentSalary);
        System.out.println("The value of your new salary is: "+test01.calculateIncrease());
    }   
}