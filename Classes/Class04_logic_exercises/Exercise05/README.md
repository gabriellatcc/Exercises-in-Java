# Programa de Tabela de Multiplicação

Este programa em Java solicita ao usuário um número inteiro e exibe a **tabela de multiplicação de 1 até esse número**.

## Como o Programa Funciona

1. O usuário insere um número inteiro.
2. A classe `MultiplicationTable1toN` gera a tabela de multiplicação desse número.
3. A tabela é exibida no console.

## Código-Fonte

### Classe `Main.java`

```java
package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any integer number to see the multiplication table from 1 to the number: ");
        int num = s.nextInt();

        MultiplicationTable1toN test01 = new MultiplicationTable1toN(num);
        System.out.println("Multiplication table from 1 to " + num + ": \n" + test01.doMultiplicationTable());
    }
}
```

### Classe `MultiplicationTable1toN.java`

```java
package main;

class MultiplicationTable1toN {
    private int number;
    private final String[] answer;

    public MultiplicationTable1toN(int num) {
        this.number = num;
        answer = new String[num * num];
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String doMultiplicationTable() {
        int index = 0;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                answer[index] = i + " * " + j + " = " + (i * j);
                index++;
            }
        }
        return String.join("\n", answer);
    }
}
```

## Exemplo de Execução

Entrada do usuário:

```
Enter any integer number to see the multiplication table from 1 to the number:
3
```

Saída no console:

```
Multiplication table from 1 to 3:
1 * 1 = 1
1 * 2 = 2
1 * 3 = 3
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
3 * 1 = 3
3 * 2 = 6
3 * 3 = 9
```
