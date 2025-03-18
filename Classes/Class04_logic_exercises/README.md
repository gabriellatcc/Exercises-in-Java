# Programa de Soma de Números Pares

Este programa em Java solicita ao usuário que insira **5 números inteiros**, identifica os números pares e exibe a soma deles no console.

## Como o Programa Funciona

1. O programa solicita ao usuário que insira **5 números inteiros**.
2. A classe `FindEvenSum` recebe os números e calcula a soma dos valores **pares**.
3. O resultado da soma dos números pares é exibido na tela.

## Código-Fonte

### Classe `Main.java`

```java
package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] vInteger = new int[5];
        int sumEvenNumbers = 0;

        System.out.println("Enter 5 integer numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Value " + (i + 1) + ": ");
            vInteger[i] = s.nextInt();
        }

        FindEvenSum test01 = new FindEvenSum(vInteger);
        sumEvenNumbers = test01.sumEven();
        System.out.println("The sum of the even numbers entered is: " + sumEvenNumbers + ".\n");
    }
}
```

### Classe `FindEvenSum.java`

```java
package main;

public class FindEvenSum {
    private int[] num;
    private int sum = 0;

    public FindEvenSum(int[] vInteger) {
        this.num = vInteger;
    }

    public int[] getNum() {
        return num;
    }

    public void setNum(int[] num) {
        this.num = num;
    }

    public int sumEven() {
        sum = 0; // Resetando a soma para evitar valores acumulados em múltiplas execuções
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) { // Corrigido para somar os números pares
                sum += num[i];
            }
        }
        return sum;
    }
}
```

## Exemplo de Execução

Entrada do usuário:

```
Enter 5 integer numbers:
Value 1: 3
Value 2: 8
Value 3: 4
Value 4: 7
Value 5: 2
```

Saída no console:

```
The sum of the even numbers entered is: 14.
```
