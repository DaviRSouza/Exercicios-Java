package dorColetiva;

public class Exerc02 {
    public static void main(String[] args) {
        System.out.println("2)Imprima os números ímpares de 1 a 10, usando continue para pular os números pares. ");
        for (int i = 1; i < 11; i++ ){
            if(i % 2 == 0){ continue; }
            System.out.print(i + " ");
        }
    }
}
