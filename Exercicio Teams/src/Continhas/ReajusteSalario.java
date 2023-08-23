package Continhas;

import java.util.Scanner;

public class ReajusteSalario {
    public static void reajusteSalario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu salário atual.");
        double salarioAtual = scanner.nextDouble();
        System.out.println("Qual será a taxa de reajuste em %? (Informe somente o número, sem a %)");
        double reajuste = scanner.nextDouble();
         reajuste = (reajuste/100) * salarioAtual;
         double novoSalario = reajuste + salarioAtual;
        System.out.println(novoSalario);
    }
}
