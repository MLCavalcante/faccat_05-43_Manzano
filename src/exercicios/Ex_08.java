package exercicios;

/*
8) Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
de eleitores.
*/

import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_08 implements Exercicio {
    @Override
    public void executar() {
        try(Scanner scanner = new Scanner(System.in)) {
            int total = VerificadorInput.inputValido(scanner, "TOTAL: ");
            int brancos = VerificadorInput.inputValido(scanner, "BRANCOS: ");
            int nulos = VerificadorInput.inputValido(scanner, "NULOS: ");
            int validos = VerificadorInput.inputValido(scanner, "VÁLIDOS: ");

            CalculaPercentuaisVotos(total, brancos, nulos, validos);


        }catch (InputMismatchException e){
            System.out.println("VALOR INVÁLIDO");
        }

    }

    public static void  CalculaPercentuaisVotos(int total, int brancos, int nulos, int validos){
        double pBrancos = ((double) brancos / total) * 100.0;
        double pNulos = ((double) nulos / total) * 100.0;
        double pValidos = ((double) validos / total) * 100.0;

        System.out.println("Brancos: " + pBrancos + "%");
        System.out.println("Nulos: " + pNulos + "%");
        System.out.println("Válidos: " + pValidos + "%");
    }
}
