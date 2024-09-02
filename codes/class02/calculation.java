import java.util.Scanner;
public class Calculation
{
    private int num1,num2,sum;
    private Scanner e;
        public Calculation()
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
        Calculation object01=new Calculation();
        object01.readValues();
        object01.sumCalculation();
        object01.printSum();
        }
}
