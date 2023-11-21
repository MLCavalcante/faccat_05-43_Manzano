package exercicios;

public class Ex_39 implements Exercicio{
    @Override
    public void executar() {

        System.out.println("a) (A e B) ou (A xor B)\n" +
                "   = (V e V) ou (V xor V)\n" +
                "   = V ou V\n" +
                "   = V\n" +
                "\n" +
                "b) (A ou B) e (A e C)\n" +
                "   = (V ou V) e (V e F)\n" +
                "   = V e F\n" +
                "   = F\n" +
                "\n" +
                "c) A ou C e B xor A e não B\n" +
                "   = V ou F e V xor V e F\n" +
                "   = V ou F e V xor F\n" +
                "   = V ou F e V\n" +
                "   = V\n");

    }
}
