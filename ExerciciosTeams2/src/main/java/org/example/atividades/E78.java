package org.example.atividades;

import java.util.Scanner;

public class E78 {
    public static void e78() {
        Scanner input = new Scanner(System.in);

        String[] nomes = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = input.nextLine();
        }

        System.out.print("Digite o nome a ser procurado: ");
        String nomeProcurado = input.nextLine();

        boolean encontrou = false;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomeProcurado)) {
                encontrou = true;
                break;
            }
        }

        if (encontrou) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }

        input.close();
    }
}