# Programa de operações matemáticas

Este programa em Java solicita ao usuário dois números, realiza diversas operações matemáticas (soma, subtração, multiplicação e divisão) e exibe os resultados no console.

## Como o programa funciona

1. O programa solicita ao usuário que insira dois números.
2. São realizadas as seguintes operações matemáticas:
   - **Soma**: `num1 + num2`
   - **Subtração**: `num1 - num2`
   - **Multiplicação**: `num1 * num2`
   - **Divisão**: `num1 / num2`
3. Os resultados das operações são exibidos na tela.

## Código-Fonte

```java
package main;
import java.util.Scanner;

public class Main {
    private double num1, num2, result;
    private Scanner e;

    public Main() {
        num1 = num2 = result = 0;
        e = new Scanner(System.in);
    }

    public void readValues() {
        System.out.println("Enter any value: ");
        num1 = e.nextDouble();
        System.out.println("Enter another value: ");
        num2 = e.nextDouble();
    }

    public void sumCalculation() {
        result = num1 + num2;
    }

    public void subtractionCalculation() {
        result = num1 - num2;
    }

    public void multiplicationCalculation() {
        result = num1 * num2;
    }

    public void divisionCalculation() {
        result = num1 / num2;
    }

    public void printResult() {
        System.out.println("Result = " + result);
        System.out.printf("Result = %.2f\n", result);
    }

    public static void main(String[] args) {
        Main test01 = new Main();
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
```

## Exemplo de Execução

Entrada do usuário:

```
Enter any value:
10
Enter another value:
2
```

Saída no console:

```
Result = 12.0
Result = 12.00
Result = 8.0
Result = 8.00
Result = 20.0
Result = 20.00
Result = 5.0
Result = 5.00
```
