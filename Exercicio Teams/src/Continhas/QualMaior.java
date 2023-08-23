package Continhas;

import java.util.Scanner;

public class QualMaior {
    public static void qualMaior() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um valor.");
        int numero1 = scanner.nextInt();
        System.out.println("Escreva outro valor.");
        int numero2 = scanner.nextInt();
        if(numero1 > numero2){
            System.out.println(numero1 + " é maior que " + numero2);
        }else {
            System.out.println(numero2 + " é maior que " + numero1);
        }

    }
}
