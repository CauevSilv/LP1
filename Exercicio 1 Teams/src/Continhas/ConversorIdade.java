package Continhas;

import java.util.Scanner;

public class ConversorIdade {
    public static void exercicio7(){
        System.out.println("\nInforme sua idade em anos. ");
        Scanner scanner = new Scanner(System.in);
        int idadeAnos = scanner.nextInt();
        System.out.println("\nInforme a quantidade de meses desde o seu ultimo aniversário.");
        int mesQtd = scanner.nextInt();
        System.out.println("\nInforme a quantidade de dias desde o dia do seu nascimento nesse mês.");
        int diasQtd = scanner.nextInt();
        diasQtd += (mesQtd * 30) + (idadeAnos * 365);
        System.out.println(diasQtd);
    }
}
