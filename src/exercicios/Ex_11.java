package exercicios;

import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_11 implements Exercicio {
    @Override
    public void executar() {
        System.out.println("11) Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,\n" +
                "mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele\n" +
                "efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas\n" +
                "vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do\n" +
                "vendedor.");

        try (Scanner scanner = new Scanner(System.in)) {
            int carrosVendidos = VerificadorInput.inputValido(scanner, "Número de carros vendidos: ");
            double totalVendas = VerificadorInput.inputValido(scanner, "Valor total das vendas: ");
            double salario = VerificadorInput.inputValido(scanner, "Salario fixo: ");
            double valorPorCarroVendido = VerificadorInput.inputValido(scanner, "Valor por carro vendido: ");

            double salarioFinal = calcularSalarioFinal(carrosVendidos, totalVendas, salario, valorPorCarroVendido);
            System.out.println("Salário Final do Vendedor: " + salarioFinal);
        } catch (InputMismatchException e) {
            System.out.println("VALOR INVÁLIDO!");
        }
    }

    private static double calcularSalarioFinal(int carrosVendidos, double totalVendas, double salario, double valorPorCarroVendido) {
        double comissaoPorVendas = 0.05 * totalVendas;

        double comissaoPorCarroVendido = carrosVendidos * valorPorCarroVendido;

        double salarioFinal = salario + comissaoPorVendas + comissaoPorCarroVendido;

        return salarioFinal;
    }
}
