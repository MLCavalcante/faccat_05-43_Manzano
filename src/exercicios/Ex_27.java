package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_27 implements Exercicio {
    @Override
    public void executar() {
        System.out.println("27) Ler um valor e escrever se é positivo, negativo ou zero.");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite um valor: ");
            int valor = scanner.nextInt();

            if (valor > 0) {
                System.out.println("Positivo");
            } else if (valor < 0) {
                System.out.println("Negativo");
            } else {
                System.out.println("Zero");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida!");
        }
    }
}

