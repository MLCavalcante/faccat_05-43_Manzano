package exercicios;

import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_09 implements Exercicio{
    @Override
    public void executar() {
        System.out.println("9) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.\n" +
                "Calcular e escrever o valor do novo salário. ");

        try(Scanner scanner = new Scanner(System.in)){
            double salario = VerificadorInput.inputValido(scanner, "SALÁRIO: ");
            int reajuste =  VerificadorInput.inputValido(scanner, "REAJUSTE (%): ");

            double novoSalario = CalculaReajusteSalario(salario, reajuste);
            System.out.println("Novo Salário: " + novoSalario);
        }catch (InputMismatchException e){
            System.out.println("VALOR INVÁLIDO!");
        }



    }

    public static double CalculaReajusteSalario(double sal, int reajuste){
        double percentualDecimal = reajuste / 100.0;

        double valorReajuste = sal * percentualDecimal;

        double novoSalario = sal + valorReajuste;

        return novoSalario;


    }
}
