package dorColetiva;

public class Exerc08 {
    public static void main(String[] args) {
        System.out.println("8)Imprima os números de 1 a 10, pulando a impressão do número 5 e interrompendo o loop quando encontrar o número 8. ");

        for (int i = 1; i < 11; i++){
            if (i == 5) { continue; }
            if (i == 8) { break; }

            System.out.print(i + " ");
        }
    }
}
