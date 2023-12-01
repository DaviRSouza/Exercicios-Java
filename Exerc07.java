package dorColetiva;

public class Exerc07 {
    public static void main(String[] args) {
        System.out.println("7)Use um loop para iterar sobre os números de 1 a 5. Pare o loop quando encontrar o número 3. Use switch para imprimir uma mensagem diferente para cada número. ");

        for (int i = 1; i < 6; i++){
            if (i == 3) { break; }

            switch (i){
                case 1:
                    System.out.println("Mensagem para o numero 1");
                    break;
                case 2:
                    System.out.println("Mensagem para o numero 2");
                    break;
                case 3:
                    System.out.println("Mensagem para o numero 3");
                    break;
                case 4:
                    System.out.println("Mensagem para o numero 4");
                    break;
                case 5:
                    System.out.println("Mensagem para o numero 5");
                    break;
            }

        }
    }
}
