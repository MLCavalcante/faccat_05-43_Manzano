package exercicios;

import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_20 implements Exercicio {
    @Override
    public void executar() {
        System.out.println("20) Ler dois valores e escrevê-los em ordem crescente.");

        try (Scanner scanner = new Scanner(System.in)) {
            double valor1 = VerificadorInput.inputValido(scanner, "Primeiro valor: ");
            double valor2 = VerificadorInput.inputValido(scanner, "Segundo valor: ");

            if (valor1 < valor2) {
                System.out.println("Valores em ordem crescente: " + valor1 + ", " + valor2);
            } else {
                System.out.println("Valores em ordem crescente: " + valor2 + ", " + valor1);
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Insira apenas números.");
        }
    }
}

