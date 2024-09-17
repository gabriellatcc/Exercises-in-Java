package main;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int n1,n2;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter n1: ");
            n1=s.nextInt();
            System.out.println("Enter n2: ");
            n2=s.nextInt();
            Calculator teste01=new Calculator(n1,n2);
            System.out.println("Sum= "+teste01.sumValues());    
    }
}
