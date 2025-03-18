# Programa de Cálculo da Área de um Triângulo

Este programa em Java solicita ao usuário os valores da base e da altura de um triângulo, calcula sua área e exibe o resultado no console.

## Como o Programa Funciona

1. O programa solicita ao usuário que insira os valores da **base** e da **altura** do triângulo.
2. A classe `TriangleArea` é utilizada para armazenar os valores e calcular a área.
3. A área do triângulo é calculada usando a fórmula:
   ```
   área = (base * altura) / 2
   ```
4. O resultado da área é exibido na tela.

## Código-Fonte

### Classe `Main.java`

```java
package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner v1 = new Scanner(System.in);
        Scanner v2 = new Scanner(System.in);

        System.out.println("To calculate the area of a triangle, enter:");
        System.out.println("a). Base value: ");
        double num1 = v1.nextDouble();
        System.out.println("b). Height value: ");
        double num2 = v2.nextDouble();

        TriangleArea test01 = new TriangleArea(num1, num2);
        test01.calculateArea();
        test01.printArea();
    }
}
```

### Classe `TriangleArea.java`

```java
package main;

class TriangleArea {
    private double base, height, area;

    public TriangleArea(double num1, double num2) {
        this.base = num1;
        this.height = num2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void calculateArea() {
        area = (base * height) / 2;
    }

    public void printArea() {
        System.out.println("The triangle with base " + base + " and height " + height + " has an area of " + area + ".\n");
    }
}
```

## Exemplo de Execução

Entrada do usuário:

```
To calculate the area of a triangle, enter:
a). Base value:
5
b). Height value:
10
```

Saída no console:

```
The triangle with base 5.0 and height 10.0 has an area of 25.0.
```
