package exercicios;

import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_22 implements Exercicio {
    @Override
    public void executar() {
        System.out.println("22) A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais\n" +
                "de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.\n" +
                "Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva\n" +
                "o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas\n" +
                "(considere que o mês possua 4 semanas exatas)");

        try (Scanner scanner = new Scanner(System.in)) {
            int horasTrabalhadas = VerificadorInput.inputValido(scanner, "Horas trabalhadas no mês: ");
            double salarioPorHora = VerificadorInput.inputValido(scanner, "Salário por hora: ");

            double salarioTotal = horasTrabalhadas * salarioPorHora;
            System.out.println("Salário sem hora Extra " + salarioTotal);

            if (horasTrabalhadas > 40) {
                int horasExtras = horasTrabalhadas - 40;
                salarioTotal = (40 * salarioPorHora) + (horasExtras * salarioPorHora * 1.5);
                System.out.println("Salário + Hora extra " + salarioTotal);
            }
        } catch (InputMismatchException e) {
            System.out.println("Inválido");
        }
    }
}

