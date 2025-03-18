# Programa de leitura e exibição de um número inteiro

Este é um programa simples em Java que solicita ao usuário um número inteiro, lê esse valor e o exibe na tela de duas formas diferentes.

## Como o programa funciona

1. O programa solicita ao usuário que digite um número inteiro.
2. O valor inserido é lido e armazenado em uma variável.
3. O número é exibido na tela de duas maneiras:
   - Usando `System.out.println()`, com concatenação de strings.
   - Usando `System.out.printf()`, com formatação de saída.

## Código-Fonte

```java
package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value;
        Scanner e = new Scanner(System.in);
        System.out.println("Enter any value: ");
        value = e.nextInt();
        System.out.println("Value entered: " + value + ".\n");
        System.out.printf("Value entered: %d.\n", value);
    }
}
```

## Exemplo de Execução

Entrada do usuário:

```
Enter any value:
42
```

Saída no console:

```
Value entered: 42.

Value entered: 42.
```
