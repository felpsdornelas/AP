import java.util.Scanner;

public class restoDois {

     static Scanner s = new Scanner(System.in);
     public static void main(String[] args) {
          
          int numero; 

          System.out.println("Digite um número: ");
          numero = s.nextInt();

          imprimirResto(numero, 0);
          
     }

     public static void imprimirResto(int numero, int contador){

          if(contador > 10000){
               return; 

          }

          if (contador % numero == 2) {
               System.out.println(contador);

          }

          imprimirResto(numero, contador + 1);
     }
}
