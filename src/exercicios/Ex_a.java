package exercicios;

import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_a implements Exercicio {
    @Override
    public void executar() {

        System.out.println("a)");
        try (Scanner scanner = new Scanner(System.in)) {
            int num = VerificadorInput.inputValido(scanner, "Número: ");

            int i = 1;
            while (i <= 10) {
                int resultado = num * i;
                System.out.println(num + " x " + i + " = " + resultado);
                i++;
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalido");
        }
    }
}
