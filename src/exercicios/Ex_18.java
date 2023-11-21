package exercicios;

import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_18 implements Exercicio {
    @Override
    public void executar() {
        System.out.println("18) Ler o ano atual e o ano de nascimento e verificar se a pessoa pode votar este ano.");

        try (Scanner scanner = new Scanner(System.in)) {
            int anoAtual = VerificadorInput.inputValido(scanner, "Ano atual: ");
            int anoNascimento = VerificadorInput.inputValido(scanner, "Ano de nascimento: ");

            int idade = anoAtual - anoNascimento;


            if (idade >= 16) {
                System.out.println("Pode votar " + idade);
            } else {
                System.out.println("Não pode votar. Idade: " +idade );
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida");
        }
    }
}
