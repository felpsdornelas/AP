import java.util.Scanner;

public class ValidandoEmail {
     public static void main(String[] args) {

          Scanner s = new Scanner (System.in);
          
          System.out.println("Digite seu e-mail");
          String email = s.nextLine();

          String mascaraEmail = "^[a-zA-Z0-9._-]+[@][a-zA-Z0-9.]+[.][a-zA-Z]{2,6}$";          
          
          if(email.matches(mascaraEmail) == true){
               System.out.println("Email válido");
          } else {
               System.out.println("Email inválido");
          }
     }
}
