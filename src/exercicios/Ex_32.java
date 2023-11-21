package exercicios;

import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_32 implements Exercicio {
    @Override
    public void executar() {
        System.out.println("32) Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.");

        try (Scanner scanner = new Scanner(System.in)) {
            String time1 = VerificadorInput.inputTexto(scanner, "Nome do Time 1: ");
            int golsTime1 = VerificadorInput.inputValido(scanner, "Gols do Time 1: ");

            String time2 = VerificadorInput.inputTexto(scanner, "Nome do Time 2: ");
            int golsTime2 = VerificadorInput.inputValido(scanner, "Gols do Time 2: ");

            if (golsTime1 > golsTime2) {
                System.out.println("Vencedor: " + time1);
            } else if (golsTime2 > golsTime1) {
                System.out.println("Vencedor: " + time2);
            } else {
                System.out.println("EMPATE");
            }

        } catch (InputMismatchException e) {
            System.out.println("entrada inválida.");
        }
    }
}
