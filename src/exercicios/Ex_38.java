package exercicios;

import util.VerificadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_38 implements Exercicio {
    @Override
    public void executar() {
        System.out.println("38) Faça um algoritmo para ler um número que é um código de usuário.");
        System.out.println("Caso este código seja diferente de um código armazenado internamente no algoritmo (igual a 1111),");
        System.out.println("deve ser apresentada a mensagem ‘Usuário inválido!’. Caso o código seja correto,");
        System.out.println("deve ser lido outro valor que é a senha. Se esta senha estiver incorreta (a certa é 2222),");
        System.out.println("deve ser mostrada a mensagem ‘Senha incorreta’. Caso a senha esteja correta,");
        System.out.println("deve ser mostrada a mensagem ‘Acesso permitido’.");

        try (Scanner scanner = new Scanner(System.in)) {
            int codigoUsuario = VerificadorInput.inputValido(scanner, "Código de usuário: ");

            if (codigoUsuario != 1111) {
                System.out.println("Usuário inválido!");
            } else {
                int senha = VerificadorInput.inputValido(scanner, "Senha: ");
                if (senha != 2222) {
                    System.out.println("Senha incorreta");
                } else {
                    System.out.println("Acesso permitido");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Entrada Inválida");
        }
    }
}
