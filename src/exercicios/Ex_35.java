package exercicios;

import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_35 implements Exercicio {
    @Override
    public void executar() {
        System.out.println("35) Um posto está vendendo combustíveis com a seguinte tabela de descontos:");
        System.out.println("até 20 litros, desconto de 3% por litro Álcool");
        System.out.println("acima de 20 litros, desconto de 5% por litro");
        System.out.println("até 20 litros, desconto de 4% por litro Gasolina");
        System.out.println("acima de 20 litros, desconto de 6% por litro");

        try (Scanner scanner = new Scanner(System.in)) {
            int litros = VerificadorInput.inputValido(scanner, "Número de litros vendidos: ");
            char tipoCombustivel = VerificadorInput.inputTexto(scanner, "Tipo de combustível (A-álcool, G-gasolina): ").charAt(0);

            double precoLitroAlcool = 2.90;
            double precoLitroGasolina = 3.30;
            double desconto;

            if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
                desconto = (litros <= 20) ? 0.03 : 0.05;
                double valorPagar = litros * (precoLitroAlcool - (precoLitroAlcool * desconto));
                System.out.println("Valor a ser pago: R$ " + valorPagar);
            } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
                desconto = (litros <= 20) ? 0.04 : 0.06;
                double valorPagar = litros * (precoLitroGasolina - (precoLitroGasolina * desconto));
                System.out.println("Valor a ser pago: R$ " + valorPagar);
            } else {
                System.out.println("inválido!");
            }

        } catch (InputMismatchException e) {
            System.out.println("entrada inválida!");
        }
    }
}
