     import java.util.Scanner;

public class SeisNumerosImpares {

     static Scanner s = new Scanner(System.in);
     public static void main(String[] args) {

          System.out.println("Digite um número inteiro positivo:");
          int numero = s.nextInt();

          if(numero % 2 == 0){ // se o número digitado pelo usuário for par, torna-o ímpar;  
               numero ++;
          }

          somarImpares(numero, 6);
     }

     public static void somarImpares (int numero, int contador){

          if(contador == 0){
               return;
          }
               System.out.println(numero);
               somarImpares (numero + 2, contador - 1);
     }
}