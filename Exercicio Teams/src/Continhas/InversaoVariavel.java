package Continhas;

public class InversaoVariavel {
    public static void Exercicio1() {
        int a = 10;
        int b = 20;
        int temp;

         temp = a;
         a=b;
         b = temp;
        System.out.println(a + "<--A B-->"+ b);
    }
}