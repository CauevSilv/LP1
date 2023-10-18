package org.example.atividades;

import java.util.Arrays;
import java.util.Random;


public class E87 {
    public static void e87() {
        Random rng = new Random();
        int[] vetor = new int[11];
        
        for (int i = 0; i < 10; i++) {
            vetor[i] = rng.nextInt(51);
        }
        System.out.println("Lista Inicial: " + Arrays.toString(vetor));
        
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 1; j < vetor.length-i; j++) {
                if (vetor[j-1] > vetor[j]) {
                    int aux = vetor[j-1];
                    vetor[j-1] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        System.out.println("Lista Final: " + Arrays.toString(vetor));
        int numero = rng.nextInt(51);
        System.out.println("Adição de mais um valor: " + numero);

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 1; j < vetor.length-i; j++) {
                if (vetor[j-1] == 0) {
                    vetor[j-1] = numero;
                }
                if (vetor[j-1] > vetor[j]) {
                    int aux = vetor[j-1];
                    vetor[j-1] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        System.out.println("Lista Final com mais um valor:" + Arrays.toString(vetor));
    }
}
