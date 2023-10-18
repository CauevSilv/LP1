package Continhas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaRetangulo {
    public static void exercico6() throws InputMismatchException {
        double comprimento;
        double altura;
        System.out.println("Informe o comprimento do retângulo, em m²(Não precisa colocar a unidade de medida):");
        Scanner scanner = new Scanner(System.in);
        comprimento = scanner.nextDouble();
        System.out.println("Agora, informe a altura do retângulo, em m²(Sem unidade)");
        altura = scanner.nextDouble();
        System.out.println("A área do retãngulo em questão é " + comprimento * altura);
    }
}
