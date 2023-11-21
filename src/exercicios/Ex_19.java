package exercicios;

import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_19 implements Exercicio {
    @Override
    public void executar() {
        System.out.println("19) Ler dois valores e escrever o maior deles.");

        try (Scanner scanner = new Scanner(System.in)) {
            double valor1 = VerificadorInput.inputValido(scanner, "Primeiro valor: ");
            double valor2 = VerificadorInput.inputValido(scanner, "Segundo valor: ");

            if (valor1 > valor2) {
                System.out.println("O maior valor é o primeiro valor: " + valor1);
            } else {
                System.out.println("O maior valor é o segundo valor: " + valor2);
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida!");
        }
    }
}
