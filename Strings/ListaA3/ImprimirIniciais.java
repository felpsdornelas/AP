import java.util.Scanner;

public class ImprimirIniciais {

     static Scanner s = new Scanner (System.in);
     public static void main(String[] args) {
          
          String texto;

          System.out.println("Digite um texto: ");
          texto = s.nextLine();

          // Transformando a String em um Array, ou seja, dividindo por palavra.
          String [] partesTexto = texto.split(" ");     

          for (String palavra : partesTexto){
               if(palavra.length()> 3) {
                    System.out.println(palavra.substring(0, 3));
               }
          }          
     }
}
