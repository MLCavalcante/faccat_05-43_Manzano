package exercicios;

import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_37 implements Exercicio {
    @Override
    public void executar() {
        System.out.println("37) Uma fruteira está vendendo frutas com a seguinte tabela de preços:");
        System.out.println("Até 5 Kg               Acima de 5 Kg");
        System.out.println("Morango R$ 2,50 por Kg  R$ 2,20 por Kg");
        System.out.println("Maçã    R$ 1,80 por Kg  R$ 1,50 por Kg");
        System.out.println("Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00,");
        System.out.println("receberá ainda um desconto de 10% sobre este total.");

        try (Scanner scanner = new Scanner(System.in)) {
            double kgMorango = VerificadorInput.inputValido(scanner, "Kg de morango: ");
            double kgMaca = VerificadorInput.inputValido(scanner, "kg de maçã: ");

            double precoMorango = (kgMorango <= 5) ? 2.50 : 2.20;
            double precoMaca = (kgMaca <= 5) ? 1.80 : 1.50;

            double totalSemDesconto = (kgMorango * precoMorango) + (kgMaca * precoMaca);
            double desconto = (totalSemDesconto > 25 || (kgMorango + kgMaca) > 8) ? 0.10 * totalSemDesconto : 0;

            double valorPagar = totalSemDesconto - desconto;

            System.out.println("Valor a ser pago pelo cliente: R$ " + valorPagar);

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida!");
        }
    }
}
