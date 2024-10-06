import java.util.Scanner;

public class QuadradoPares {

     static Scanner s = new Scanner (System.in);
     public static void main(String[] args) {

     // Solicita ao usuário o valor de entrada, que será o número final do cálculo; 
     System.out.println("Digite um valor de entrada: ");
     int  valorEntrada = s.nextInt();
     
     // Se o número for ímpar, diminua 1 para que o número vire par;
     if(valorEntrada % 2 != 0 ){
          valorEntrada --;
     }

     // Chama a função que realiza o cálculo; 
     calcularQuadradoPares(valorEntrada);

     }
     // Função de recursividade, substituindo o for;
     public static void calcularQuadradoPares(int contador){

          int SomaQuadradoPares; 

          if(contador == 0){
               return;
          }else{               
               SomaQuadradoPares = contador * contador; 
               calcularQuadradoPares(contador - 2);
          }
          
          System.out.println(contador + "^2 = " + SomaQuadradoPares);
     }
}
