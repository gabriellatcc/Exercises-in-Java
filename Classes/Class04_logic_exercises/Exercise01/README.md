# Programa de Cálculo de Reajuste Salarial

Este programa em Java solicita ao usuário o salário atual, calcula um aumento de 25% e exibe o novo valor no console.

## Como o Programa Funciona

1. O programa solicita ao usuário que insira o salário atual.
2. A classe `NewSalary` é usada para calcular o novo salário com um aumento de **25%**.
3. O resultado do novo salário é exibido na tela.

## Código-Fonte

### Classe `Main.java`

```java
package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currentSalary;
        Scanner e = new Scanner(System.in);
        System.out.println("Enter your current salary: ");
        currentSalary = e.nextInt();

        NewSalary test01 = new NewSalary(currentSalary);
        System.out.println("The value of your new salary is: " + test01.calculateIncrease());
    }
}
```

### Classe `NewSalary.java`

```java
package main;

class NewSalary {
    private double currentSalary;
    private double newSalary;

    public NewSalary(int currentSalary) {
        this.currentSalary = currentSalary;
    }

    public double getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(double currentSalary) {
        this.currentSalary = currentSalary;
    }

    public double getNewSalary() {
        return this.newSalary;
    }

    public void setNewSalary() {
        this.newSalary = newSalary;
    }

    public double calculateIncrease() {
        this.newSalary = this.currentSalary * 1.25;
        return this.newSalary;
    }
}
```

## Exemplo de Execução

Entrada do usuário:

```
Enter your current salary:
2000
```

Saída no console:

```
The value of your new salary is: 2500.0
```
