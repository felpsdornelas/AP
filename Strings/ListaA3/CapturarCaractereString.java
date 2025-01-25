import java.util.Scanner;

public class CapturarCaractereString {

     static Scanner s = new Scanner(System.in);
     public static void main(String[] args) {
          
          String texto;

          System.out.println("Digite um texto: ");
          texto = s.nextLine();

          for(int i = 0; i<texto.length(); i++){
               System.out.println(i + " - " + texto.charAt(i));
          }
     }
}
