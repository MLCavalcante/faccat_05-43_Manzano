package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_15 implements Exercicio{
    @Override
    public void executar() {
        System.out.println("15) Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo). ");

        try (Scanner scanner = new Scanner(System.in)) {

            int valor = scanner.nextInt();
            if (valor < 0 ) {
                System.out.println("negativo");
            }else {
                System.out.println("positivo");
            }
        }catch (InputMismatchException e){
            System.out.println("INVÁLIDO");

        }
    }
}
