import Continhas.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int opcao = 1;
        while (opcao != 0) {

            System.out.println("""
                \n--------Bem vindo aos exercícios de LP1 kk--------
                Informe o número do exercício que deseja ver rodando
                2 - Subtração (1)

                Informe 0 para sair
                """);
            opcao = scanner.nextInt();
            switch (opcao) {
//                case 1 -> InversaoVariavel.Exercicio1();
                case 2 -> Divisao.Exercicio5();
//                case 3 -> AreaRetangulo.exercico6();
//                case 4 -> ConversorIdade.exercicio7();
//                case 5 -> PorcentagemVotacao.Exercicio8();
//                case 6 -> MaiorMenor.MaiorMenor();
//                case 7 -> PositivoNegativo.positivoNegativo();
//                case 8 -> QualMaior.qualMaior();
//                case 9 -> CalculadoraDeMedia.calculadoraDeMedia();
//                case 10 ->ReajusteSalario.reajusteSalario();
            }

        }
    }
}
