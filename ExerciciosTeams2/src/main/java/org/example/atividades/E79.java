package org.example.atividades;

import java.util.Scanner;

public class E79 {
    public static void e79(){
        Scanner input = new Scanner(System.in);

        // Tamanho da turma
        int tamanhoTurma = 20;

        // Array para armazenar as notas dos alunos
        double[] notas = new double[tamanhoTurma];

        // Variável para armazenar a soma das notas
        double somaNotas = 0;

        // Ler as notas dos alunos
        for (int i = 0; i < tamanhoTurma; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = input.nextDouble();
            somaNotas += notas[i];
        }

        // Calcular a média da turma
        double mediaTurma = somaNotas / tamanhoTurma;

        // Contar quantos alunos obtiveram nota acima da média
        int alunosAcimaMedia = 0;
        for (int i = 0; i < tamanhoTurma; i++) {
            if (notas[i] > mediaTurma) {
                alunosAcimaMedia++;
            }
        }

        // Exibir a média da turma e o resultado da contagem
        System.out.println("Média da turma: " + mediaTurma);
        System.out.println("Alunos com nota acima da média: " + alunosAcimaMedia);

        input.close();
    }
}

