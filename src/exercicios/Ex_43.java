package exercicios;
import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_43 implements Exercicio {
    @Override
    public void executar() {
        System.out.println("43) Verificar se é possível formar um triângulo e classificá-lo.");

        try (Scanner scanner = new Scanner(System.in)) {
            int a = VerificadorInput.inputValido(scanner, "Lado A: ");
            int b = VerificadorInput.inputValido(scanner, "Lado B: ");
            int c = VerificadorInput.inputValido(scanner, "Lado C: ");

            String mensagem;

            if ((a < b + c) && (b < a + c) && (c < a + b)) {
                if (a == b && b == c) {
                    mensagem = "Triângulo Equilátero";
                } else if (a == b || b == c || a == c) {
                    mensagem = "Triângulo Isósceles";
                } else {
                    mensagem = "Triângulo Escaleno";
                }
            } else {
                mensagem = "Não é triangulo";
            }

            System.out.println(mensagem);

        } catch (InputMismatchException e) {
            System.out.println("INVALIDO");
        }
    }
}
