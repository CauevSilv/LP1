package org.example.atividades;

import java.util.Random;
import java.util.Arrays;

public class E91 {
    public static void e91() {
        Random rng = new Random();
        int[] vet = new int[50];
        
        for (int i = 0; i < vet.length; i++) {
            vet[i] = rng.nextInt(50) + 1;
        }
        
        System.out.println("Lista: " + Arrays.toString(vet));
        boolean repeat = false;
        boolean[] posicoesRepetidas = new boolean[50];
        int repetidos = 0;

        if (repetidos > 0) {
            System.out.println("Números repetidos e suas posições");
            for (int i = 0; i < vet.length; i++) {
                if (posicoesRepetidas[i]) {
                    System.out.println("Número: " + vet[i] + ", Posição: " + (i + 1));
                }
            }
        } else {
            System.out.println("Não há números repetidos.");
        }

        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < i; j++) {
                if (vet[i] == vet[j]) {
                    posicoesRepetidas[i] = true;
                    repetidos++;
                    break;
                }
            }
        }
        

    }
}
