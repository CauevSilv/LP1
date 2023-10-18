package org.example.atividades;

import java.util.Scanner;

public class E82 {
    public static void e82(){
        Scanner input = new Scanner(System.in);

        int tamanhoVetor = 10;
        double[] vetorA = new double[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite o elemento " + (i + 1) + "° do vetor A: ");
            vetorA[i] = input.nextDouble();
        }
        System.out.print("Digite o valor de X: ");
        double X = input.nextDouble();
        double[] vetorM = new double[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            vetorM[i] = vetorA[i] * X;
        }
        System.out.println("Vetor M (resultante):");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println(vetorM[i]);
        }

        input.close();


    }
}
