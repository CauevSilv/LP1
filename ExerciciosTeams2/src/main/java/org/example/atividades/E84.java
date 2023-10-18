package org.example.atividades;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class E84 {
    public static void e84() {
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();
        System.out.println("Digite o tamanho da lista");
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] soma = new int[N];
        
        for (int i = 0; i < A.length; i++) {
            A[i] = rng.nextInt(51);
            B[i] = rng.nextInt(51);
            soma[i] = A[i] + B[i];
        }
        System.out.println("vetor A: "+ Arrays.toString(A));
        System.out.println("vetor B: " + Arrays.toString(B));    
        System.out.println("vetor soma:" + Arrays.toString(soma));
    }
}
