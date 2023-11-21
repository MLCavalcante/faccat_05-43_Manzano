package exercicios;
import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_41 implements Exercicio {
    @Override
    public void executar() {
        System.out.println("41) Calcular a média de aproveitamento e escrever o conceito do aluno.");

        try (Scanner scanner = new Scanner(System.in)) {
            double n1 = VerificadorInput.inputValido(scanner, "Nota 1: ");
            double n2 = VerificadorInput.inputValido(scanner, "Nota 2: ");
            double n3 = VerificadorInput.inputValido(scanner, "Nota 3: ");
            double mediaExercicios = VerificadorInput.inputValido(scanner, "Média dos exercícios: ");

            double mediaAproveitamento = (n1 + n2 * 2 + n3 * 3 + mediaExercicios) / 7;

            System.out.println("Média de Aproveitamento: " + mediaAproveitamento);

            if (mediaAproveitamento >= 9.0) {
                System.out.println(" A");
            } else if (mediaAproveitamento >= 7.5) {
                System.out.println(" B");
            } else if (mediaAproveitamento >= 6.0) {
                System.out.println(" C");
            } else {
                System.out.println(" D");
            }

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida");
        }
    }
}
