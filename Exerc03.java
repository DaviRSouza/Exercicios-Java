package dorColetiva;

public class Exerc03 {
    public static void main(String[] args) {
        System.out.println("3)Crie um loop aninhado que imprima os números de 1 a 5 para cada iteração do loop externo. Use break para interromper o loop interno quando o número 3 for atingido. ");
        for (int i = 1; i < 6; i++) {
            System.out.print("Loop " + i + ": ");

            for (int j = 1; j < 6; j++) {
                System.out.print(j + " ");
                if (j == 3) { break; }
            }
            System.out.println();
        }

    }
}
