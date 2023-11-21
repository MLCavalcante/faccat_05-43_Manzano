package exercicios;

import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_36 implements Exercicio {
    @Override
    public void executar() {
        System.out.println("36) Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres.");
        System.out.println("Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova,");
        System.out.println("e o produto das idades do homem mais novo com a mulher mais velha.");

        try (Scanner scanner = new Scanner(System.in)) {
            int idadeHomem1 = VerificadorInput.inputValido(scanner, "Idade do primeiro homem: ");
            int idadeHomem2 = VerificadorInput.inputValido(scanner, "Idade do segundo homem: ");
            int idadeMulher1 = VerificadorInput.inputValido(scanner, "Idade da primeira mulher: ");
            int idadeMulher2 = VerificadorInput.inputValido(scanner, "Idade da segunda mulher: ");

            int somaIdades = Math.max(idadeHomem1, idadeHomem2) + Math.min(idadeMulher1, idadeMulher2);
            int produtoIdades = Math.min(idadeHomem1, idadeHomem2) * Math.max(idadeMulher1, idadeMulher2);

            System.out.println("homem mais velho + mulher mais nova: " + somaIdades);
            System.out.println("produto das idades do homem + mulher mais velha: " + produtoIdades);

        } catch (InputMismatchException e) {
            System.out.println("entrada inválida");
        }
    }
}
