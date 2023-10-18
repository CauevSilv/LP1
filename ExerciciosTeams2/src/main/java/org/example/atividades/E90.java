package org.example.atividades;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class E90 {
    public static void e90() {
        Random rng = new Random();
        int[] lista = new int[30];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < lista.length; i++) {
            lista[i] = rng.nextInt(30) + 1;
        }
        
        System.out.println("Lista: " + Arrays.toString(lista));
        System.out.println("Digite um número para buscar na lista");
        int numero = sc.nextInt();
        int numeroCount = 0;
        
        for (int i = 0; i < lista.length; i++) {
            if (numero == lista[i]) {
                numeroCount++;
            }
        }
        System.out.println("O número " + numero + " aparece " + numeroCount + " vezes na lista");
    }
}
