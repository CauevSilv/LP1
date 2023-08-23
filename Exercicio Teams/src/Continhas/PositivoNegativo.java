package Continhas;

import java.util.Scanner;

public class PositivoNegativo {
    public static void positivoNegativo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um número qualquer, para verificar se ele é positivo ou negativo.");
        int numero = scanner.nextInt();
        if(numero <0){
            System.out.println("Esse número é negativo.");
        } else {
            System.out.println("Esse número é positivo.");
        }

    }
}
