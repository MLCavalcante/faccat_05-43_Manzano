package exercicios;

import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_10 implements Exercicio {
    @Override
    public void executar() {
        System.out.println("10) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do\n" +
                "distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor\n" +
                "seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,\n" +
                "calcular e escrever o custo final ao consumidor. ");

        try(Scanner scanner = new Scanner(System.in)){

            double custoDeFabrica = VerificadorInput.inputValido(scanner, "CUSTO DE FÁBRICA: ");

            double custoFinal = calcularCustoFinal(custoDeFabrica);
            System.out.println("Custo Final ao Consumidor: " + custoFinal);
        }catch (InputMismatchException e){
            System.out.println("INVÁLIDO");
        }



    }

    private static double calcularCustoFinal(double custoFabrica) {

        double distribuidor = 0.28;

        double impostos = 0.45;

        double custoFinal = custoFabrica + (custoFabrica * distribuidor) + (custoFabrica * impostos);

        return custoFinal;
    }
}
