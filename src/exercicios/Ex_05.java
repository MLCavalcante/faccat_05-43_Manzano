package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
5) Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.
*/

public class Ex_05 {
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Insira um valor:");
            Double input = scanner.nextDouble();
            if (input > 0) {
                System.out.print("O antecessor é: " + --input);
            } else {
                System.out.print("O antecessor é: " + ++input);
            }
        }catch (InputMismatchException e) {
            System.out.println("Input inválido, insira apenas números");
        }
    }
}
