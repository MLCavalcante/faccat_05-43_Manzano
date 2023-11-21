package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_14 implements Exercicio  {
    @Override
    public void executar() {
        System.out.println("14) Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso\n" +
                "contrário escrever NÃO É MAIOR QUE 10! ");

        try(Scanner scanner = new Scanner(System.in)){
            int valor = scanner.nextInt();

            if (valor > 10){
                System.out.println("É MAIOR QUE 10!");
            }
            System.out.println("NÃO É MAIOR QUE 10! ");


        }catch (InputMismatchException e){
            System.out.println("INVÁLIDO");

        }
    }
}
