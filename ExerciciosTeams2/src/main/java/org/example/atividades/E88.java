package org.example.atividades;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;


public class E88 {
    public static void e88() {
        Random rng = new Random();
        int[] lista = rng.ints(1, 51).distinct().limit(20).toArray();
        System.out.println("Lista: " + Arrays.toString(lista));
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para verificar na lista: ");
        int numero = sc.nextInt();
        
        int[] novaLista = new int[19];
        int novaListaIndex = 0;
        boolean encontrado = false;
        
        for (int numeros:lista) {
            if (numero == numeros) {
                encontrado = true;
            }
        }
        
        if (encontrado) {
            for (int i = 0; i < lista.length; i++) {
                if (lista[i] != numero) {
                    novaLista[novaListaIndex] = lista[i];
                    novaListaIndex++;
                }
            }
            System.out.println("Nova Lista: " + Arrays.toString(novaLista));
        } else {
            System.out.println("O número não está na lista");
        }
    }
}
