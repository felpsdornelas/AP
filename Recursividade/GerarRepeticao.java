import java.util.Scanner;

public class GerarRepeticao {

     static Scanner s = new Scanner (System.in);
     public static void main(String[] args) {

          int numeroRepeticao, qntRepeticao;
          
          System.out.println("Digite o número que você quer que repita: ");
          numeroRepeticao = s.nextInt(); 
          System.out.println("Digite a quatidade de repetições: ");
          qntRepeticao = s.nextInt(); 

          repetirNumeros(numeroRepeticao, qntRepeticao);
     }

     public static void repetirNumeros (int numeroRepeticao, int qntRepeticao){

          if(qntRepeticao == 0){
               return; 
          }else{
               System.out.print(numeroRepeticao);
               if(qntRepeticao > 1 ){
                    System.out.print("-");
               }
               repetirNumeros(numeroRepeticao, qntRepeticao - 1);
          }
     }
}
