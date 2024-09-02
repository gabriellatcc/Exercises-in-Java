package main;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int n1,n2;
        Scanner s=new Scanner(System.in);
        System.out.println("Informe n1: ");
        n1=s.nextInt();
        System.out.println("Informe n2: ");
        n2=s.nextInt();
        Calculadora teste01=new Calculadora(n1,n2);//se nao instqnciar da erro, os n1 e n2 vai pra classe calculadora que vai para os atributos
        System.out.println("Soma= "+teste01.somarNumeros());
    }   
}
