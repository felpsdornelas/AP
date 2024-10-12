import java.util.Scanner;

public class REC05 {

     static Scanner s = new Scanner (System.in);
     public static void main(String[] args) {

          // Declaração de variáveis;
          int numeroN, numeroM, resultado;

          System.out.println("Digite o primero valor inteiro (N): ");
          numeroN =  s.nextInt();

          System.out.println("Digite o primero valor inteiro (M): ");
          numeroM =  s.nextInt();

          resultado = funcaoRecursiva(numeroN, numeroM);
          System.out.println("h(" + numeroN + "," +numeroM + ") = " + resultado);

     }

     public static int funcaoRecursiva(int numeroN, int numeroM){

          if(numeroN == 1){
               return numeroM + 1;

          }else if(numeroM == 1){
               return numeroN + 1;

          }else{
               return funcaoRecursiva(numeroN -1, numeroM) + funcaoRecursiva(numeroN, numeroM -1);
          }

     }
}
