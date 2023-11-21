package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_28 implements Exercicio {
    @Override
    public void executar() {
        System.out.println("28) Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Primeiro valor: ");
            int valor1 = scanner.nextInt();

            System.out.println("Segundo valor: ");
            int valor2 = scanner.nextInt();

            System.out.println("Terceiro valor: ");
            int valor3 = scanner.nextInt();

            if (valor1 > valor2 && valor1 > valor3) {
                System.out.println("Maior: " + valor1);
            } else if (valor2 > valor3) {
                System.out.println("Maior: " + valor2);
            } else {
                System.out.println("Maior: " + valor3);
            }

        } catch (InputMismatchException e) {
            System.out.println("INVÁLIDO");
        }
    }
}
