import java.util.Scanner;

public class SomarImpares {

     static Scanner s = new Scanner(System.in);

     public static void main(String[] args) {

          int numero;
          System.out.println("Digite um número: ");
          numero = s.nextInt();

          somarImpares(numero, 1, 0);
     }

     // Função criada para somar números impares de acordo com o número do usuário;
     public static void somarImpares(int numero, int numeroImpar, int soma) {

          if (numeroImpar > numero) {
               System.out.println(" = " + soma);
          } else {
               if (numeroImpar % 2 != 0) { // Verifica se o número é ímpar;
                    if (soma == 0) {
                         System.out.print(numeroImpar);
                    } else {
                         System.out.print(" + " + numeroImpar);
                    }
                    soma += numeroImpar;
               }
               somarImpares(numero, numeroImpar + 1, soma);
          }
     }
}
