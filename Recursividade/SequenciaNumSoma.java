import java.util.Scanner;

public class SequenciaNumSoma {

     static Scanner s = new Scanner(System.in);
      public static void main(String[] args) {

        while (true) {
            // Lê os valores de M e N
            int M = s.nextInt();
            int N = s.nextInt();

            // Verifica se algum dos valores é menor ou igual a zero
            if (M <= 0 || N <= 0) {
                break;
            }

            // Determina o menor e o maior entre M e N
            int menor = Math.min(M, N);
            int maior = Math.max(M, N);
            int soma = 0;

            // Imprime a sequência do menor até o maior e calcula a soma
            for (int i = menor; i <= maior; i++) {
                System.out.print(i + " ");
                soma += i;
            }

            // Exibe a soma total da sequência
            System.out.println("Sum=" + soma);
        }
    }
}
