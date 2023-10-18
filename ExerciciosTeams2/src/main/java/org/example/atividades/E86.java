package org.example.atividades;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class E86 {
    public static void e86() {
        Random rng = new Random();
        int[] vetor = new int[10];
        
        for (int i = 0; i < vetor.length; i++) {
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
    }

}
