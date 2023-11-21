package exercicios;

import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_29 implements Exercicio {
    @Override
    public void executar() {
        System.out.println("29) Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.");

        try (Scanner scanner = new Scanner(System.in)) {
            int valor1 = VerificadorInput.inputValido(scanner, "valor 1: ");
            int valor2 = VerificadorInput.inputValido(scanner, "valor 2: ");
            int valor3 = VerificadorInput.inputValido(scanner, "valor 3: ");


            if (valor1 != valor2 && valor1 != valor3 && valor2 != valor3) {
                int somaDosMaiores = 0;

                if (valor1 > valor2 && valor1 > valor3) {
                    somaDosMaiores = valor1 + Math.max(valor2, valor3);
                } else if (valor2 > valor1 && valor2 > valor3) {
                    somaDosMaiores = valor2 + Math.max(valor1, valor3);
                } else {
                    somaDosMaiores = valor3 + Math.max(valor1, valor2);
                }

                System.out.println("Soma dos 2 maiores valores: " + somaDosMaiores);
            } else {
                System.out.println("Valores iguais!");
            }

        } catch (InputMismatchException e) {
            System.out.println("entrada inválida");
        }
    }
}