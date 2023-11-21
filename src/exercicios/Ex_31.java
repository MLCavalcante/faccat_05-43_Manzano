package exercicios;

import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_31 implements Exercicio {
    @Override
    public void executar() {
        System.out.println("31) Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.");

        try (Scanner scanner = new Scanner(System.in)) {
            int a = VerificadorInput.inputValido(scanner, "A: ");
            int b = VerificadorInput.inputValido(scanner, "B: ");
            int c = VerificadorInput.inputValido(scanner, "C: ");

            if (a < b + c && b < a + c && c < a + b) {
                System.out.println("Forma um triângulo.");
            } else {
                System.out.println("Não forma um triângulo.");
            }

        } catch (InputMismatchException e) {
            System.out.println("entrada inválida");
        }
    }
}
