package Continhas;

import java.util.InputMismatchException;

public class InversaoVariavel {
    public static void Exercicio1() throws InputMismatchException {
        int a = 10;
        int b = 20;
        int temp;

         temp = a;
         a=b;
         b = temp;
        System.out.println(a + "<--A B-->"+ b);
    }
}