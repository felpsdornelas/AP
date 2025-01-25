import java.util.Scanner;

public class validarCnpj {
     public static void main(String[] args) {

          Scanner s = new Scanner (System.in);
          
          String cnpj;

          System.out.println("Digite o seu CNPJ: ");
          cnpj = s.nextLine();

          String mascaraCnpj = "^\\d{2}[.]\\d{3}[.]\\d{3}[/]\\d{4}[-]\\d{2}||\\d{14}$";
          if(cnpj.matches(mascaraCnpj) == true){
               System.out.println("CNPJ válido");
          } else {
               System.out.println("CNPJ inválido");
          }
     }
}
