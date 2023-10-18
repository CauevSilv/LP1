package org.example.atividades;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

public class E83 {
    public static void e83() {
        int[] lista = new int[20];
        int[] listaInversa = new int[20];
        Random rng = new Random();
        
        int inversaInd = 19;
        for (int i = 0; i < lista.length; i++) {
            lista[i] = rng.nextInt(101);
            listaInversa[inversaInd - i] = lista[i];
        }
        System.out.println("vetor normal: " + Arrays.toString(lista));
        System.out.println("vetor inverso: " + Arrays.toString(listaInversa));
    }

}
