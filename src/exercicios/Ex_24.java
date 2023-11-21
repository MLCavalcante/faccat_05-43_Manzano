package exercicios;

import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_24 implements Exercicio {
    @Override
    public void executar() {
        System.out.println("24) Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que\n" +
                "ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que\n" +
                "ultrapassar este valor, calcular e escrever o seu salário total.");

        try (Scanner scanner = new Scanner(System.in)) {
            double salarioFixo = VerificadorInput.inputValido(scanner, "Salário Fixo: ");
            double vendas = VerificadorInput.inputValido(scanner, "Valor das Vendas: ");

            double comissao;
            if (vendas <= 1500) {
                comissao = 0.03 * vendas;
            } else {
                comissao = 0.03 * 1500 + 0.05 * (vendas - 1500);
            }

            double salarioTotal = salarioFixo + comissao;
            System.out.println("Salário Total: " + salarioTotal);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Insira apenas números.");
        }
    }
}

