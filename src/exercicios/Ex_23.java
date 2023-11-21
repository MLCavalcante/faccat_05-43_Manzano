package exercicios;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_23 implements Exercicio{
    @Override
    public void executar() {
        System.out.println("23)Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa, calcule\n" +
                "e mostre seu peso ideal, utilizando as seguintes fórmulas:\n" +
                " - para sexo masculino: peso ideal = (72.7 * altura) - 58\n" +
                " - para sexo feminino: peso ideal = (62.1 * altura) - 44.7");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nome, sexo e altura: ");
            String nome = scanner.next();
            String sexo = scanner.next();
            Double altura  = scanner.nextDouble();

            double PesoIdeal;

            if (sexo.equalsIgnoreCase("M")) {
                PesoIdeal = (72.7 * altura) - 58;
                System.out.println("Peso ideal do " + nome + " : " +  PesoIdeal );
            } else if (sexo.equalsIgnoreCase("F")) {
                PesoIdeal = (62.1 * altura) - 44.7;
                System.out.println("Peso ideal da " + nome + " : " +  PesoIdeal );
            }else {
                System.out.println("INVÁLIDO");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida");
        }
    }
}
