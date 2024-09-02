import java.util.Scanner;
public class Calculator
{
    private double num1,num2,result;
    private Scanner e;
        public Calculator()
        {
            num1=num2=result=0;
            e=new Scanner(System.in);
        }
        public void readValues()
        {
            System.out.println("Enter any value: ");
            num1=e.nextDouble();
            System.out.println("Enter another value: ");
            num2=e.nextDouble();
        }
        public void sumCalculation()
        {
            result=num1+num2;
        }
        public void subtractionCalculation()
        {
            result=num1-num2;
        }
        public void multiplicationCalculation()
        {
            result=num1*num2;
        }        
        public void divisionCalculation()
        {
            result=num1/num2;
        }
        public void printResult()
        {
            System.out.println("Result="+result);
            System.out.printf("Result= %.2lf"+result);
        }
        public static void main(String[] args)
        {
            Calculator test01=new Calculator();
            test01.readValues();
            test01.sumCalculation();
            test01.printResult();
            test01.subtractionCalculation();           
            test01.printResult();
            test01.multiplicationCalculation();
            test01.printResult();
            test01.divisionCalculation();
            test01.printResult();
        }
}

