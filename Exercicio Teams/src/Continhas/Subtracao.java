package Continhas;

import java.util.Scanner;

public class Subtracao {
    public static void Exercicio5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um numero para saber seu antecessor:");
        int valor = scanner.nextInt();
        valor -= 1;
        System.out.println(valor);
    }
}
