package org.example.atividades;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class E89 {
    public static void e89() {
        Random rng = new Random();
        int[] v1 = new int[15];
        int[] v2 = new int[15];
        
        for (int i = 0; i < v1.length; i++) {
            int numv1 = rng.nextInt(20) + 1;
            int numv2 = rng.nextInt(20) + 1;
            v1[i] = numv1;
            v2[i] = numv2;            
        }
        
        System.out.println("Vetor 1: " + Arrays.toString(v1));
        System.out.println("Vetor 2: " + Arrays.toString(v2));
        
        int igualValorPosicao = 0;
        
        for (int i = 0; i < v1.length; i++) {
            if (v1[i] == v2[i]) {
                igualValorPosicao++;
            }
        }
        System.out.println("Quantidade de vezes que V1 e V2 têm mesmos números nas mesmas posições:" + igualValorPosicao);
    }
}
