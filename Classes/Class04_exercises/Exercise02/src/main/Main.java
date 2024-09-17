package main;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner v1= new Scanner(System.in);
        Scanner v2= new Scanner(System.in);           
        System.out.println("To calculate the are of a triangle, enter:");
        System.out.println("a). Base value: ");
        double num1= v1.nextDouble();
        System.out.println("b). Height value: ");
        double num2= v2.nextDouble();
        TriangleArea test01= new TriangleArea(num1,num2);
        test01.printArea();
    }   
}
