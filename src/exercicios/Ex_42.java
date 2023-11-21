package exercicios;
import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_42 implements Exercicio {
    @Override
    public void executar() {
        System.out.println("42) Verificar se um empregado está qualificado para a aposentadoria.");

        try (Scanner scanner = new Scanner(System.in)) {
            int codigoEmpregado = VerificadorInput.inputValido(scanner, "Código do empregado (código): ");
            int anoNascimento = VerificadorInput.inputValido(scanner, "Ano de nascimento: ");
            int anoIngresso = VerificadorInput.inputValido(scanner, "Ano de ingresso na empresa: ");

            int idade = 2023 - anoNascimento;
            int tempoTrabalho = 2023 - anoIngresso;

            System.out.println("Idade do empregado: " + idade + " anos");
            System.out.println("Tempo de trabalho na empresa: " + tempoTrabalho + " anos");

            if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
                System.out.println("Requerer aposentadoria do " + codigoEmpregado);
            } else {
                System.out.println("Não requerer aposentadoria do " + codigoEmpregado);
            }

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida");
        }
    }
}
