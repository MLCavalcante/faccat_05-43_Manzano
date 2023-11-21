package exercicios;

import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_13 implements Exercicio {
    @Override
    public void executar() {
        System.out.println("13) Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.\n" +
                "Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média\n" +
                "final é:\n" +
                " n1 * 2 + n2 * 3 + n3 * 5\n" +
                " mediafinal = -----------------------------------\n" +
                " 10");

        try (Scanner scanner = new Scanner(System.in)) {
            double nota1 = VerificadorInput.inputValido(scanner, "Nota 1: ");
            double nota2 = VerificadorInput.inputValido(scanner, "Nota 2: ");
            double nota3 = VerificadorInput.inputValido(scanner, "Nota 3: ");

            double mediaFinal = calcularMediaPonderada(nota1, nota2, nota3);
            System.out.println("Média Final: " + mediaFinal);
        } catch (InputMismatchException e) {
            System.out.println("VALOR INVÁLIDO!");
        }
    }

    private static double calcularMediaPonderada(double nota1, double nota2, double nota3) {
        return (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
    }
}
