import java.util.Scanner;

public class fibonacci {
     static Scanner s = new Scanner(System.in);

     public static void main(String[] args) {

          int casosTestes;

          System.out.println("Digite a quantidade de casos testes:");
          casosTestes = s.nextInt();

          for (int i = 0; i < casosTestes; i++) {
               System.out.println("Digite um número para caucular o fibonacci");
          }

     }

     public static int calcularFibonacci(int numero) {

          if (numero == 0) {
               return 0;

          } else if (numero == 1) {
               return 1;

          } else {
               

          }

          return numero;

     }

}
