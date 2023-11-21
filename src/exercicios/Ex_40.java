package exercicios;

import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_40 implements Exercicio {
    @Override
    public void executar() {
        System.out.println("40) Calcular e escrever o total, o desconto e o total a pagar.");

        try (Scanner scanner = new Scanner(System.in)) {
            String nomeProduto = VerificadorInput.inputTexto(scanner, "Descrição do produto: ");
            int quantidade = VerificadorInput.inputValido(scanner, "Quantidade adquirida: ");
            double precoUnitario = VerificadorInput.inputValido(scanner, "Preço unitário: ");

            double total = quantidade * precoUnitario;
            double desconto;

            if (quantidade <= 5) {
                desconto = 0.02 * total;
            } else if (quantidade <= 10) {
                desconto = 0.03 * total;
            } else {
                desconto = 0.05 * total;
            }

            double totalPagar = total - desconto;

            System.out.println("Total a pagar" + totalPagar);

        } catch (InputMismatchException e) {
            System.out.println("Entrada errada");
        }
    }
}
