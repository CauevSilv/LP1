package org.example.atividades;

import java.util.Scanner;

public class E81 {
    public static void e81(){
            Scanner input = new Scanner(System.in);
            int tamanhoVetor = 10;
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

            double menorElemento = vetorQ[0];
            int posicaoMenor = 0;

            for (int i = 1; i < tamanhoVetor; i++) {
                if (vetorQ[i] < menorElemento) {
                    menorElemento = vetorQ[i];
                    posicaoMenor = i;
                }
            }

            System.out.println("Menor elemento: " + menorElemento);
            System.out.println("Posição no vetor: " + (posicaoMenor + 1));

            input.close();

    }
}
