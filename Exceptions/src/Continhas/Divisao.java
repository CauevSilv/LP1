package Continhas;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
    public static void Exercicio5() throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escreva um numero.:");
            int valor = scanner.nextInt();
            System.out.println("Entre com outro número");
            int valorX = scanner.nextInt();
            int ram = valor/valorX;
            System.out.println("O resultado é "+ram);

        }catch (InputMismatchException e){
            System.out.println("Só são aceitos números inteiros!");
        }catch (ArithmeticException e){
            System.out.println("Ainda não sabemos dividir por 0.");
        }finally {
            System.out.println("Fim!");
        }

        }
    }

