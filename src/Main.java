import exercicios.*;
import util.VerificadorInput;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Escolha um exercício (5-43, 0 para sair): ");
                int escolha = VerificadorInput.inputValido(scanner, "Ex: ");

                if (escolha == 0) {
                    System.out.println("Saindo...");
                    break;
                }

                executarExercicio(escolha);

            }

        }catch (java.util.InputMismatchException e){
            System.out.println("apenas números inteiros");
        }



    }

    private static void executarExercicio(int escolha) {
        Exercicio exercicio = obterExercicio(escolha);

        if (exercicio != null) {
            exercicio.executar();
        } else {
            System.out.println("Escolha inválida. Tente novamente.");
        }
    }

    private static Map<Integer, Exercicio> exerciciosMap = new HashMap<>();

    static {
        exerciciosMap.put(7, new Ex_07());
        exerciciosMap.put(8, new Ex_08());
        exerciciosMap.put(9, new Ex_09());
        exerciciosMap.put(10, new Ex_10());
        exerciciosMap.put(11, new Ex_11());
        exerciciosMap.put(12, new Ex_12());
        exerciciosMap.put(13, new Ex_13());
        exerciciosMap.put(14, new Ex_14());
        exerciciosMap.put(15, new Ex_15());
        exerciciosMap.put(16, new Ex_16());
        exerciciosMap.put(17, new Ex_17());
        exerciciosMap.put(18, new Ex_18());
        exerciciosMap.put(19, new Ex_19());
        exerciciosMap.put(20, new Ex_20());
        exerciciosMap.put(21, new Ex_21());
        exerciciosMap.put(22, new Ex_22());
        exerciciosMap.put(23, new Ex_23());
        exerciciosMap.put(24, new Ex_24());
        exerciciosMap.put(25, new Ex_25());
        exerciciosMap.put(26, new Ex_26());
        exerciciosMap.put(27, new Ex_27());
        exerciciosMap.put(28, new Ex_28());
        exerciciosMap.put(29, new Ex_29());
        exerciciosMap.put(30, new Ex_30());
        exerciciosMap.put(31, new Ex_31());
        exerciciosMap.put(32, new Ex_32());
        exerciciosMap.put(33, new Ex_33());
        exerciciosMap.put(34, new Ex_34());
        exerciciosMap.put(35, new Ex_35());
        exerciciosMap.put(36, new Ex_36());
        exerciciosMap.put(37, new Ex_37());
        exerciciosMap.put(38, new Ex_38());
        exerciciosMap.put(39, new Ex_39());
        exerciciosMap.put(40, new Ex_40());
        exerciciosMap.put(41, new Ex_41());
        exerciciosMap.put(42, new Ex_42());
        exerciciosMap.put(43, new Ex_43());
        exerciciosMap.put(44, new Ex_a());
        exerciciosMap.put(45, new Ex_b());
        exerciciosMap.put(46, new Ex_c());
        exerciciosMap.put(47, new Ex_d());

    }

    private static Exercicio obterExercicio(int escolha) {
        return exerciciosMap.getOrDefault(escolha, null);
    }

}
