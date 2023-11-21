package exercicios;

public class Ex_c implements Exercicio {
    @Override
    public void executar() {
        System.out.println("c) Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de\n" +
                "1 até 500. ");
        int somaPares = 0;
        int i = 1;
        while (i <= 500) {
            if (i % 2 == 0) {
                somaPares += i;
            }
            i++;
        }
        System.out.println("Soma pares de 1 a 500: " + somaPares);
    }
}
