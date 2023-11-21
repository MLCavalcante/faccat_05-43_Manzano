package exercicios;

import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_30 implements Exercicio {
    @Override
    public void executar() {
        System.out.println("30) Ler 3 valores (considere que não serão informados valores iguais) e escrever em ordem crescente.");

        try (Scanner scanner = new Scanner(System.in)) {
            int valor1 = VerificadorInput.inputValido(scanner, "valor 1: ");
            int valor2 = VerificadorInput.inputValido(scanner, "valor 2: ");
            int valor3 = VerificadorInput.inputValido(scanner, "valor 3: ");



            if (valor1 != valor2 && valor1 != valor3 && valor2 != valor3) {
                int menor = Math.min(Math.min(valor1, valor2), valor3);
                int maior = Math.max(Math.max(valor1, valor2), valor3);
                int medio = valor1 + valor2 + valor3 - menor - maior;

                System.out.println("Valores em ordem crescente: " + menor + ", " + medio + ", " + maior);
            } else {
                System.out.println("Valores iguais!!!!");
            }


        } catch (InputMismatchException e) {
            System.out.println("entrada inválida");
        }
    }
}
