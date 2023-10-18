package org.example.atividades;
import java.util.Random;
import java.util.ArrayList;

public class E85 {
    public static void e85() {
        Random rng = new Random();
        double tempMin = 0;
        double tempMax = 40;
        double menor = 100;
        double maior = 0;
        double soma = 0;
        double[] temp = new double[365];
        
        for (int i = 0; i < temp.length; i++) {
            temp[i] = rng.nextDouble(tempMax - tempMin) + tempMin;
            if (temp[i] < menor) {
                menor = temp[i];
            }
            if (temp[i] > maior) {
                maior = temp[i];
            }
            soma+= temp[i];
        }
        
        double media = soma/365;
        int inferiorMedia = 0;
        
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] < media) {
                inferiorMedia++;
            }
        }
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Maior temperatura: " + maior);
        System.out.println("Temperatura media: " + media);
        System.out.println("#Dias abaixo da media: " + inferiorMedia);
    }
}
