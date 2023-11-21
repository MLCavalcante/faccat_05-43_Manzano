package exercicios;
import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_12 implements Exercicio {
    @Override
    public void executar() {
        System.out.println("12) Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus Celsius.");

        try (Scanner scanner = new Scanner(System.in)) {
            double temperaturaF = VerificadorInput.inputValido(scanner, "Temperatura em Fahrenheit: ");
            double temperaturaC = converterFahrenheitParaCelsius(temperaturaF);
            System.out.println("Temperatura em Celsius: " + temperaturaC);
        } catch (InputMismatchException e) {
            System.out.println("VALOR INVÁLIDO!");
        }
    }

    private static double converterFahrenheitParaCelsius(double temperaturaF) {
        return (temperaturaF - 32) * 5/9;
    }
}
