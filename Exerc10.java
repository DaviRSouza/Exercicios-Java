package dorColetiva;

import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        int[] array = new int[100];
        System.out.println("10)Dado um array de números inteiros, imprima cada número até encontrar um número negativo. Use break para interromper o loop nesse ponto. ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Dados digitados irão ser guardados em um array, digite um numero negativo para interromper");
        for (int i = 0 ; i <= array.length ; i++){
            System.out.println("posição "+ i + " do array");
            System.out.print("Informe um numero para ser salvo: ");
            int numero = sc.nextInt();
            System.out.println();
            if (numero < 0){ break; }
        }
    }
}
