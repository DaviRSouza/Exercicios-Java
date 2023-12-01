package dorColetiva;

public class Exerc04 {
    public static void main(String[] args) {
        System.out.println("4)Crie um loop aninhado que imprima os números de 1 a 5 para cada iteração do loop externo, pulando a impressão do número 3 em cada iteração interna usando continue. ");
        for (int i = 1 ; i < 6 ; i++){
            System.out.print("Loop " + i + ": ");

            for (int j = 1; j < 6; j++){
                if (j == 3){ continue; }

                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
