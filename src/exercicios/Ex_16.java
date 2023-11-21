package exercicios;

import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_16 implements Exercicio{
    @Override
    public void executar() {
        System.out.println("16) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem\n" +
                "compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e\n" +
                "escreva o custo total da compra.");

        try (Scanner scanner = new Scanner(System.in)) {

            int macas = VerificadorInput.inputValido(scanner, "Maçãs: ");

            if ( macas < 12) {
                double preco = 1.30;
                System.out.println("TOTAL: " + (macas * preco));
            } else if (macas >= 12) {
                double preco = 1.00;
                System.out.println("TOTAL: " + (macas * preco));
            }
        }catch (InputMismatchException e){
            System.out.println("INVÁLIDO");

        }
    }
}
