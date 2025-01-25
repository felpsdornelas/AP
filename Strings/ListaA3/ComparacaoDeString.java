import java.util.Scanner;

public class ComparacaoDeString {     

     static Scanner s = new Scanner(System.in);

     public static void main(String[] args) {

          String texto1, texto2;

          System.out.println("Digite o primeiro texto");
          texto1 = s.next();

          System.out.println("Digite o segundo texto");
          texto2 = s.next();

          if (texto1.equals(texto2)) {
               System.out.println("correto");
          } else {
               System.out.println("incorreto");
          }
     }
}
