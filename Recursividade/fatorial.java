import java.util.Scanner;

public class fatorial {

     static Scanner s = new Scanner(System.in);
     public static void main(String[] args) {
          int numero;

          System.out.println("Digite o valor de um número: ");
          numero = s.nextInt(); 

          int resultado = calcularFatorial(numero); 
          System.out.println("O fatorial de " + numero + " é " + resultado + ".");

     }

     public static int calcularFatorial (int numero){

          if(numero == 0 || numero == 1){
               return 1;
          }
          return numero * calcularFatorial(numero-1);

     }
}
