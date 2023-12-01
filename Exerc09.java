package dorColetiva;

import java.util.Scanner;

public class Exerc09 {
    public static void main(String[] args) {
        System.out.println("9)Crie um loop infinito que solicita ao usuário um número. Pare o loop quando o número 0 for inserido. ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Esse algoritimo so ira parar quando o numero 0(zero) for digitado");
        for (int i = 1 ; ; i++){
            System.out.print(i + ") informe um numero: ");
            int numero = sc.nextInt();
            System.out.println();
            if (numero == 0){ break; }
        }
    }
}