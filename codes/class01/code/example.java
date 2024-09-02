import java.util.Scanner;
public class Example
{
    public static void main(String[] args)
    {
        int value;
        Scanner e = new Scanner(System.in);
        System.out.println("Enter any value: ");
        value=e.nextInt(); 
        System.out.println("Value entered: "+value+".\n");
        System.out.printf("Value entered: %d.\n",value);
    }
}
