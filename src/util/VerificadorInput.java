package util;

import java.util.Scanner;

public class VerificadorInput {
    public static int inputValido(Scanner scanner, String msg) {
        int input = -1;

        do {
            try {
                System.out.println(msg);
                input = scanner.nextInt();
                if (input < 0) {
                    System.out.println("APENAS NÚMEROS POSITIVOS");
                    scanner.next();
                    input = -1;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Insira apenas números inteiros.");
                scanner.next();
                input = -1;
            }
        } while (input < 0);

        return input;
    }

    public static String inputTexto(Scanner scanner, String msg) {
        String input;

        do {
            System.out.println("APENAS TEXTO");
            System.out.println(msg);
            input = scanner.nextLine().trim();
        } while (!isValidTexto(input));

        return input;
    }

    private static boolean isValidTexto(String input) {
        return input.matches("[a-zA-Z ]+");
    }

}