package Continhas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraDeMedia {
    public static void calculadoraDeMedia() throws InputMismatchException {
        try {
            System.out.println("Informe a nota da primeira nota.");
            Scanner scanner = new Scanner(System.in);
            double nota1 = scanner.nextDouble();
            System.out.println("Escreva agora a nota da primeira nota");
            double nota2 = scanner.nextDouble();

            double media = (nota1 + nota2) / 2;
            if (media >= 6) {
                System.out.println("Aluno aprovado!\nCom média " + media);
            } else {
                System.out.println("Aluno reprovado.\nCom média " + media);
            }
        }catch (InputMismatchException e){
            
        }
    }
}
