package Continhas;

import java.util.Scanner;

public class MaiorMenor {
    public static void MaiorMenor() {
//        Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso
//        contrário escrever NÃO É MAIOR QUE 10!
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um valor");
        int valor = scanner.nextInt();
        if(valor < 10){
            System.out.println("É MENOR QUE 10!");
        }if(valor == 10){
            System.out.println("É IGUAL A 10!");
        }else{
            System.out.println("É MAIOR QUE 10!");
        }

    }
}
