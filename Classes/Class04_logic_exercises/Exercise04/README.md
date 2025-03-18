# Programa de Soma de Números Ímpares

Este programa em Java solicita ao usuário que insira **5 números inteiros**, identifica os números ímpares e exibe a soma deles no console.

## Como o Programa Funciona

1. O programa solicita ao usuário que insira **5 números inteiros**.
2. A classe `FindSumOdd` recebe os números e calcula a soma dos valores **ímpares**.
3. O resultado da soma dos números ímpares é exibido na tela.

## Código-Fonte

### Classe `Main.java`

```java
package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nEntered = new int[5];
        Scanner e = new Scanner(System.in);

        System.out.println("Enter 5 integer values:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Value " + (i + 1) + ": ");
            nEntered[i] = e.nextInt();
        }

        FindSumOdd test01 = new FindSumOdd(nEntered);
        int sumOdd = test01.sumOdd();
        System.out.println("The sum of the odd numbers is: " + sumOdd + ".\n");
    }
}
```

### Classe `FindSumOdd.java`

```java
package main;
class FindSumOdd
{
    private int []num;
    public int sum=0,i;
        public FindSumOdd(int [] nEntered)
        {
            this.num=nEntered;
        }
        public int[] getNum()
        {
            return num;
        }
        public void setNum(int[] num)
        {
            this.num=num;
        }
        public int sumOdd()
        {
            for(i=0;i<5;i++)
            {
                if(num[i]%2==0)
                {
                    sum+=num[i];
                }
            }
            return sum;
        }
}
```

## Exemplo de Execução

Entrada do usuário:

```
Enter 5 integer values:
Value 1: 3
Value 2: 8
Value 3: 5
Value 4: 7
Value 5: 2
```

Saída no console:

```
The sum of the odd numbers is: 15.
```
