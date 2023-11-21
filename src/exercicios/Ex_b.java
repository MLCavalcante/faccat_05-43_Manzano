package exercicios;

public class Ex_b implements Exercicio {
    @Override
    public void executar() {

        System.out.println("b) Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100). ");
        int soma = 0;
        int i = 1;
        while (i <= 100) {
            soma += i;
            i++;
        }
        System.out.println("Total " + soma);
    }
}

