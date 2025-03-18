# Programa de soma de dois números

Este programa em Java solicita ao usuário dois números inteiros, realiza a soma deles e exibe o resultado no console.

## Como o programa funciona

1. O programa solicita ao usuário que digite dois números inteiros.
2. Os valores inseridos são armazenados em variáveis.
3. O programa realiza a soma dos dois números.
4. O resultado da soma é exibido na tela.

## Código-Fonte

```java
package main;
import java.util.Scanner;

public class Main {
    private int num1, num2, sum;
    private Scanner e;

    public Main() {
        num1 = num2 = 0;
        e = new Scanner(System.in);
    }

    public void readValues() {
        System.out.println("Enter num1: ");
        num1 = e.nextInt();
        System.out.println("Enter num2: ");
        num2 = e.nextInt();
    }

    public void sumCalculation() {
        sum = num1 + num2;
    }

    public void printSum() {
        System.out.println("Sum of num1 and num2: " + sum);
    }

    public static void main(String[] args) {
        Main test01 = new Main();
        test01.readValues();
        test01.sumCalculation();
        test01.printSum();
    }
}
```

## Exemplo de Execução

Entrada do usuário:

```
Enter num1:
5
Enter num2:
7
```

Saída no console:

```
Sum of num1 and num2: 12
```
