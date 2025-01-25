import java.util.Scanner;

public class validandoData {
     public static void main(String[] args) {
          Scanner s = new Scanner (System.in);

          String data;

          System.out.println("Digite uma data no formato: (dd/mm/aaaa): ");
          data = s.nextLine();

          String mascaraData = "[0-3]\\d/[0-1][1-2]/\\d{4}"; 

          if(data.matches(mascaraData) == true){
               System.out.println("Data válida");
          } else {
               System.out.println("Data inválida");
          }
     }
}
