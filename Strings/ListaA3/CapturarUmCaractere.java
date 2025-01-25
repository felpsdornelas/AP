import java.util.Scanner;

public class CapturarUmCaractere {

     static Scanner s = new Scanner(System.in);

     public static void main(String[] args) {

          String texto;

          System.out.println("Digite um texto: ");
          texto = s.nextLine();

          // Variável responsável por pegar a última letra do texto;
          char ultimaLetra = texto.charAt(texto.length() - 1);

          if (texto.length() < 5) {
               System.out.println("invalida");

          } else if (texto.charAt(0) == ultimaLetra) {
               System.out.println("iguais");

          } else {
               System.out.println("diferentes");
          }
     }
}
