package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
6) Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a
área do retângulo.
*/
public class Ex_06 {
    public static void main( String[] args){
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("BASE(b): ");
            Double b = scanner.nextDouble();
            System.out.println("ALTURA(h): ");
            Double h = scanner.nextDouble();

            Double A = (b * h);
            System.out.println("ÁREA:" + A);


        }catch (InputMismatchException e){
            System.out.println("Input inválido, insira apenas números");
        }

    }
}

