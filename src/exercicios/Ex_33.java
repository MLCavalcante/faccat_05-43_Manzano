package exercicios;

import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_33 implements Exercicio {
    @Override
    public void executar() {
        System.out.println("33) Ler dois valores e imprimir uma das três mensagens a seguir: ‘Números iguais’, caso os números sejam iguais; ‘Primeiro é maior’, caso o primeiro seja maior que o segundo; ‘Segundo é maior’, caso o segundo seja maior que o primeiro.");

        try (Scanner scanner = new Scanner(System.in)) {
            int num1 = VerificadorInput.inputValido(scanner, "valor1: ");
            int num2 = VerificadorInput.inputValido(scanner, "valor2: ");

            if (num1 == num2) {
                System.out.println("Números iguais.");
            } else if (num1 > num2) {
                System.out.println("Primeiro é maior.");
            } else {
                System.out.println("Segundo é maior.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida");
        }
    }
}
