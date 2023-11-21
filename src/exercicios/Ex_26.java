package exercicios;

import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_26 implements Exercicio {
    @Override
    public void executar() {
        System.out.println("26) Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e\n" +
                "quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade\n" +
                "média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual\n" +
                "a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar\n" +
                "compra'.");

        try (Scanner scanner = new Scanner(System.in)) {
            int qAtual = VerificadorInput.inputValido(scanner, "Quantidade Atual: ");
            int qMax = VerificadorInput.inputValido(scanner, "Quantidade Máxima: ");
            int qMin = VerificadorInput.inputValido(scanner, "Quantidade Mínima: ");

            double quantidadeMedia = (qMax + qMin) / 2.0;
            System.out.println("Quantidade Média: " + quantidadeMedia);

            if (qAtual >= quantidadeMedia) {
                System.out.println("Não efetuar compra");
            } else {
                System.out.println("Efetuar compra");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida");
        }
    }
}
