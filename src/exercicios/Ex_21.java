package exercicios;

import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_21 implements Exercicio {
    @Override
    public void executar() {
        System.out.println("21)Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os\n" +
                "minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é\n" +
                "de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte. ");

        try (Scanner scanner = new Scanner(System.in)) {
            int hInicio = VerificadorInput.inputValido(scanner, "Hora de início (24 horas): ");
            int hFim = VerificadorInput.inputValido(scanner, "Hora de fim (24 horas): ");

            int duracao;

            if (hFim > hInicio) {
                duracao = hFim - hInicio;
            } else {
                duracao = 24 - hInicio + hFim;
            }

            System.out.println("A duração do jogo: " + duracao + " horas.");
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida");
        }

    }

}