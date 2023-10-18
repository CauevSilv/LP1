package org.example.atividades;

import java.util.Scanner;

public class E80 {
    public static void e80(){
        Scanner input = new Scanner(System.in);

        int tamanhoVetor = 20;
        double[] vetorQ = new double[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            do {
                System.out.print("Digite um número positivo para a posição " + (i + 1) + ": ");
                vetorQ[i] = input.nextDouble();
                if (vetorQ[i] < 0) {
                    System.out.println("Por favor, digite um número positivo.");
                }
            } while (vetorQ[i] < 0);
        }

        double maiorElemento = vetorQ[0];
        int posicaoMaior = 0;

        for (int i = 1; i < tamanhoVetor; i++) {
            if (vetorQ[i] > maiorElemento) {
                maiorElemento = vetorQ[i];
                posicaoMaior = i;
            }
        }
        System.out.println("Maior elemento: " + maiorElemento);
        System.out.println("Posição no vetor: " + (posicaoMaior + 1));

        input.close();

    }
}
