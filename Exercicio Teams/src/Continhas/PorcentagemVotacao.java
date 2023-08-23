package Continhas;

import java.util.Scanner;

public class PorcentagemVotacao {
    public static void Exercicio8() {
        Scanner scanner = new Scanner(System.in);
        int validos;
        System.out.println("Quantos eleitores sua cidade possui?");
        int populacao = scanner.nextInt();
        System.out.println("Qual a quantidade de votos nulos que houve nessa eleição? ");
        int nulo = scanner.nextInt();
        System.out.println("Quantos votos em branco?");
        int branco = scanner.nextInt();

        float porcentagemBranco = (branco * 100)/populacao;
        float porcentagemNulo = (nulo * 100)/populacao;
        System.out.println("% branco " + porcentagemBranco + "%");
        System.out.println("% nulo " + porcentagemNulo +"%");





    }
}
