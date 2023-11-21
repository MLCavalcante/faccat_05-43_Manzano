package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

import util.VerificadorInput;

/*
7) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
*/

public class Ex_07 implements Exercicio {
    @Override
    public void executar() {
    try (Scanner scanner = new Scanner(System.in)){
        System.out.println("7) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade\n" +
                "dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.");

        int anos = VerificadorInput.inputValido(scanner, "Anos:");
        int meses = VerificadorInput.inputValido(scanner, "Meses:");
        int dias = VerificadorInput.inputValido(scanner, "Dias:");

        int diasDeIdade = Calcular(anos, meses,dias);

        System.out.println("Dias de vida: "+ diasDeIdade);
    }catch (InputMismatchException e){
        System.out.println("Input inválido, insira apenas números!");
    }
}

    public int Calcular(int anos, int meses, int dias) {
        return (anos * 365) + (meses * 30) + dias;
    }
}

