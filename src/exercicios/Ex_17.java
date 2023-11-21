package exercicios;

import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_17 implements Exercicio {
    @Override
    public void executar() {
        System.out.println(" Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever\n" +
                "uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o\n" +
                "aluno é aprovado). Escrever também a média calculada.");

        try (Scanner scanner = new Scanner(System.in)) {
            double nota1 = VerificadorInput.inputValido(scanner, "Nota da 1a. avaliação: ");
            double nota2 = VerificadorInput.inputValido(scanner, "Nota da 2a. avaliação: ");

            double media = (nota1 + nota2) / 2;

            if (media >= 6) {
                System.out.println("Aluno aprovado! Media: " + media);
            } else {
                System.out.println("Aluno reprovado. Media: " + media);
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Insira apenas números.");
        }
    }
}