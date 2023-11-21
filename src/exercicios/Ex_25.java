package exercicios;

import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_25 implements Exercicio {
    @Override
    public void executar() {
        System.out.println("25) Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e\n" +
                "escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior\n" +
                "ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.");

        try (Scanner scanner = new Scanner(System.in)) {
            int numeroConta = VerificadorInput.inputValido(scanner, "Número da Conta: ");
            double saldo = VerificadorInput.inputValido(scanner, "Saldo: ");
            double debito = VerificadorInput.inputValido(scanner, "Débito: ");
            double credito = VerificadorInput.inputValido(scanner, "Crédito: ");

            double saldoAtual = saldo - debito + credito;

            if (saldoAtual >= 0) {
                System.out.println("Saldo Positivo de " + saldoAtual+ " | conta: " + numeroConta);
            } else {
                System.out.println("Saldo Negativo de " + saldoAtual+ " | conta: " + numeroConta);
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Insira apenas números.");
        }
    }
}

