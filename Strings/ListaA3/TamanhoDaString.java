import java.util.Scanner;

     public class TamanhoDaString {

     static Scanner s = new Scanner(System.in);
     public static void main(String[] args) {
          
          String texto;

          System.out.println("Digite um texto: ");
          texto = s.nextLine();

          if(texto.length() <= 10){
               System.out.println("pequeno");
          }else{
               System.out.println("grande");
          }
     }
}
